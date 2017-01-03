package codility.lesson9;

public class MaxSliceSum {
	
	private int[] helper;

	public static void main(String[] args) {
		
		int[] test = {3,2,-6,4,0};
		
		int[] test2 = {-7,-6,-5};
		
		MaxSliceSum mss = new MaxSliceSum();
		System.out.println(mss.solution(test2));

	}
	
	
	public int solution (int[] A){
		helper = new int[A.length];
		helper[0]=A[0];
		int max = A[0];
		for (int i=1;i<A.length;i++){
			int op1=helper[i-1]+A[i];
			int op2=A[i];
			if(op1<op2){
				helper[i]=op2;
			}
			else{
				helper[i]=op1;
			}
			if (helper[i]>max){
				max=helper[i];
			}
		}
		return max;
	}

}
