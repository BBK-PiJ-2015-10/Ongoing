package sorting;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class QuickSort {
	
	private int[] numbers;
	
	public void sort (int[] values){
		if (values == null || values.length < 2 ){
			return;
		}
		this.numbers = values;
		quicksort(0,numbers.length-1);
	}
	
	private void quicksort(int low, int high){
		int i = low, j = high;
		int pivot = numbers[low+(high-low)/2];
		while ( i <= j){
			while (numbers[i] < pivot){
				i++;
			}
			while (numbers[j] > pivot){
				j--;
			}
			if (i <= j){
				exchange(i,j);
				i++;
				j--;
			}
		}
		if (low < j){
			quicksort(low,j);
		}
		if (high > i){
			quicksort(i,high);
		}
	}
	
	private void exchange(int i,int j){
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
 
}
