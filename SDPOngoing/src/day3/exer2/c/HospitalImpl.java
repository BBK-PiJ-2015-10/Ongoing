package day3.exer2.c;

public class HospitalImpl implements Hospital {
	
	private String name;
	
	private String address;
	
	public String tester = new String("The implementation didn't overwrite the field");
		
	public HospitalImpl(String name, String address){
		this.name=name;
		this.address=address;
	}
	

}
