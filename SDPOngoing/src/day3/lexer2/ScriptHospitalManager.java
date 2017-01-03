package day3.lexer2;

public class ScriptHospitalManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HospitalManager test = HospitalManager.getInstance();
		System.out.println(test.getName());
		System.out.println(test.getLocation());
		
		HospitalManagerLazy test2 = HospitalManagerLazy.getInstance();
		System.out.println(test2.getName());
		System.out.println(test2.getLocation());
		
		HospitalManagerLazyWithDoubleCheckedLocking test3 = HospitalManagerLazyWithDoubleCheckedLocking.getInstance();
		System.out.println(test3.getName());
		System.out.println(test3.getLocation());
		
		

	}

}
