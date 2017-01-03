package day3.lexer2;

public class HospitalManagerLazyWithDoubleCheckedLocking {
	
	private String name;
	
	private String location;
	
	private static HospitalManagerLazyWithDoubleCheckedLocking instance;
	
	private HospitalManagerLazyWithDoubleCheckedLocking(String name, String location){
		this.name=name;
		this.location=location;
	}
	
	public static HospitalManagerLazyWithDoubleCheckedLocking getInstance(){
		evaluate();
		return instance;
	}
	
	private static synchronized void evaluate(){
		if (instance == null) {
			instance = new HospitalManagerLazyWithDoubleCheckedLocking("Lazy Hospital with Double Checker","London");
		}
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
