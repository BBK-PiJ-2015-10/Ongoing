package proto1;

public class Black extends Peg {
	
	private static Black instance = new Black();
	
	private Black (){
		this.color = "Black";
	}
	
	public static Black getInstance(){
		return instance;
	}
	
	

}
