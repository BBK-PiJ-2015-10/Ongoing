package codility.lesson4;

import java.util.Arrays;

public class MissingInteger {

	//private int[] values
	
	public static void main(String[] args) {
		
		//int[] test = {225,-11,45,134,56};
		//int[] test = {-34,0,100,2,3,4,5,6,7};
		//int[] test = {-4,-7,-10,0,1,2,3,4,5,6,7,500};
		//int[] test = {-4,-7,-10};
		
		int[] test = {1,3,6,4,1,2};
		
		
		
		//MissingInteger fmi = new MissingInteger();
		//System.out.println(fmi.solution(test));
		

	}
	
	
	public int solution(int[]A){
		Arrays.sort(A);
		int temp = firstPossitive(A,0);
		return firstMissingPossitive(A,temp,1);
	}
	
	private int firstPossitive(int[]A, int pos){
		if(pos>=A.length){
			return -1;
		}
		if (A[pos]<=0){
			return firstPossitive(A,pos+1);
		}
		return pos;
	}
	
	private int firstMissingPossitive(int[]A,int fppos,int comp){
		if (fppos==-1){
			return 1;
		}
		if (fppos>=A.length){
			return A[fppos-1]+1;
		}
		if ( (fppos>0) && (A[fppos]==A[fppos-1]) ){
			comp=comp-1;
		}
		if (A[fppos]!=comp){
			return comp;
		}
		else {
			return firstMissingPossitive(A,fppos+1,comp+1);
		}
	}
	

}
