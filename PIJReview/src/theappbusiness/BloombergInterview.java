package theappbusiness;

import java.util.TreeSet;

public class BloombergInterview {

	public static void main(String[] args) {
		

	}
	
	private static String formatNum(int num){
		String value =  new Integer(num).toString();
		String result="";
		int counter = value.length()-1;
		for (int i=0;i<value.length();i++){
			if ((counter % 3 == 0) && (counter!=0)){
				result=result+value.charAt(i)+",";
				counter--;
			}
			else {
				result=result+value.charAt(i);
				counter--;
			}
		}
		return result;
	}
	
	public static boolean isPalindrome(String input){
		if (input.isEmpty()){
			return false;
		}
		if (input.length() % 2 !=0){
			return false;
		}
		else {
			Character first=input.charAt(0);
			Character last=input.charAt(input.length()-1);
			if (!first.equals(last)){
				return false;
			}
			else {
				if (input.length()==2){
					return true;
				}
				else {
					return isPalindrome(input.substring(1,input.length()-1));
				}
			}
		}
	}
	
	public static boolean isPalindrome(int number){
		Integer input = number;
		return isPalindrome(input.toString());
	}
	
	
	
	public static void testPalin(String word,Boolean result,int test){
		if (result==isPalindrome(word)){
			System.out.println("Passed test " +test);
		}
		else {
			System.out.println("Failed test " +test);
		}
	}
	
	
	public static void testPalin(int number,Boolean result,int test){
		if (result==isPalindrome(number)){
			System.out.println("Passed test " +test);
		}
		else {
			System.out.println("Failed test " +test);
		}
	}
	

}
