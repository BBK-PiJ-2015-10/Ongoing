package di.case8;

public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World from case 8, with Spring DI with XML";
	}
	
	

}
