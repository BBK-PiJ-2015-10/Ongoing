package day1.ex2;

public class Driver {
	
	protected String nationality;
	
	protected String city;
	
	private int score;
	
	public Driver(String nationality, String city, int score) {
		this.nationality=nationality;
		this.city=city;
		this.score=score;
	}
	

	public void speak() {
		System.out.println("I am a driver " +this.nationality +" from " +this.city + "and my score is " +score);
	}
	
	

}
