package mavenIgniteFirst;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;


public class HelloWorldCompute {

	public static void main(String[] args) throws InterruptedException {
		
		try (Ignite ignite =Ignition.start()){
			
			ignite.compute().broadcast(()->System.out.println("Hello World"));
			
		}
		
		
		System.out.println("You better be working");	
	
		
		
		

	}

}
