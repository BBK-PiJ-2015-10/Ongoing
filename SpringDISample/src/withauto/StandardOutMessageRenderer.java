package withauto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {
	
	@Autowired
	private MessageProvider messageProvider = null;

	@Override
	public void render() {
		if (messageProvider == null){
			throw new RuntimeException(
					"You must set the property mesageProvider of class:"
					+ StandardOutMessageRenderer.class.getName()
				    );
		}
		
		System.out.println(messageProvider.getMessage());

		
	}
	
	

}
