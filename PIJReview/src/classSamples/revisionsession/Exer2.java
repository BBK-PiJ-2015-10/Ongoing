package classSamples.revisionsession;

import java.util.List;
import java.util.ArrayList;

public class Exer2 {

	
	public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> input){
		ArrayList<Integer> result = new ArrayList<>();
		int counter =0;
		boolean done = false;
		boolean added = false;
		if (input.size() == 0 || input.size() == 1){
			result = input;
		}
		else {
			if (input.size() % 2 != 0){
				input.add(input.get(0));
				added = true;
			}
			while (!done){
				if (input.get(counter)<=input.get(counter+1)){
					result.add(input.get(counter));
					result.add(input.get(counter+1));
					if ((counter+1 == (input.size()-1)) && added){
						result.remove(result.size()-1);
					}
					
				}
				counter = counter+2;
				if (counter >= input.size()){
					done = true;
				}
			}	
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> tester = new ArrayList<>();
		tester.add(5);
		tester.add(3);
		tester.add(1);
		
		System.out.println(tester);
		System.out.println(removeBadPairs(tester));
	}

}
