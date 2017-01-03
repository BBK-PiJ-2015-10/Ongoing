package concurrencyII.exer4a;

import concurrencyII.exer2.SerialExecutor;
import concurrencyII.exer2.Task;
import java.util.concurrent.Executor;

import java.util.Scanner;


public class Exer4Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Executor e = new SerialExecutor(new Task());
		for (int i = 0; i < ResponsiveUI.LIMIT; i++){
			System.out.print("Enter the duration in milliseconds of task " + i + ": ");
			int newTime = sc.nextInt();
			e.execute(new ResponsiveUI(newTime,i));
			//Thread t = new Thread(new ResponsiveUI(newTime,i));
			//t.start();
			if (!ResponsiveUI.buffer.equals("")){
				System.out.println("Finished task: " + ResponsiveUI.buffer);
				ResponsiveUI.buffer ="";
			}
			
		}
		
		

	}

}
