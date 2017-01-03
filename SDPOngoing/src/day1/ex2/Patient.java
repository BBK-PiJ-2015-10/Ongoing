package day1.ex2;

public abstract class Patient {
	
	protected String nationality;
	
	protected String city;
	
	public Patient(String nationality, String city){
		this.nationality = nationality;
		this.city = city;
	}
	
	public abstract void speak();
	
	public void dance(){
		System.out.println("I dance like a champ");
	}

}
