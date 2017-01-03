package day3.lexer5;

public class Spinach extends PizzaDecorator {
	
	public Spinach(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc(){
		return super.getDesc() + "Spinach " +"(" +7.92 +")" +", ";
	}
	
	@Override
	public double getPrice(){
		return super.getPrice() + 7.92;
	}

}
