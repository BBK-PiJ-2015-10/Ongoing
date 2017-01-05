package algorithms.select;

public class QuickSelect {
	
	//This algorithm finds the kth smallest element in a list
	
	private int[] values;

	public static void main(String[] args) {
		
		int[] test = {2,2,2,2,3};
		
		QuickSelect qs = new QuickSelect();
		int result =qs.select(test,4);
		System.out.println(result);
		
	
	}
	
	public int select(int[]A, int rank){
		if(A.length<rank){
			return -1;
		}
		values=A;
		return quickSelect(0,A.length-1,rank-1);
	}
	
	public int quickSelect(int low,int high,int POS){
		int pivotPOS=low+((high-low)/2);
		int parIndex=partition(low,high,pivotPOS);
		if (parIndex==POS){
			return values[parIndex];
		}
		else {
			if(parIndex>POS){
				return quickSelect(low,parIndex-1,POS);
			}
			else {
				return quickSelect(parIndex+1,high,POS);
			}
		}
	}
	
	public int partition(int low,int high,int pivotPOS){
		int pivot=values[pivotPOS];
		int index = low;
		swap(high,pivotPOS);
		for (int i=low;i<high;i++){
			if(values[i]<pivot){
				swap(index,i);
				index++;
			}
		}
		swap(index,high);
		return index;
	}
	
	
	public void swap(int a, int b){
		int temp=values[a];
		values[a]=values[b];
		values[b]=temp;
	}
	

}
