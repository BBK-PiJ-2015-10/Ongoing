package day5.ex6dpBuilder;

public class CarDirector {
	
	private CarBuilder carbuilder;
	
	public CarDirector(CarBuilder carbuilder){
		this.carbuilder = carbuilder;
	}
	
	public void build(){
		carbuilder.createNewCar();
	}
	
	public Car getCar(){
		return carbuilder.getCar(); 
	}

}
