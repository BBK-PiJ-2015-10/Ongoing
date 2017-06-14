package theappbusiness.algo;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class NonDevisibleSubSet {
	
	public static void main (String [] args){
		
		int val = 5 % 3;
		System.out.println(val);
		
		/*
		
		final Scanner in = new Scanner(System.in);
		
		final int n = in.nextInt();
		final int k = in.nextInt();
		
		// Idea is to divide all numbers of set by k and put these to a Map with:
		// 		-	key as remainder of input number and k
		//		-	value as count of input numbers having remainder same as key
		// If we have numbers with remainders as 0 then we will consider only one of those as 
		// subset with one number complies with subset criteria.
		final Map<Integer, Integer> remainders = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int remainder = in.nextInt() % k;
			remainders.compute(remainder, (key, value) -> (value == null || key == 0) ? 1 : (value + 1));
		}
		
		// Iterate through all the unique pair of combinations for k and take maximum of numbers count 
		// having remainder same as numbers in combination pair.
		// E.g. 5 has unique combinations - (1,4),(2,3). We will take maximum count out of 1 and 4 and 
		// similarly out of 2 and 3. We will consider one number out of 0 remainders if any.
		int noOfElementsInSubset = remainders.getOrDefault(0, 0);
		int i = 1;
		for(; 2 * i < k; i++) {
			noOfElementsInSubset += Math.max(remainders.getOrDefault(i, 0), remainders.getOrDefault(k - i, 0));
		}
		
		// For even numbers, we will have combination having same numbers. E.g. 6 will have a combination - (3,3). 
		// For this, we will just consider only one number.
		if(2 * i == k) {
			noOfElementsInSubset++;
		}
		
		System.out.println(noOfElementsInSubset);
		
		in.close();
		
		*/
		
	//}
		
		
		/*
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int [] values = new int[size];
		int divisor = in.nextInt();
		for (int k=0;k<size;k++){
			values[k]=in.nextInt();
		}
		
		System.out.println(maxSubSet(values,divisor));
		
		*/
		
		//int [] test1 = {1,2,3,4,5};
		
		//System.out.println(maxSubSet(test1,6));
		

	}
	
	private static int maxSubSet(int[] values, int divisor){
		int maxGlobal=0;
		if (values.length<2){
			return maxGlobal;
		}
		Set<Set<Integer>> tracker = new HashSet();
		for (int i=0;i<values.length;i++){
			Integer value = values[i];
			for (Set<Integer> keySet : tracker){
				int localCount=0;
				for (Integer key: keySet){
					int sum=key+value;
					if (sum % divisor != 0){
						localCount++;
					}
					else {
						break;
					}
				}
				if (keySet.size()==localCount){
					keySet.add(value);
					if(keySet.size()>maxGlobal){
						maxGlobal=keySet.size();
					}
				}
			}
			Set<Integer> localSet = new HashSet();
			localSet.add(value);
			tracker.add(localSet);
			System.out.println(tracker);
		}
		return maxGlobal;
	}

}
