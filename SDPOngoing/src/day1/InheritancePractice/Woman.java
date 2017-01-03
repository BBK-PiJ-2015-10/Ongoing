package day1.InheritancePractice;

public abstract class Woman {
	
	private String name;
	
	private int number;
	
	protected int size;
	
	private String address;
	
	public Woman(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getNumber(){
		return this.number;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public String getAddress(){
		return this.address;
	}

	public void setAddress(String address){
		this.address = address;
	}
}
