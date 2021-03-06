package theappbusiness;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class JavaArray {
	
	public static void main(String[] args) {
		
		JavaArray ja = new JavaArray();
		ja.executor();		
		
	}
	
	private Scanner sc;
	
	private String validAddress = "src/theappbusiness/inputJavaArray.txt";
			
	private File file = new File(validAddress);
		
	public void intScanner(){
		try {
			sc  = new Scanner(new FileReader(file));
		} catch (FileNotFoundException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	private ArrayList<ArrayList<Integer>> list = new ArrayList();
	
	
	private void executor(){
		
		intScanner();
		
		int arrayNumbers=sc.nextInt();
			
		for (int i=1;i<=arrayNumbers;i++){
			int arraySize=sc.nextInt();
			ArrayList<Integer> temp = new ArrayList(); 
			for (int k=0;k<arraySize;k++){
				int element=sc.nextInt();
				temp.add(element);
			}
			list.add(temp);	
		}
						
		int queries=sc.nextInt();
		for (int i=0;i<queries;i++){
			int index1=sc.nextInt();
			int index2=sc.nextInt();
			System.out.println(getValue(index1,index2));
		}
	
	}
	
	
	private String getValue(int firstIndex, int secondIndex){
		if (list.size()>=firstIndex){
			if(list.get(firstIndex-1).size()>=secondIndex){
				return list.get(firstIndex-1).get(secondIndex-1).toString();
			}
		}
		return "ERROR!";	
	}
	
	
}


