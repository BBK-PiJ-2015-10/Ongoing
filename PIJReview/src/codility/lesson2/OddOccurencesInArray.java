package codility.lesson2;

import java.util.Arrays;

public class OddOccurencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {2,3,99,3,2,9,9};	
		OddOccurencesInArray oc = new OddOccurencesInArray();
		System.out.println(oc.solution(test,test.length));

	}
	
	public int solution(int[]A, int N){
		Arrays.sort(A);
		int odd=N-1;
		int i;
		for (i=0;i<N-1;i+=2){
			if ((A[i]!=A[i+1])){
				return A[i];
			}
		}
		return A[odd];
	}
	


}
