package day5.ex10dpBridge;

public class BigWheel extends Car {

	public BigWheel(Product product, String name) {
		super(product, name);
	}

	@Override
	public void produceProduct() {
		System.out.println("Modifying product " +this.product.getName() +" according to BigWheel xz model");
	}

	@Override
	public void assemble() {
		System.out.println("Assembling " +this.product.getName() + " for BigWheel xz model");
	}


	
	

}
