package classSamples.generics;

import java.util.Arrays;
import java.util.List;

public class Practice {

	public static <T> int counter(List<T> inputlist){
		return inputlist.size();
	}
	
	
	public static void main(String[] args) {
		
		List<String> nicknames = Arrays.asList("cane","biruta","tonto");
		System.out.println(counter(nicknames));
	
	}

}
