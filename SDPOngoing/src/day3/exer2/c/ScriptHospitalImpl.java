package day3.exer2.c;

public class ScriptHospitalImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is a test");
		
		Hospital example = new HospitalImpl("Chelsea Hospital","London");
		
		// It seems that an implementation can't change the value initialized in the interface.
		System.out.println(example.tester);

	}

}
