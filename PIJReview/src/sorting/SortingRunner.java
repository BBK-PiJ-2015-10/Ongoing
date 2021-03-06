package sorting;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SortingRunner {

	public static void main(String[] args) {
		
		
		
		int[] smallq = {14,25,2,9,1};
		
		//int[] smallq = {1,3,4,7};
		 
		System.out.println("before");
		System.out.println(Arrays.toString(smallq));
		System.out.println("with Quicksort");
		QuickSort qsorter = new QuickSort();
		qsorter.sort(smallq);	
		System.out.println(Arrays.toString(smallq));
		
		int[] smallm = {14,25,2,9,1};
		MergeSort msorter = new MergeSort();
		msorter.sort(smallm);
		System.out.println("With Mergesort");
		System.out.println(Arrays.toString(smallm));
		
		int[] smalli = {14,25,2,9,1};
		InsertionSort isorter = new InsertionSort();
		isorter.sort(smalli);
		System.out.println("With Interstionsort");
		System.out.println(Arrays.toString(smalli));
		
		int[] smallb = {14,25,2,9,1};
		BubbleSortII bsorter = new BubbleSortII();
		bsorter.sort(smallb);
		System.out.println("With Bubblesort");
		System.out.println(Arrays.toString(smallb));
		
		int[] smallhs={14,25,2,9,1};
		HeapSort hsorter = new HeapSort();
		bsorter.sort(smallhs);
		System.out.println("With Heapsort");
		System.out.println(Arrays.toString(smallhs));
		
	
		
		
		
		
		
	
	}

}
