package di.case4;

public class HelloWorldDecoupledWithInterfaces {

	public static void main(String[] args) {
		
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}

}
