package day3.lexer5;

public class SimplyVegPizza implements Pizza {

	@Override
	public String getDesc() {
		return  "SimplyVegPizza " +"(" +this.getPrice() +")" +", ";			
	}

	@Override
	public double getPrice() {
		return 230;
	}
	
	

}
