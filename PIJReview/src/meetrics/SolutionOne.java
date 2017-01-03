package meetrics;

import java.util.Map;
import java.util.HashMap;

public class SolutionOne {
	
	private HashMap<Value,Value> values = new HashMap<>();

	public static void main(String[] args) {
		
		int[] test1 = {4,6,2,2,6,6,1,0,0,0,0,0,0};
		
		int[] test2 = {7,5,1,1,6,7,0,5};
		
		int[] test3 = {-1,0,-2,-1};
		
		SolutionOne s1 = new SolutionOne();		
		System.out.println(s1.solutionOrig(test1));
		System.out.println(s1.solutionA(test1));
		System.out.println(s1.solution(test1));

	}
	
	int solutionOrig(int[] A) {
	        int N = A.length;
	        int result = 0;
	        for (int i = 0; i < N; i++)
	            for (int j = 0; j < N; j++)
	                if (A[i] == A[j])
	                    result = Math.max(result, Math.abs(i - j));
	        return result;
    }
		
	int solutionA(int[] A){
		if (A.length==1){
			return 0;
		}
		else {
			return helper(A,0,0);
		}
	}
	
	int solution(int[]A){
		if (A.length<2){
			return 0;
		}
		int global=0;
		for (int i=0;i<A.length;i++){
			Value temp=new Value(A[i]);
			if(!values.containsKey(temp)){
				temp.setFirst(i);
				values.put(temp,temp);
			}
			else {
				Value aux =values.get(temp);
				aux.setLast(i);
				if(global<aux.getDistance()){
					global=aux.getDistance();
				}
				values.put(temp,aux);
			}
		}
		return global;
	}
	
	int helper(int[]A,int POS,int global){
		if(POS==A.length-1){
			return global;
		}
		for (int i=POS+1;i<A.length;i++){
			if(A[POS]==A[i]){
				int diff = Math.abs(POS - i);
				if(diff>global){
					global=diff;
				}
			}
		}
		return helper(A,POS+1,global);
	}
	
	private class Value{
		
		private int number;
		
		private int first;
		
		private int last;
		
		private int distance=0;
		
		public Value(int number){
			this.number=number;
		}
		
		public void setLast(int pos){
			this.last=pos;
			distance=Math.abs(pos-first);
		}
		
		public void setFirst(int pos){
			this.first=pos;
		}
		
		public int getDistance(){
			return this.distance;
		}
		
		@Override
		public int hashCode(){
			return this.number;
		}
		
		@Override
		public boolean equals(Object obj){
			Value v1 =((Value) obj);
			if (v1.hashCode()==this.hashCode()){
				return true;
			}
			else {
				return false;
			}
		}
		
	}

	

}
