package day3.lexer4;

public class SMSUsers implements Observer {

	private Subject subject;
	
	private String namelocation;
	
	public String getNameLocation(){
		return this.namelocation;
	}
	
	public SMSUsers(Subject subject, String namelocation){
		this.subject = subject;
		this.namelocation=namelocation;
	}
	
	
	@Override
	public void update(String desc) {
		System.out.println(namelocation + "has been updated on "  +desc);		
	}

	@Override
	public void subscribe() {
		subject.susbcribeObserver(this);		
	}

	@Override
	public void unSubscribe() {
		subject.unSubscribeObserver(this);
	}

	
	

}
