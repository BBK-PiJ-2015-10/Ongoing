package theappbusiness.algo.searching;

import static java.lang.Math.abs;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Pairs {

	
	public static void main (String[] args) {
		
		/*
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int [] input = new int[size];
		int diff = in.nextInt();
		for (int count=0;count<size;count++){
			input[count]=in.nextInt();
		}
		
		*/
		
		//System.out.println(getPairs(input,diff));

		
		//System.out.println("TOnto");
		
		int[] test1 = {1,5,3,4,2};
		tester(1,3,test1,2);	
		int[] test2 = {1,1,1,1,1};
		tester(2,10,test2,0);
		
		
	}
	
	
	private static int getPairsSecond(int[] values, int target){
		int result=0;
		for (int i=0;i<values.length;i++){
			for (int k=i+1;k<values.length;k++){
				int delta=Math.abs(values[i]-values[k]);
				if (delta==target){
					result++;
				}
			}
		}
		return result;
	}
	
	private static int getPairs(int[] values, int target){
		int count=0;
		Map<Integer,Integer> tracker = new HashMap();
		for (int i=0;i<values.length;i++){
			int value=values[i];
			if (tracker.containsKey(value)){
				count=count+tracker.get(value);
			}
			int lower=value-target;
			if (tracker.containsKey(lower)){
				int currentCount=tracker.get(lower);
				tracker.put(lower,currentCount+1);
			}
			else {
				tracker.put(lower,1);
			}
			int higher=value+target;
			if (higher!=lower){
				if (tracker.containsKey(higher)){
					int currentCount=tracker.get(higher);
					tracker.put(higher,currentCount+1);
				}
				else {
					tracker.put(higher,1);
				}
			}
		}
		return count;
	}
	
	
	
	private static void tester(int testID, int expected, int[] input, int diff){
		int actual = getPairs(input,diff);
		if (expected!=actual){
			System.out.print("Failed test: " +testID);
			System.out.println("Expected: " +expected);
			System.out.println("Calculated: " +actual);
		}
		else {
			System.out.println("Passed test: "+testID);
		}
	}
	

	
	
}
	

