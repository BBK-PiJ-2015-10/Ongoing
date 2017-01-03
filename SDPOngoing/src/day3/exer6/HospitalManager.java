package day3.exer6;

public class HospitalManager {
	
	private String name;
	
	private String location;
	
	private static HospitalManager instance = new HospitalManager("Non Lazy Hospital","Easton Road");
	
	private HospitalManager(String name, String location){
		this.name=name;
		this.location=location;
	}
	
	public static HospitalManager getInstance(){
		return instance;
	}
	
	

}
