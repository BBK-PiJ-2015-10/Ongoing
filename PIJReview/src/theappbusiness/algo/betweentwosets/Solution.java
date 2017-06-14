package theappbusiness.algo.betweentwosets;

public class Solution {

	public static void main(String[] args) {
	

		
		int[] t1s1 = {2,4};
		int[] t1s2 = {16,32,46};
		tester(1,t1s1,t1s2,3);
		int[] t2s1 = {2,18};
		int[] t2s2 = {16,32,46};
		tester(2,t2s1,t2s2,0);
		int[] t3s1 = {2,2};
		int[] t3s2 = {2,2,2};
		tester(3,t3s1,t3s2,1);
		int[] t4s1 = {2,4};
		int[] t4s2 = {2,4,8};
		tester(4,t4s1,t4s2,0);
		int[] t5s1 = {2,3};
		int[] t5s2 = {5,6,0};
		tester(5,t5s1,t5s2,0);
		int[] t6s1 = {2};
		int[] t6s2 = {4};
		tester(6,t6s1,t6s2,2);
	
	}
	
	private static int max(int[] values){
		int max = values[0];
		for (int i=1;i<values.length;i++){
			if (values[i]>max){
				max=values[i];
			}
		}
		return max;
	}
	
	private static int min(int[] values){
		int min = values[0];
		for (int i=1;i<values.length;i++){
			if (values[i]<min){
				min=values[i];
			}
		}
		return min;
	}
	
	private static int between(int low, int high, int cum){
		int mod = high % low;
		if (low>high | (mod !=0)){
			return cum;
		}
		return between(low*2,high,cum+1);
	}
	
	public static int between(int low, int high){
		int mod = high % low;
		int count=0;
		if (low>high | (mod !=0)){
			return count;
		}
		for (int i=1;i<=high;i++){
			int candidate = i*low;
			if (candidate>high){
				return count;
			}
			if (high % candidate == 0){
				count++;
			}
		}
		return count;
	}
	
	public static int betweenSets(int[] set1, int[] set2){
		int set1Max = max(set1);
		int set2Min = min(set2);
		return between(set1Max,set2Min);
	}
	
	public static void tester(int testId, int[] set1, int[] set2, int expected){
		int result = betweenSets(set1,set2);
		if (expected!=result){
			System.out.print("Failed test : "+testId);
			System.out.print("Expected : " +expected);
			System.out.println("Calculated :" +result);
		}
		else {
			System.out.println("Passed test : "+testId);
		}
	}

}
