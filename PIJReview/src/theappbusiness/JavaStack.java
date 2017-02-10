package theappbusiness;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		
		JavaStack js = new JavaStack();
		js.loadMap();
		js.runTest("{}",true,1);
		js.runTest("[]",true,2);
		js.runTest("[]{",false,3);
		js.runTest("(){}",true,4);
		js.runTest("({})",true,5);
		js.runTest("({}",false,6);
		js.runTest("}{",false,7);
		js.runTest("[[",false,8);
		js.runTest("[]{[]",false,9);
		js.runTest("{}(",false,10);
		js.runTest("({[]})",true,11);
		js.runTest("([{}])",true,12);
		js.runTest("({()})",true,13);
		

	}
	
	private Map<Character,Character> map =new HashMap();
	
	private void loadMap(){
		map.put('{','}');
		map.put('(',')');
		map.put('[',']');
	}

	private boolean evaluate (String input){
		Stack<Character> stack = new Stack();
		for (int i=0;i<input.length();i++){
			Character temp = input.charAt(i);
			if (stack.isEmpty()){
				stack.push(map.get(temp));
			}
			else {
				if (temp.equals(stack.peek())){
					stack.pop();
				}
				else{
					stack.push(map.get(temp));
				}
			}
		}
		return stack.isEmpty();
	}
	
	
	public void runTest(String input,Boolean result,int testref){
		if (evaluate(input)==result){
			System.out.println("Passed test " +testref);
		}
		else {
			System.out.println("Failed test " +testref);
		}
	}
	
}
