package day3.lexer5;

public class GreenOlives extends PizzaDecorator {
	
	public GreenOlives(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc(){
		return super.getDesc() + "Green Olives " +"(" +5.47 +")" +", ";
	}
	
	@Override
	public double getPrice(){
		return super.getPrice() + 5.47;
	}
	
}
