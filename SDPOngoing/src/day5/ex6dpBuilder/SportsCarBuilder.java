package day5.ex6dpBuilder;

public class SportsCarBuilder extends CarBuilder {
	
	@Override
	public void createNewCar() {
		this.car = new Car("SPORTS");
		this.car.setBodyStyle("External dimensions: overall length (inches): 192.3 etc.. ");
		this.car.setPower("323 hp @ 6,800 rpm; 278 ft lb of torque @4,800 rpm");
		this.car.setEngine("3.6L Duramax V 6 DOHC");
		this.car.setBreaks("Four-wheel disc breaks etc...");
		this.car.setSeats("Driver sports front seat with one power");
		this.car.setWindows("Front windows with one touch....");
		this.car.setFuelType("Petrol 17 MGP city, etc...");		
	}

}
