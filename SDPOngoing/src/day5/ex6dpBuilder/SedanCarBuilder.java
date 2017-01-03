package day5.ex6dpBuilder;

public class SedanCarBuilder extends CarBuilder {

	@Override
	public void createNewCar() {
		this.car = new Car("SEDAN");
		this.car.setBodyStyle("External dimensions: overall length (inches): 202.9 etc.. ");
		this.car.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @4,000 rpm");
		this.car.setEngine("3.5L Duramax V 6 DOHC");
		this.car.setBreaks("Four-wheel disc etc...");
		this.car.setSeats("Front seat center armrest");
		this.car.setWindows("Laminated side windwos. Fixed rear windown....");
		this.car.setFuelType("Diesel 19 MGP city, etc...");		
	}
	
}
