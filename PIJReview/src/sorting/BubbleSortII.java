package sorting;

public class BubbleSortII {
	
	private int[] numbers;
	
	public void sort(int[] A){
		if (A.length<2){
			return;
		}
		numbers=A;
		for (int i=A.length-1;i>=0;i--){
			int k;
			for (int j=1;j<=i;j++){
				k=j-1;
				if(numbers[k]>numbers[j]){
					swap(k,j);
				}
			}
		}
		
	}
	
	
	public void swap(int a, int b){
		int temp=numbers[a];
		numbers[a]=numbers[b];
		numbers[b]=temp;
	}

}
