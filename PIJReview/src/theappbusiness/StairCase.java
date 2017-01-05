package theappbusiness;

public class StairCase {

	public static void main(String[] args) {
		StairCase(7);
	}

	static void StairCase(int n){
		helper(first(n),n,0);	
	}
	
	static void helper(String input,int target,int count){
		if (count<target){
			input=input.substring(1)+"#";
			System.out.println(input);
			helper(input,target,count+1);
		}
	}
	
	static String first(int target){
		String result ="";
		for (int i=0;i<target;i++){
			result+=" ";
		}
		return result;
	}
	
}
