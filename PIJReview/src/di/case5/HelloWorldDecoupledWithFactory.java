package di.case5;

public class HelloWorldDecoupledWithFactory {

	public static void main(String[] args) {
		
		MessageRenderer mr = MessageSupportFactory.getInstance().getRenderer();
		
		MessageProvider mp = MessageSupportFactory.getInstance().getProvider();
		
		mr.setMessageProvider(mp);
		
		mr.render();
		
		

	}

}
