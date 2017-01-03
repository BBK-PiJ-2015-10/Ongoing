package day5.ex10dpBridge;

public abstract class Car {
	
	protected Product product;
	
	private String name;
	
	public Car (Product product, String name){
		this.name = name;
		this.product = product;
	}
		
	abstract public void produceProduct();
	
	abstract public void assemble();
	
	public void printDetails(){
		System.out.print("Car: " +this.name);
		System.out.print(" , ");
		System.out.print("Product: " +this.product.getName());
		System.out.println();
	}
	
	public String getName(){
		return this.name;
	}
	
	

}
