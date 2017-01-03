package day3.StatePattern;

public class Context {
	
	private State state;
	
	public Context() {
		this.state=null;
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public State getState(){
		return this.state;
	}
	
	public Object givemeMyAllowance(){
		if (state != null){
			return 100;
		}
		else {
			//String result = 
			return "I am hungry";
		}
		
	}

}
