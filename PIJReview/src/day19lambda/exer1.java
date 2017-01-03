package day19lambda;

import java.util.Arrays;

public class exer1 {

	public static void main(String[] args) {
		
	String[] stringArray = {"ale","tonto","bibio","tesorino","marineta","biruta"};
	//System.out.println("Original array " +Arrays.asList(stringArray));
		
	Arrays.sort(stringArray,(n1,n2)->n1.length()-n2.length());
	//Arrays.sort(stringArray,(a,b)->a.compareTo(b));
	//System.out.println("In ascending order " +Arrays.asList(stringArray));
	
	Arrays.sort(stringArray,(n1,n2)->n2.length()-n1.length());
	//System.out.println("In descending order " +Arrays.asList(stringArray));
	
	Arrays.sort(stringArray,(n1,n2)->n1.charAt(0)-n2.charAt(0));
	System.out.println("In ascending order based on first character " +Arrays.asList(stringArray));
	
	Arrays.sort(stringArray,(n1,n2)-> {
		int compareFlag =0;
		if (n1.contains("e") && !n2.contains("e")){
			compareFlag = -1;
		} else if (!n1.contains("e") && n2.contains("e")){
			compareFlag = 1;
		}
		return compareFlag;
	});
	System.out.println("Based on the e occurrence " +Arrays.asList(stringArray));
	
			
	}

}
