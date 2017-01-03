package codility;

public class SolutionPairs {

	public static void main(String[] args) {
		
		int [] test1 = {1,4,-3};
		int [] test2 = {5};
		int [] test3 = {-8,4,5,-10,3};
		
	
		
		SolutionPairs sp = new SolutionPairs();
		System.out.println(sp.solution(test3,test3.length));

	}
	
	public int solution(int[] A, int N){
		int min= Integer.MAX_VALUE;
		int front =0;
		int back = 0;
		for (back=0;back<A.length;back++){
			for (front=back;front<A.length;front++){
				int calc=abs(A[front],A[back]);
				if (calc < min){
					min=calc;
				}
			}
		}
		return min;
	}
	
	public int abs(int a,int b){
		if (a+b<0){
			return -(a+b);
		}
		return a+b;
	}

}
