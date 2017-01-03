package di.case7;

public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World from case 7, with Spring DI";
	}
	
	

}
