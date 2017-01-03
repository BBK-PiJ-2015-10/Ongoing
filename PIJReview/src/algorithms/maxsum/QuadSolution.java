package algorithms.maxsum;

public class QuadSolution {
	
	public int maxSum(int[] A) {
		int maxsofar=0;
		for (int i=0;i<A.length;i++){
			int sum =0;
			for (int j=i;j<A.length;j++){
					sum+=A[j];
					maxsofar = max(maxsofar,sum);
			}
		}
		return maxsofar;
	}
	
	public int max (int a, int b){
		if (a>b){
			return a;
		}
		else {
			return b;
		}
	}

}
