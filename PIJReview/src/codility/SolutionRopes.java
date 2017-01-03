package codility;

public class SolutionRopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] test = {1,2,3,4,1,1,3};
		
		SolutionRopes rs = new SolutionRopes();
		System.out.println(rs.solution(4,test));
		

	}
	
	public int solution(int K, int[]A){
		int result=0;
		int l =0;
		for (int value : A){
			l += value;
			if (l >= K){
				l =0;
				result++;
			}
		}
		return result;

	}
	


}
