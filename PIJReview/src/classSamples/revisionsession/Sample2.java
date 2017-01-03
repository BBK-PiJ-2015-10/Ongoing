package classSamples.revisionsession;

public class Sample2 {
	
	public class AClass {
		
		protected int a;
		
	}
	
	class BClass {
		
		//is "a" accessible here?
		
	}
	
	
	class CClass extends AClass {
		// is "a" accesible here?
		
	}
	
	
	class DClass extends BClass {
		
	}
	
	public void launch(){
		
	}

	public static void main(String[] args) {
		
		Sample2 test  = new Sample2();
		test.launch();
		
		//protected is package
		
		
		
		// TODO Auto-generated method stub

	}

}
