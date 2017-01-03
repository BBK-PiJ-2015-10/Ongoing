package proto1;

import java.util.Hashtable;

public class PegCache {
	
	private static Hashtable<String,Peg> pegMapGuess = new Hashtable<String,Peg>();
	
	public static Peg getPeg(String Pegid){
		return pegMapGuess.get(Pegid);
		//Peg cachedPeg =  pegMapGuess.get(Pegid);
		//return (Peg) cachedPeg.clone();
	}
	
	public static void loadPegsCache(){
		pegMapGuess.put("B",Blue.getInstance());
		pegMapGuess.put("R",Red.getInstance() );
		pegMapGuess.put("G",Green.getInstance());
		
		//Blue blue = Blue.getInstance();
		//pegMapGuess.put("B",blue);
		//Red red = Red.getInstance();
		//pegMapGuess.put("R",red);
		//Green green = Green.getInstance();
		//pegMapGuess.put("G",green);
		
	}

}
