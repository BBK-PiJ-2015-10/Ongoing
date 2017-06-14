package theappbusiness.priorityqueue;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Solution2 {
	
	private String fileAddress = "src/theappbusiness/inputPriorQueue.txt";
	
	private File file = new File(fileAddress);
	
	private Scanner in;
	
	private void initScanner(){
		try {
			in = new Scanner(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Solution2 sol = new Solution2();
		sol.run();
		
	
		
	}
	
	
	private void run(){
		//Scanner in = new Scanner(System.in);
		
		StudentComparator stuComp = new StudentComparator();
		
		PriorityQueue<Student2> studentQueue = new PriorityQueue(stuComp);
		
		initScanner();
		int totalEvents = Integer.parseInt(in.nextLine());
		while (totalEvents>0){
			String input = in.nextLine();
			String[] inputArray = input.split(" ");
			if (inputArray.length!=1){
				Student2 tempStudent = new Student2();
				tempStudent.setName(inputArray[1]);
				tempStudent.setGpa(Double.parseDouble(inputArray[2]));
				tempStudent.setToken(Integer.parseInt(inputArray[3]));
				studentQueue.add(tempStudent);
			}
			else {
				System.out.println("Just served: " +studentQueue.remove());
				
			}
			totalEvents--;
		}
		while(!studentQueue.isEmpty()){
			System.out.println(studentQueue.remove().getName());
		}
	}

}
