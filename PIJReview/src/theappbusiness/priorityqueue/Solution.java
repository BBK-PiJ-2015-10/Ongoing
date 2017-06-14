package theappbusiness.priorityqueue;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Solution {
	
	private String fileAddress = "src/theappbusiness/inputPriorQueue2.txt";
	
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
		
		//Solution sol = new Solution();
		//sol.run();
		
		String first = "ALejandro";
		String second = "palacios";
		//System.out.println(first.compareTo(second));
		
	}
	
	
	private void run(){
		//Scanner in = new Scanner(System.in);
		
		PriorityQueue<Student> studentQueue = new PriorityQueue();
		
		initScanner();
		int totalEvents = Integer.parseInt(in.nextLine());
		while (totalEvents>0){
			String input = in.nextLine();
			String[] inputArray = input.split(" ");
			if (inputArray.length!=1){
				Student tempStudent = new Student();
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
