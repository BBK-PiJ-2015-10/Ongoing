package bloomberginterview;

import java.util.Arrays;
import java.util.List;

import junit.*;

public class Palindrome {

	public static void main(String[] args) {
		
	   //Palindrome pr = new Palindrome();
	   //pr.stringMethods();
	   
	   
	   	 evalTest(1,"tt",makePalindrome("t"));
		 evalTest(2,"tt",makePalindrome("tt"));
		 evalTest(3,"taat",makePalindrome("taat"));
		 evalTest(4,"",makePalindrome(""));
		 evalTest(5,"ata",makePalindrome("ta"));
		 evalTest(6,"taxat",makePalindrome("taxat"));
		 evalTest(7,"tttt",makePalindrome("tttt"));
		 evalTest(8,"tztzt",makePalindrome("ztzt"));
		 evalTest(9,"elale",makePalindrome("ale"));
		 evalTest(10,"otnotonto",makePalindrome("tonto"));
		

	}
	
	
	private void stringMethods(){
		
		 evalTest(1,"tt",makePalindrome("t"));
		 evalTest(2,"tt",makePalindrome("tt"));
		 evalTest(3,"taat",makePalindrome("taat"));
		 evalTest(4,"",makePalindrome(""));
		 evalTest(5,"ata",makePalindrome("ta"));
		 evalTest(6,"taxat",makePalindrome("taxat"));
		 evalTest(7,"tttt",makePalindrome("tttt"));
		 evalTest(8,"tztzt",makePalindrome("ztzt"));
		 evalTest(9,"elale",makePalindrome("ale"));
		 evalTest(10,"otnotonto",makePalindrome("tonto"));

	}
	
	
	public static String makePalindrome(String word){
		if (isPalindrome(word)){
			return word;
		}
		if (word.length()<=1){
			return word+word;
		}
		else {
			return makePalindromeAux(word,word.length(),0);
		}
		
	}
	
	public static String makePalindromeAux(String word,int take,int in){
		String toinsert=word.substring(take-1,take);
		String pre=word.substring(0,in);
		String end=word.substring(in);
		String newWord=pre+toinsert+end;
		if(isPalindrome(newWord)){
			return newWord;
		}
		else {
			return makePalindromeAux(newWord,take,in+1);
		}
	}
		
	
	public static boolean isPalindrome(String word){
		if (word.isEmpty() || word.length()<2){
			return false;
		}
		return isPalindromeAux(word);
	}
	
	public static boolean isPalindromeAux(String word){
		if (word.length()==1){
			return true;
		}
		char first=word.charAt(0);
		char last=word.charAt(word.length()-1);
		if (first==last){
			int newLength=word.length()-2;
			if (newLength>0){
				String newWord=word.substring(1,word.length()-1);
				return isPalindromeAux(newWord);
			}
			else {
				return true;
			}		
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	public static void evalTest(int test,String expected,String result){
		if (expected.equals(result)){
			System.out.println("Test: "+ test +" passed");
		}
		else {
			System.out.println("Test : "+ test +" failed");
		}
	}
	
	
	
	
	
	

}
