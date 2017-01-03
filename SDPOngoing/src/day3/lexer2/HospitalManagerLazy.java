package day3.lexer2;

public class HospitalManagerLazy {
	
	private String name;
	
	private String location;
	
	private static HospitalManagerLazy instance;
	
	private HospitalManagerLazy(String name, String location){
		this.name=name;
		this.location=location;
	}
		
	public synchronized static HospitalManagerLazy getInstance(){
		if (instance == null) {
			instance = new HospitalManagerLazy("Lazy Hospital","London");
		}
		return instance;
	}
	
	
	
	public String getName(){
		return this.name;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	
	
	

}
