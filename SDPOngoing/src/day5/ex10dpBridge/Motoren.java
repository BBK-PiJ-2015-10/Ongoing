package day5.ex10dpBridge;

public class Motoren extends Car {

	public Motoren(Product product, String name) {
		super(product, name);
	}

	@Override
	public void produceProduct() {
		System.out.println("Modifying product " +this.product.getName() +" according to Motoren lm model");	
	}

	@Override
	public void assemble() {
		System.out.println("Assembling " +this.product.getName() + " for Motoren lm model");
	}	

}
