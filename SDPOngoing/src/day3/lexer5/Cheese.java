package day3.lexer5;

public class Cheese extends PizzaDecorator {
	
	public Cheese (Pizza pizza){
		super(pizza);
	}
	
	@Override
	public String getDesc(){
		return super.getDesc() + "Cheese " +"(" +20.72 +")" +", ";
	}
	
	@Override
	public double getPrice(){
		return super.getPrice() + 20.72 ;
	}

	


}
