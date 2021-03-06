package searching;

import sampleQuestionsPDF.Exer1to31;

public class BinarySearcher {
	
	public int search(int v, int[] A){
		if (A.length<1){
			return -1;
		}
		return helper(v,A,0,A.length-1);
	}
	
	public int helper(int target,int[]A,int beg, int end){
		if (beg==end){
			if (A[beg]==target){
				return beg;
			}
			else {
				return -1;
			}	
		}
		int mid=beg+(end-beg)/2;
		if (A[mid]==target){
			return mid;
			//return 1;
		}
		else if (A[mid]>target && mid>0){
			return helper(target,A,beg,mid-1);
		}
		else if (A[mid]<target && mid<A.length-1){
			return helper(target,A,mid+1,end);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Printing this sucker again");
		
		BinarySearcher bs = new BinarySearcher();
		
		int[] test = {1};
		
		System.out.println(bs.search(0,test));
		
	}
	

}
