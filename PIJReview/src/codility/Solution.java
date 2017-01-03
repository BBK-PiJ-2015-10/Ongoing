package codility;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {-1,3,-4,5,1,-6,2,1};
		
		int[] test2 = {5,1,1,2,0,8};
		
		int[] test3 = {};
		
		Solution ns = new Solution();
		System.out.println(ns.solution(test));
		
		

	}
	
	public int solution(int[] A) {
		return solutions(A,1);
	}
	
	public int solutions(int[] A, int pos){
		if ( (A.length <= 2) || (A.length <= pos+2) ){
			return -1;
		}
		int left=0;
		int right=0;
		for (int i=pos-1;i>=0;i--){
			left=left+A[i];
		}
		for (int j=pos+1;j<A.length;j++){
			right=right+A[j];
		}
		if (left == right){
			return pos;
		} else {
			return solutions(A,pos+1);
		}
	}

}
