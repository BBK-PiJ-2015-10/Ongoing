package day3.StrategyPattern;

public class OperationAdd implements Strategy {

	@Override
	public int docOperation(int num1, int num2) {
		return num1 + num2;
	}
	
	

}
