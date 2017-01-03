package codility.lesson3;

public class TimeEquilibrium {

	public static void main(String[] args) {
		
		TimeEquilibrium tc = new TimeEquilibrium();
		
		int[] test = {3,1,2,4,3};
		
		System.out.println(tc.solution(test,test.length));


	}
	
	
	public int solution(int[]A, int N){
		int min= Integer.MAX_VALUE;
		for (int i=1;i<N;i++){
			int left=0;
			int right=0;
			for (int j=i-1;j>=0;j--){
				left=left+A[j];
			}
			for (int k=i;k<N;k++){
				right=right+A[k];
			}
			int diff = ABS(left,right);
			
			if (diff<min){
				min=ABS(left,right);
			}	
		}
		return min;
	}
	
	public int ABS(int a, int b){
		int result = a-b;
		if (result<0){
			return -result;
		}
		else {
			return result;
		}
	}
	


}
