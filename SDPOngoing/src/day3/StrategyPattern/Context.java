package day3.StrategyPattern;

public class Context {

	Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2){
		return strategy.docOperation(num1,num2);
	}
	
	public void setStrategy(Strategy strategy){
		this.strategy=strategy;
	}


	
}
