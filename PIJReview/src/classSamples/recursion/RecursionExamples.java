package classSamples.recursion;

import java.util.List;
import java.util.Arrays;


public class RecursionExamples {
	
	public static void getAnagrams(String prefix,String word){
		if (word.length()<=1){
			System.out.println(prefix+word);
		} else {
		  for (int i=0;i<word.length();i++){
			  String current = word.substring(i,i+1);
			  String before = word.substring(0,i);
			  String after = word.substring(i+1);
			  getAnagrams(prefix + current, before+after);
		  }

		}	
	}
	
	public static boolean find(List<String> lst, String s){
		if (lst == null) return false;
		if (lst.isEmpty()) return false;
		if (lst.size()==1 ) return lst.get(0).equals(s);
		int pivot = lst.size()/2;
		return find(lst.subList(0,pivot),s) || find(lst.subList(pivot,lst.size()),s);
	}
	
	public static void example(int n){
		if (n<=0) return;
		System.out.println(n);
		example(n-2);
		example(n-3);
		System.out.println(n);	
	}
	
	
	//public static 

	public static void main(String[] args) {
		
		//getAnagrams("","el");
		
		//List<String> myName = Arrays.asList("yasser","alejandro","palacios","otero");
		//System.out.println(find(myName,"er"));
		
		example(5);
		
	

	}

}
