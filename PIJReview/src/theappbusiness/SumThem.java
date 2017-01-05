package theappbusiness;

import java.util.Scanner;

public class SumThem {

	public static void main(String[] args) {
		
		int [] test1= {12,12};
		
		int [] test2 = {1,2,3,4,5};
		
		int [] test3 ={5};
		
		System.out.println(summation(test3));
		
		// TODO Auto-generated method stub

	}
	
	static int summation(int[]numbers){
		int result =0;
		for (int i=0;i<numbers.length;i++){
			result+=numbers[i];
		}
		return result;
	}

}
