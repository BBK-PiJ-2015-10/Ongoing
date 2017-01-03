package day3.lexer5;

public class Meat extends PizzaDecorator {

	public Meat(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc(){
		return super.getDesc() + "Meat " +"(" +14.25 +")" +", ";
	}
	
	@Override
	public double getPrice(){
		return super.getPrice() + 14.25;
	}
	
}
