package day2.Sample;
import java.util.Scanner;

public class Arguments {

	public static void main(String[] args) {
		
    System.out.println("Number of command-line arguments is " +args.length);
    for (int i=0; i<args.length;i++){
    	System.out.println("args [" +i +"] = "  +args[i]);
    }
    
    System.out.println("Please enter a labelel");
    //int str =nextInt(console);
    //String str = System.console().readLine();
   // System.out.println("You entered :" +str);
    
    String test = "f35";
    System.out.println(test.length());
    String minitest = test.substring(1);
    System.out.println(test.substring(1));
    Integer n = Integer.parseInt(minitest);
    
    
    
    
	}

}
