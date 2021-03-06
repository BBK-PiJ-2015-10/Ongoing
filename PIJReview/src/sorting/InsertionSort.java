package sorting;

/*
 * Average, best, and worst performance: O(n2), O(n), O(n2)
 */

public class InsertionSort {
	
	
	public void sort(int[] values){
		for (int i =1;i<values.length;i++){
			int valueToSort = values[i];
			int j=i;
			while (j >0 && values[j-1] > valueToSort){
				values[j]=values[j-1];
				j--;
			}
			values[j]=valueToSort;
		}
	}
	
}
