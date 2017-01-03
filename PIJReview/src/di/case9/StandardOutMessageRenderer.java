package di.case9;

import org.springframework.beans.factory.annotation.Autowired;

public class StandardOutMessageRenderer implements MessageRenderer {

	@Autowired
	private MessageProvider messageProvider = null;
	
	@Override
	public void render() {
		if (messageProvider == null){
			throw new RuntimeException (
			"You must set the property messageProvider of class:"
			+ StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider=provider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}
	
	

}
