package day3.lexer5;

public abstract class PizzaDecorator implements Pizza{

	private Pizza pizza;
	
	public PizzaDecorator (Pizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public String getDesc() {
		return this.pizza.getDesc(); //Delegation
	}

	@Override
	public double getPrice() {
		return this.pizza.getPrice(); //Delegation
	}
	
		
	
	
	
}
