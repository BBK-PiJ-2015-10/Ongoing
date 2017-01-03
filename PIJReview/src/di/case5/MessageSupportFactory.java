package di.case5;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.File;

public class MessageSupportFactory {
	
	private static MessageSupportFactory instance = null;
	
	private Properties props = null;
	
	private MessageRenderer renderer = null;
	
	private MessageProvider provider = null;
	
	private MessageSupportFactory(){
		
		props = new Properties();
		
		try {
			
			
			String address1 = "C:\\Users\\YasserAlejandro\\SDP\\Ongoing\\PIJReview\\src\\di\\case5\\bean.properties";
			File file = new File(address1);
			
			FileInputStream fi= new FileInputStream(file);
			
			props.load(fi);
			
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			
			renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
			provider = (MessageProvider) Class.forName(providerClass).newInstance();
			
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	static {
		instance = new MessageSupportFactory();
	}

	public static MessageSupportFactory getInstance() {
		return instance;
	}

	public MessageRenderer getRenderer() {
		return renderer;
	}

	public MessageProvider getProvider() {
		return provider;
	}





	
	
	

}
