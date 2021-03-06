package recursion;

public class Factorial {

	private int getFactorialNTR(int n){
		if (n==1){
			return 1;
		}
		else {
			return n*getFactorialNTR(n-1);
		}	
	}
	
	private int getFactorialTR(int n){
		return helper(1,n);
	}
	
	private int helper(int accum,int n){
		if (n==1)return accum;
		else return helper(accum*n,n-1); 
	}
	
	
	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		System.out.println(fact.getFactorialNTR(13));
		
		System.out.println(fact.getFactorialTR(13));
		
		
	}
	
}


