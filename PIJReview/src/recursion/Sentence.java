package recursion;

import searching.BinarySearcher;

public class Sentence {
	
	
	public static void main(String[] args) {	
		
		String name="aaaaaaa";
		
		Sentence sen = new Sentence();
		System.out.println(sen.isPalindrome(name));
		//System.out.println(name.substring(1));
		//System.out.println(name.substring(0,5));
		//System.out.println(name.substring(1,name.length()-1));
		
		//System.out.println(name.charAt(0));
		//System.out.println(name.charAt(name.length()-1));
		//System.out.println("Printing this sucker again");
		
	}
	
	public boolean isPalindrome(String text){
		if (text.length()<=1){
			return false;
		}
		if (text.length()==2){
			if ((text.charAt(0)==text.charAt(text.length()-1))){
				return true;
			}	
		}
		if (!(text.charAt(0)==text.charAt(text.length()-1))){
			return false;
		}
		else {
			return isPalindrome(text.substring(1,text.length()-1));
		}
	}

}