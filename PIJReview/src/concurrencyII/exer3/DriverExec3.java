package concurrencyII.exer3;

import java.util.concurrent.Executor;

import concurrencyII.exer2.Task;

public class DriverExec3 {

	public static void main(String[] args) {
		
		System.out.println("Starting");
		Executor me = new Task();
		MySerialExecutor e = new MySerialExecutor(me);
		for (int i =1; i < 5; i++){
			Runnable r = new TimedTask(i * 20);
			System.out.println("Max time currently is: " + e.getMaxPendingTime());
			e.execute(r);
			System.out.println("Max time now is: " + e.getMaxPendingTime());
		}
		
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException ex){
			
		}
		
		
		System.out.println("Finally the max time is now: " + e.getMaxPendingTime());

	}

}
