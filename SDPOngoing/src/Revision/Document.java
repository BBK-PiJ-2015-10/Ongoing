package Revision;

import java.io.IOException;


public interface Document {
	
	void load (Object file);
	
	void save (String name) throws IOException;
	
	

}
