package codility.lesson4;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[]A){
		int max =0;
		Set<Integer> set = new HashSet<>();
		for (int i=0;i<A.length;i++){
			set.add(new Integer(A[i]));
			if(A[i]>max){
				max=A[i];
			}
		}
		if (set.size()!=A.length){
			return 0;
		}
		int returnVal =1;
		for (int i=1;i<max;i++){
			if(!set.contains(new Integer(i))){
				returnVal =0;
				break;
			}
		}
		return returnVal;
		
	}

}
