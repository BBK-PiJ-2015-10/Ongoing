package classSamples.revisionsession;

public class InheritancePractice {
	
	public class Bear {
		
		public Object method1(){
			return 45;
		}
		
	}
	
	public class LittleBear extends Bear {
	
		@Override
		public String method1(){
			return "tpmtp";
		}
	}
	
	public void launch() {
		
		Bear first = new LittleBear();
		System.out.println(first.method1());
		
		
	}
	

	
	

	public static void main(String[] args) {
		
		
		InheritancePractice main = new InheritancePractice();
		main.launch();
		
		System.out.println("ale");
	
		
		// TODO Auto-generated method stub

	}

}
