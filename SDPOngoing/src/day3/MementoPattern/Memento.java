package day3.MementoPattern;

public class Memento {
	
	private String state;
	
	public Memento (String state){
		this.state = state;
	}
	
	public String getState(){
		return this.state;
	}

}