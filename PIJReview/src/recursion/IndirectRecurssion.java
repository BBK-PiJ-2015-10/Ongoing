package recursion;

public class IndirectRecurssion {

	public static void main(String[] args) {
		
		IndirectRecurssion is = new IndirectRecurssion();
		System.out.println(is.isEven(11));

	}
	
	private boolean isEven(int n){
		if (n==0) return true;
		else return isOdd(n-1);
	}
	
	private boolean isOdd(int n){
		return(!isEven(n));
	}

}
