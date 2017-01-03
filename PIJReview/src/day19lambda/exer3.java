package day19lambda;

public class exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test1 = "ale";
		String test2 = "biruta";
		
		//System.out.println(betterString(test1,test2,(n1,n2) ->n1.length()>n2.length()));
		
		System.out.println(betterString(test1,test2,(n1,n2)->true));
		

	}
	
	public static String betterString(String str1, String str2, TwoStringPredicate tester){
		return (tester.better(str1, str2) ? str1 : str2);
	}
	
	public static int eChecker(String input1, String input2) {
		int result = 0;
		if (input1.contains("e") && !input2.contains("e")){
			result = -1;
		}
		else if (!input1.contains("e") && input2.contains("e"))
			result =1;
		return result;
	}

}
