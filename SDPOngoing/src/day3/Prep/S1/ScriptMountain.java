package day3.Prep.S1;

public class ScriptMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mountain first = new Mountain("Tontolone",10,15);
		System.out.println(first.getName());
		System.out.println(first.getLatitude());
		System.out.println(first.getLongitude());
		first.setCountry("Italia");
		System.out.println(first.getCountry());

	}

}
