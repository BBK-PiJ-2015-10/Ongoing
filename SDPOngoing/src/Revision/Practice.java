package Revision;

import java.util.List;

public class Practice {
	
	public interface Modem {
		
		public void dial (int number);
		
		public void hangup();
		
		public void send(String text);
		
		public String receive(String text);
		
	}
	
	public interface Connector {
		
		public void dial (int number);
		
		public void hangup();
		
	}
	
	
	public interface Communicator {
		
		public void send(String text);
		
		public String receive(String text);
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
