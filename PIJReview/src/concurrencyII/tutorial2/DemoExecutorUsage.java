package concurrencyII.tutorial2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorUsage {
	
	private static ExecutorService executor = null;
	
	private static volatile Future taskOneResults = null;
	
	private static volatile Future taskTwoResults = null;

	public static void main(String[] args) {
		
		executor = Executors.newFixedThreadPool(2);
		
		while (true) {
		
			try {
				checkTasks();
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}    
			
		}
		
	}
	
	private static void checkTasks() {
		
		if (taskOneResults == null
				|| taskOneResults.isDone()
				|| taskOneResults.isCancelled()){
			taskOneResults = executor.submit(new TestOne());
		}
		
		if (taskTwoResults == null 
				|| taskTwoResults.isDone()
				|| taskTwoResults.isCancelled()){
			taskTwoResults = executor.submit(new TestTwo());
		}
		
		
		
	}

}
