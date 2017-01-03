package algorithms.maxsum;

public class LogNSolution {
	
	public int maxSum(int[] A,int low, int high) {
		int leftSum=0, rightSum=0, sum =0;
		if(low==high){
			return A[low];
		}
		int mid = (low+high)/ 2;
		int maxLeftSum = maxSum(A,low,mid);
		int maxRightSum = maxSum(A,mid+1,high);
		
		//max-crossing-subarray
		for (int i=mid;i>=low;i--){
			sum +=A[i];
			if(sum > leftSum){
				leftSum=sum;
			}
		}
		
		sum=0;
		for (int j=mid+1;j<=high;j++){
			sum +=A[j];
			if (sum > rightSum){
				rightSum=sum;
			}
		}
		return max(maxLeftSum,maxRightSum,(leftSum+rightSum));
		
	}
	
	public int max (int a, int b,int c){
		return a > b ? (a > c ? a: c):(b > c? b : c);
	}

	

}
