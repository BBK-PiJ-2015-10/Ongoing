package proto1;

public class Green extends Peg {

	private static Green instance = new Green();
	
	public Green(){
		this.color = "Green";
	}
	
	public static Green getInstance(){
		return instance;
	}
	
	
}
