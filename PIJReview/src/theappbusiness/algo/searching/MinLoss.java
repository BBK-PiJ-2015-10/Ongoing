package theappbusiness.algo.searching;

import java.util.Scanner;

public class MinLoss {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int arraySize = in.nextInt();
		int [] input = new int[arraySize];
		for (int i=0;i<arraySize;i++){
			input[i]=in.nextInt();
		}
		System.out.println(minLoss(input));
		

	}
	
	public void run(){
		
		int[] test1 = {5,10,3};
		int[] test2 = {20,7,8,2,5};
		
		System.out.println(minLoss(test2));
		
	}
	
	private static int minLoss(int[] values){
		int minLoss=Integer.MAX_VALUE;
		for (int i=1;i<values.length;i++){
			for (int k=0;k<i;k++){
				if (values[k]>values[i]){
					if((values[k]-values[i])<minLoss){
						minLoss=values[k]-values[i];
					}
				}
			}
		}
		return minLoss;
	}
}
