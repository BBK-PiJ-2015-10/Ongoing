package codility.lesson8;

import java.util.Arrays;

public class Dominant {

	public static void main(String[] args) {
		
		int[] test = {4,4,4,5,5};
		
		Dominant dom = new Dominant();
		System.out.println(dom.solution(test));

	}
	
	public int solution (int[]A){
		if (A.length==0){
			return -1;
		}
		else if (A.length==1){
			return A[0];
		}
		Arrays.sort(A);
		return helper(A,1,true,-1,0,0,true);
	}
	
	public int helper(int[]A,int pos,boolean FTE,int dom,int global,int temp,boolean NC){
		
		System.out.println("I am on " +pos);
		if ((A[pos]==A[pos-1]) && (FTE)){
			temp++;
			temp++;
			FTE=false;
		}
		else if ((A[pos]==A[pos-1])&&!FTE){
			temp++;
			if (temp>global){
				global=temp;
				dom=A[pos-1];
			}
		}
		else {
			FTE=true;
			if (temp>global){
				global=temp;
				dom=A[pos-1];
			}
			temp=0;
		}
		if (pos==A.length-1){
			return dom;
		}
		else {
			return helper(A,pos+1,FTE,dom,global,temp,NC);
		}
	}
	
	

}
