package day1.ex2;

public class SpanishPatient extends Patient {
	
	private int score;
	
	public SpanishPatient(String nationality, String city) {
		super(nationality, city);
	}
	
	public SpanishPatient(String city, int score) {
		this("Spaniard",city);
		this.score=score;
	}

	
	@Override
	public void speak() {
		System.out.println("I am " +this.nationality +" from " +this.city + " and my score is " +score);
	}
	
	

}
