package sorting;

public class HeapSort {
	
	int[] a;
	
	public void sort(int[] values){
		if (values.length<2){
			return;
		}
		a=values;
		sort();
	}
	

	
	private void swap(int i, int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	private int getLeftChildIndex(int index){
		return index*2+1;
	}
	
	private int getRightChildIndex(int index){
		return 2*index+2;
	}
	
	/*
	 * This is the fixHeap algorithm. Ensures the heap property for a substree;
	 * assuming its children already fullfill the heap property
	 */
	
	private void fixHeap(int rootIndex,int lastIndex){
		
		//get a hold of the root value
		int rootValue = a[rootIndex];
		
		//Promote children if the greater than root
		
		int index=rootIndex;
		boolean more=true;
		while (more){
			
			int childIndex=getLeftChildIndex(index);
			if (childIndex<=lastIndex){
				int rightChildIndex=getRightChildIndex(index);
				if (rightChildIndex<=lastIndex && a[rightChildIndex]<a[childIndex]){
					childIndex=rightChildIndex;
				}
				if(a[childIndex]<rootValue){
					a[index]=a[childIndex];
					index=childIndex;
				}
				else {
					more=false;
				}
			}
			else {
				more =false;
			}
			a[index]=rootValue;
		}
	}
	
	public void sort(){
		int n = a.length-1;
		for (int i=(n-1)/2;i>=0;i--){
			fixHeap(i,n);
		}
		while (n>0){
			swap(0,n);
			n--;
			fixHeap(0,n);
		}
	}
	

	
}
