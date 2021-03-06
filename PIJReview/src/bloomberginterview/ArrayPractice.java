package bloomberginterview;

public class ArrayPractice {

	public static void main(String[] args) {
		
		ArrayPractice ap = new ArrayPractice();
		ap.run();

	}
	
	public void run(){
		
		int[] test1 = {1,2,3,4};
		eval(1,"1,2,3,4",test1);
		int[] test2 = {0,0,0};
		eval(2,"0,0,0",test2);
		int[] test3 = {1,0,2};
		eval(3,"1,2,0",test3);
		int[] test4 = {1,2,0,5};
		eval(4,"1,2,5,0",test4);
		int[] test5 = {0,2,0,0};
		eval(5,"2,0,0,0",test5);
		int[] test6 = {0,0,0,2};
		eval(6,"2,0,0,0",test6);
		int[] test7 = {0,0,0,0,4};
		eval(7,"4,0,0,0,0",test7);
				
	}
	
	public void moveZerosStupid(int[] values){
		if (values.length<2){
			return;
		}
		int[] temp = new int[values.length];
		int pos=0;
		for (int i=0;i<values.length;i++){
			if(values[i]!=0){
				temp[pos]=values[i];
				pos++;
			}
		}
		while (pos<values.length){
			temp[pos]=0;
			pos++;
		}
		for (int i=0;i<values.length;i++){
			values[i]=temp[i];
		}
		
	}
		
	public void moveZeros(int[] values){
		if (values.length<2){
			return;
		}
		Integer current=null;
		Integer prior=null;
		for (int i=0;i<values.length;i++){
			if (current!=null){
				if (values[i-1]==0){
					prior=0;
				}
				else {
					prior=-1;
				}
			}
			if(values[i]==0){
				current=0;
			}
			else {
				current=-1;
			}
			if (prior!=null){
				if (current!=prior){
					swap(values,i);
				}
			}
		}
	}
	
	
	
	//This will only happen when there needs to be swap
		private void swap(int[] values,int end){
				for (int i=0;i<end;i++){
					if (values[i]==0){
						values[i]=values[end];
						values[end]=0;
						return;
					}
				}
		}

	
	public String toString(int[] values){
		String result="";
		for (int i=0;i<values.length;i++){
			if (i==values.length-1){
				result+=values[i];
			}
			else {
				result+=values[i]+",";
			}
		}
		return result;
	}
	
	public void eval(int test,String expected, int[] values){
		moveZeros(values);
		String result= toString(values);
		if (expected.equals(result)){
			System.out.println("Test: "+test +" passed");
		}
		else {
			System.out.println("Test: "+test +" failed");
			System.out.println("Expected: "+expected);
			System.out.println("Result: "+result);
		}
	}
	

}
