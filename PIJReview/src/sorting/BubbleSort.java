package sorting;

public class BubbleSort {
	
	private int[] numbers;
	
	public void sort (int[] values){
		if (values == null || values.length <= 1 ){
			return;
		}
		this.numbers = values;
		bubblesort();
	}
	
	private void bubblesort(){
		int n = numbers.length;
		int k;
		for (int m=n; m>=0; m--){
			for (int i =0;i<n-1;i++){
				k=i+1;
				if(numbers[i]>numbers[k]){
					swapNumbers(i,k);
				}
			}
		}
	}
	
	private void swapNumbers(int i, int j){
		int temp;
		temp = numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
	}

	
}
