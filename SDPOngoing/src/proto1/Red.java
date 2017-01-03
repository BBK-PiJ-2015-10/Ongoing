package proto1;

public class Red extends Peg {

	private static Red instance = new Red();
	
	public Red(){
		this.color = "Red";
	}
	
	public static Red getInstance(){
		return instance;
	}
	
}
