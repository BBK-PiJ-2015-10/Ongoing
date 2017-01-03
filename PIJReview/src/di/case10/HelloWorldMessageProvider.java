package di.case10;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World from case 10, with Spring DI with Autoscan";
	}
	
	

}
