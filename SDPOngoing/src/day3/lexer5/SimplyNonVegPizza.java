package day3.lexer5;

public class SimplyNonVegPizza implements Pizza {

	@Override
	public String getDesc() {
		return  "SimplyNonVegPizza " +"(" +this.getPrice() +")" +", ";	
	}

	@Override
	public double getPrice() {
		return 350;
	}
	
	

}
