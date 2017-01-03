package algorithms.maxsum;

public class CubicSol {

	public int maxSum(int[] A) {
		int maxsofar=0;
		for (int i=0;i<A.length;i++){
			for (int j=i;j<A.length;j++){
				int sum =0;
				for (int k=i;k<=j;k++){
					sum+=A[k];
					maxsofar = max(maxsofar,sum);
				}
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
