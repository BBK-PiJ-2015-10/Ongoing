package concurrencyII.exer1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;


public class DriverExer1 {

	public static void main(String[] args) {
		
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))){
			System.out.println("Usage: java TextLoop<mode>");
			System.out.println("    mode 0: without threads");
			System.out.println("    mode 1: with threads");
		} else if (args[0].equals("0")){
			for (int i=0;i<10;i++){
				Runnable r = new TextLoop("Thread "+i);
				r.run();
			}
		} else {
			ExecutorService e = Executors.newFixedThreadPool(5);
			for (int i=0;i<10;i++){
				Runnable r = new TextLoop("Thread "+i);
				e.execute(r);
			}
		}
		
	
		
		
		

	}

}
