package bloomberginterview;

import java.util.Arrays;
import java.util.List;

import junit.*;

public class StringPractice {

	public static void main(String[] args) {
		
	   StringPractice pr = new StringPractice();
	   pr.stringMethods();
		

	}
	
	
	private void stringMethods(){
		
		String name ="canepa";
		//ystem.out.println(name.substring(0,1));
		//System.out.println(name.substring(name.length()-1,name.length()));
		
		System.out.println(name.substring(1,2));

	}
	
	
	private String condensed(String input){
		String result ="";
		for (String word: Arrays.asList(input.split(" ")) ){
			result+=word;
		}
		return result;
	}
	
	
	private String condensedNonTailRec(String input){
		if (!input.contains(" ")){
			return input;
		}
		int pos = input.indexOf(" ");
		int next = pos+1;
		int last = input.length();
		String head=input.substring(0,pos);
		if (last>=next){
			String tail=input.substring(next);
			return head + condensedNonTailRec(tail);
		}
		else {
			return head;
		}
	}
	
	private String condensedTailRec(String input){
		if (!input.contains(" ")){
			return input;
		}
		else {
			return helperTR(input,"");
		}
		
	}
	
	private String helperTR(String input, String accum){
		if (!input.contains(" ") && (!input.isEmpty())){
			return accum+input;
		}
		int pos = input.indexOf(" ");
		int next = pos+1;
		int last = input.length();
		String head=input.substring(0,pos);
		String newAccum=accum+head;
		if (last>=next){
			String tail=input.substring(next);
			return helperTR(tail,(newAccum));
		}
			return newAccum;	
	}
	
	
	
	

}
