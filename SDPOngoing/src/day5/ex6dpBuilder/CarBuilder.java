package day5.ex6dpBuilder;

public abstract class CarBuilder {

	protected Car car;
	
	public Car getCar(){
		return this.car;
	}
	
	public abstract void createNewCar();
	
	
	
	
}
