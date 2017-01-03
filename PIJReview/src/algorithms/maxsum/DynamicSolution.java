package algorithms.maxsum;

public class DynamicSolution {
	
	public int maxSum(int[]A){
		int maxVal=A[0];
		int[] sums = new int[A.length];
		sums[0]=A[0];
		for (int i=1;i<A.length;i++){
			sums[i]=max(A[i],A[i]+sums[i-1]);
			maxVal=max(maxVal,sums[i]);
		}
		return maxVal;
		
	}
	
	public int max(int a, int b){
		if (a > b){
			return a;
		}
		else {
			return b;
		}
	}

}
