package classSamples.revisionsession.classSamples;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class Final {

	void aMethod(final int i, final int j) {
		 int temp = i;
		 //i = j;
		 //j = temp;
	     System.out.println("i = " + i + " j = " + j);
    }
	
	 //public List<Integer> bMethod(List<Integer> list) {
		// List<Integer> result = new LinkedList<>();
		 
		 
	 //}
	
	 
	 public void aMethod(final List<Integer> inputlist){
		 inputlist.add(23);
	 }
	 
	 public void myLaunch(){
		 
			//List<Integer> myDigits = new LinkedList<>();
			//myDigits = Arrays.asList("140","124");
			//myDigits.forEach(System.out::println);
		    List<Integer> myDigits = new LinkedList<>();
		    myDigits.add(234);
		    System.out.println(myDigits.size());
		    aMethod(myDigits);
		    System.out.println(myDigits.size());
		    
		    //System.out.println(aMethod(myDigits));
			//bMethod(myDigits);
		 
		 
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Final script = new Final();
		script.myLaunch();
		
		
		//List<Integer> myDigits = Arrays.asList(140,124);
		//myDigits.forEach(System.out::println);
		//bMethod(myDigits);
		//myDigits.forEach(System.out::println);
		

		
	}

}
