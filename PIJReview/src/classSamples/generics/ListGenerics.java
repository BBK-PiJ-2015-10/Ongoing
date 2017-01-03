package classSamples.generics;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class ListGenerics {
	
	public static void printListOfStrings(List<String> input){
		input.forEach(System.out::println);
	}
	
	public static void printListAgain(List<?> input){
		input.forEach(System.out::println);
	}
	

	public static void main(String[] args) {
		
		List<String> stringlist = Arrays.asList("Yasser","Alejandro","Canile");
		printListOfStrings(stringlist);
		printListAgain(stringlist);
		
	
		
		
		

	}

}
