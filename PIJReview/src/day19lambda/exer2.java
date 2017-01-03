package day19lambda;

import java.util.Arrays;

public class exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = {"girafa","biruta","donckey","ranocchio","elena"};
		
		eChecker("ale","tonto");
		
		Arrays.sort(words,(w1,w2)->eChecker(w1,w2));
		System.out.println("Based on the e occurrence " +Arrays.asList(words));
	
		
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
