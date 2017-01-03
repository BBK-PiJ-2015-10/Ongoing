package concurrency.exer4;

import java.util.Scanner;


public class Exer4Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ResponsiveUI.LIMIT; i++){
			System.out.print("Enter the duration in milliseconds of task " + i + ": ");
			int newTime = sc.nextInt();
			Thread t = new Thread(new ResponsiveUI(newTime,i));
			t.start();
			if (!ResponsiveUI.buffer.equals("")){
				System.out.println("Finished task: " + ResponsiveUI.buffer);
				ResponsiveUI.buffer ="";
			}
			
		}
		
		

	}

}
