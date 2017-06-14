package theappbusiness.algo.plusminus;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int [n];
		for (int arr_i=0;arr_i < n ; arr_i++){
			arr[arr_i]= in.nextInt();
		}
		print(getMix(arr));
		
		
		int [] test1 = {-4,3,-9,0,4,1};
		tester(1,"0.500000 0.333333 0.166667",test1);
		int [] test2 = {-4,-3,-9,-1,-4,-1};
		tester(1,"0.000000 1.000000 0.000000",test2);
	
	}
	
	private static String getMix(int[] values){
		String result ="";
		if (values.length==0){
			return result;
		}
		double posi=0;
		double nega=0;
		double zeros=0;
		for (int i=0;i<values.length;i++){
			if (values[i]>0){
				posi++;
			}
			else if (values[i]<0){
				nega++;
			}
			else if (values[i]==0) {
				zeros++;
			}
		}
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(6);
		nf.setMaximumFractionDigits(6);
		nf.setRoundingMode(RoundingMode.HALF_UP);
		double posiFract=posi/values.length;
		result+=nf.format(posiFract);
		double negaFract=nega/values.length;
		result+=" "+nf.format(negaFract);
		double zerosFract=zeros/values.length;
		result+=" "+nf.format(zerosFract);
		return result;
	}
	
	private static void print(String mix){
		String[] values  = mix.split(" ");
		for (int i=0;i<values.length;i++){
			System.out.println(values[i]);
		}
	}
	
	private static void tester(int testID, String expected, int[] input){
		if(!expected.equals(getMix(input))){
			System.out.print("Failed test "+ testID);
			System.out.println(" Expected :" +expected);
			System.out.println(" Actual :" +getMix(input));
		}
	}

}
