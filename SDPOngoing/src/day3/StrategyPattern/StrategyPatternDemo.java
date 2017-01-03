package day3.StrategyPattern;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(10,5));
		
		context.setStrategy(new OperationSubstract()); 
		System.out.println(context.executeStrategy(10,5));
		
		context.setStrategy(new OperationMultiply()); 
		System.out.println(context.executeStrategy(10,5));
		
	}

}
