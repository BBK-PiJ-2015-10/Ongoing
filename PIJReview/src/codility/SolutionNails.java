package codility;

import java.util.List;
import java.util.LinkedList;

public class SolutionNails {

	public static void main(String[] args) {
		
		SolutionNails sn = new SolutionNails();
		int[] t1 = {1,4,5,8};
		int[] t2 = {4,5,9,10};
		int[] t3 = {4,6,7,10,2};
		System.out.println(sn.solution(t1,t2,t3));
		

	}
	
	public class Tuple {
		int front;
		int back;
		boolean isOpen=false;
		
		public Tuple(int front, int back){
			this.front=front;
			this.back=back;
		}
		
		public boolean opens(int key){
			if ((front<=back) && (front<=key) && (key<=back)){
				return true;
			}
			else {
				return false;
			}
		}
		
		public boolean getOpen(){
			return this.isOpen;
		}
		
		public void setOpen(){
			this.isOpen=true;
		}
		
	}
	
	public int solution (int[]A,int[]B,int[]C) {
		int target=A.length;
		int count=0;
		List<Tuple> tupples = new LinkedList<>();
		for (int i=0;i<A.length;i++){
			tupples.add(new Tuple(A[i],B[i]));
		}
		for (int j=0;j<C.length;j++){
			count++;
			for (Tuple value : tupples){
				if ( (value.opens(C[j])) && (!value.isOpen) ) {
					value.setOpen();
					target--;
					if (target<=0){
						return count;
					}
				}
			}
		}
		return -1;
	}
	


}
