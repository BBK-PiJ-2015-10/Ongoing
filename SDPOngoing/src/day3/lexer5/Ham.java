package day3.lexer5;

public class Ham extends PizzaDecorator {

	public Ham(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDesc(){
		return super.getDesc() + "Ham " +"(" +18.12 +")" +", ";
	}
	
	@Override
	public double getPrice(){
		return super.getPrice() + 18.12;
	}
	
	
}
