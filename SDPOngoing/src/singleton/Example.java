package singleton;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
		
		System.out.println("Is this working");
		

	}

}
