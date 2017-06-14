package theappbusiness.algo.pickingnumbers;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Implementation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
		
      
		Implementation imp = new Implementation();
		
		int [] test1 = {4,6,5,3,3,1};
		System.out.println(imp.picking(test1));
		
		int [] test2 = {1,2,2,3,1,2};
		System.out.println(imp.picking(test2));
		
		

	}
	

	
	
	private int picking(int[] values){
		int maxCount=0;
		Map<Pair,Integer> tracker = new HashMap();
		for (int i=0;i<values.length;i++){
			int value = values[i];
			Pair temp1 = new Pair(value-1,value);
			Pair temp2 = new Pair(value,value+1);
			if (!tracker.containsKey(temp1)){
				tracker.put(temp1,1);
			}
			else {
				int currentVal = tracker.get(temp1);
				tracker.put(temp1,currentVal+1);
			}
			if (tracker.get(temp1)>maxCount){
				maxCount=tracker.get(temp1);
			}
			
			if (!tracker.containsKey(temp2)){
				tracker.put(temp2,1);
			}
			else {
				int currentVal2 = tracker.get(temp2);
				tracker.put(temp2,currentVal2+1);
			}
			if (tracker.get(temp2)>maxCount){
				maxCount=tracker.get(temp2);
			}
		}
		return maxCount;
	}
	

	public class Pair {
		
		int lower;
		
		int higher;
			
		Pair(int aLower, int aHigher){
			lower=aLower;
			higher=aHigher;
		}
		
		@Override
		public int hashCode(){
			int h1 = new Integer(lower).hashCode();
			int h2 = new Integer(higher).hashCode();
			final int HASH_MULTIPLIER= 29;
			int h = HASH_MULTIPLIER * h1 + h2;
			return h;
		}
		
		@Override
		public boolean equals(Object otherObject){
			if (otherObject==null) return false;
			if (getClass() != otherObject.getClass()) return false;
			Pair otherPair = (Pair) otherObject;
			return (otherPair.lower==lower  && otherPair.higher==higher);
		}
		
		@Override
		public String toString(){
			return "lower :" +lower + " hither :" +higher; 
		}
	
	}

}
