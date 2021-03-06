package theappbusiness;

import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class ScriptTest {
	
	private Map<Character,Character> chars = new HashMap();

	public static void main(String[] args) {
		
		System.out.println("Ale tonto");
		
		String input = "{}()";
		String input2 = "({()})";
		String input3 = "{}(";
		String input4 = "[]";
		ScriptTest st = new ScriptTest();
		st.loadMapSymbols();
		System.out.println(st.evaluate(input4));
		
		
	}
	
	public void loadMapSymbols(){
		chars.put('{','}');
		chars.put('[',']');
		chars.put('(', ')');
	}
	
	public boolean evaluate (String input){
		Stack<Character> stack = new Stack();
		for (int i=0;i<input.length();i++){
			 Character temp = new Character(input.charAt(i));
			 if (stack.empty()){
				 stack.push(chars.get(temp));
			 }
			 else {
				 if (temp.equals(stack.peek())){ 
					 stack.pop();
				 }
				 else {
					 stack.push(chars.get(temp));	 
				 }
			 }
		}
		return stack.isEmpty();
	}
	
	
	

}
