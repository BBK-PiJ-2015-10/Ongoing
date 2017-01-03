package singleton;

public class SingleObject {
	
	//Create an object of single Object
	private static SingleObject instance = new SingleObject();
	
	//Make the constructor private, so that this class can't
	//be instantiated from outside
	
	private SingleObject(){
	}
	
	//Provide access to the only object available, make it static
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello Worlds");
	}
	
	
	

}
