package day1.generics.s3;

public class SumMain {

	public static void main (String [] args) {
	
		int j = Sum.sum_0_1();
		System.out.println(j);
		
		int k = Sum.sum_15_22();
		System.out.println(k);
		
		int l = NewSum.sum(0,1);
		System.out.println(l);
		
		int m = NewSum.sum(15,22);
		System.out.println(m);
		
	
	}

}