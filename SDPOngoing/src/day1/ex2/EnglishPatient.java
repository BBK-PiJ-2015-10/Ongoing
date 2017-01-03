package day1.ex2;

public class EnglishPatient extends Patient {

	private int score;
	
	public EnglishPatient(String nationality, String city) {
		super(nationality, city);
	}
	
	public EnglishPatient(String city, int score) {
		this("English",city);
		this.score=score;
	}

	
	@Override
	public void speak() {
		System.out.println("I am " +this.nationality +" from " +this.city + " and my score is " +score);
	}
	
	
	
	
	
	

}
