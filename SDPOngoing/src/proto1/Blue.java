package proto1;

public class Blue extends Peg {

	private static Blue instance = new Blue();
	
	public Blue (){
		this.color = "Blue";
	}
	
	public static Blue getInstance(){
		return instance;
	}
	
	

}
