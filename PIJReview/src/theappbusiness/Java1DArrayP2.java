package theappbusiness;

import java.util.Scanner;
import java.util.Arrays;

public class Java1DArrayP2 {

	public static void main(String[] args) {
		
		Java1DArrayP2 ja2 = new Java1DArrayP2();
		ja2.solution();
		


	}
	
	private void solution() {
	
		Scanner s = new Scanner(System.in);
		int totalTests = Integer.parseInt(s.nextLine());
		for (int i=0;i<totalTests;i++){
			int size = Integer.parseInt(s.next());
			int jump = Integer.parseInt(s.next());
			int [] values = new int[size];
			for (int k=0;k<size;k++){
				values[k]=Integer.parseInt(s.next());
			}
			//eval(values,size,jump,0);
			//System.out.println("Launching Array " + Arrays.toString(values) + " with n =" +size + " and m= " +jump);
			System.out.println(eval(values,size,jump,0));
		}
		
		/*
		int[] test1 = {0,0,0,0,0};
		tester(1,"YES",test1,5,3);
		int[] test2 = {1,1,1,1,1};
		tester(2,"NO",test2,5,3);
		int[] test3 = {0,0,0,1,1,1};
		tester(3,"YES",test3,6,5);
		int[] test4 = {0,0,1,1,1,0};
		tester(4,"NO",test4,6,3);
		int[] test5 = {0,1,0};
		tester(5,"NO",test5,3,1);
		*/
		
		
		
	}
	
	private int evalAux(int[] values, int n, int m, int POS){
		if (POS>=n-1){
			return 1;
		}
		boolean canMove=false;
		boolean canJump=false;
		if (values[POS+1]==0){
			canMove=true;
		}
		if ((POS+m)>=n){
			return 1;
		} else {
			if (values[POS+m]==0){
				canJump=true;
			}
		}
		if (canMove && !canJump){
			return evalAux(values,n,m,POS+1);
		}
		if (!canMove && canJump){
			return evalAux(values,n,m,POS+m);
		}
		if (canMove && canJump){
			return evalAux(values,n,m,POS+1)+evalAux(values,n,m,POS+m);
		}
		return 0;
	}
	
	private String eval (int[] values, int n, int m, int POS){
		int result = evalAux(values,n,m,0);
		if (result>0){
			return "YES";
		}
		else {
			return "NO";
		}
	}
	
	private void tester(int testId,String expected,int[] values, int n, int m){
		String result = eval(values,n,m,0);
		if (!result.equals(expected)){
			System.out.println("Test #: "+ testId + " failed");
		}
	
	}
	
	private static boolean isSolvable(int m, int[] arr, int i) {
	    if (i < 0 || arr[i] == 1) return false;
	    if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

	    arr[i] = 1;
	    return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
	}
	
	 

}
