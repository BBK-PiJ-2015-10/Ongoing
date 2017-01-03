package day3.exer6;

public class HospitalManagerLazy {
	
	private String name;
	
	private String location;
	
	private static HospitalManagerLazy instance;
	
	private HospitalManagerLazy(String name, String location){
		this.name=name;
		this.location=location;
	}
		
	public static HospitalManagerLazy getInstance(){
		if (instance == null) {
			instance = new HospitalManagerLazy("Lazy Hospital","London");
		}
		return instance;
	
	}
	
	
	
	
	

}
