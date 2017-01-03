package algorithms.search;

public class BinarySearch {
	
	public int binarySearch(int[]A, int target){
		int low =0;
		int high = A.length-1;
		while (low<=high){
			int mid= low + (high-low)/2;
			if (target<A[mid]) high=mid;
			else if (target>A[mid]) low=mid;
			else return mid;
		}
		return -1;
	}

}
