package codility.lesson8;

import java.util.Map;
import java.util.HashMap;

public class SuperDominant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {3,4,2,3,3,-1,3,3};
		
		int[] test1 = {1,2,2,1,1};
		
		int[] test2 = {};
		
		SuperDominant sd = new SuperDominant();
		System.out.println(sd.solution(test2));

	}
	
	private Map<Integer,Integer> counts= new HashMap();
	
	public int solution(int[] A){
		if (A.length<1){
			return -1;
		}
		Integer maxcount=0;
		Integer maxlocation=null;
		for (int i=0;i<A.length;i++){
			Integer temp = A[i];
			if(!counts.containsKey(temp)){
				counts.put(temp,1);
			}
			else {
				Integer current = counts.get(temp);
				counts.put(temp,current+1);
			}
			if(counts.get(temp)>maxcount){
				maxcount=counts.get(temp);
				maxlocation=i;	
			}
		}
		if (maxcount>A.length/2){
			return maxlocation;
		}
		return -1;
	}

}
