package theappbusiness;

class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		int result=0;
		for (int i=n;i>0;i--){
			if (n % i==0){
				result+=i;
			}
		}
		return result;
	}

}
