package di.case9;

public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World from case 9, with Spring DI with annotations";
	}
	
	

}
