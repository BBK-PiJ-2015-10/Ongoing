package day5.ex10dpBridge;

public abstract class Product {
	
	private String name;
	
	public Product(String name){
		setName(name);
		System.out.println("Producing " +name);
	}
	
	private void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}	

}
