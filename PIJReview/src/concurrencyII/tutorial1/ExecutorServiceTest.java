package concurrencyII.tutorial1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {
	
	private static Future taskTwo = null;
	
	private static Future taskThree = null;
	
	public static void main (String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable taskOne = new MyTask("TaskOne",2,1000);
		executor.execute(taskOne);
		
		for (int i =0; i < 2; i++){
			
			if ( (taskTwo == null) || (taskTwo.isDone()) || (taskTwo.isCancelled()) ){
				taskTwo = executor.submit(new MyTask("TaskTwo",4,2000));
			}
			
			if ( (taskThree == null) || (taskThree.isDone()) || (taskThree.isCancelled()) ){
				taskThree = executor.submit(new MyTask("TaskThree",5,1000));
			}
			
			if ( taskTwo.get() == null){
				System.out.println(i+1 + ") TaskTwo terminated successfully");
			} else {
				System.out.println("I am cancelling task two");
				taskTwo.cancel(true);
			}
			
			if ( taskThree.get() == null){
				System.out.println(i+1 + ") TaskThree terminated successfully");
			} else {
				System.out.println("I am cancelling task three");
				taskThree.cancel(true);
			}
			
		}
		
		executor.shutdown();
		System.out.println("----------------------------");
		executor.awaitTermination(1,TimeUnit.SECONDS);
		System.out.println("All tasked are finished");

		
	}

}
