package day19lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Arrays;


public class exer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] mynames = {"yasser","alejandro","alberto","palacios","otero"};
		
		System.out.println(allMatches(Arrays.asList(mynames), n -> n.contains("al")));
		
		System.out.println(allMatches(Arrays.asList(mynames),n-> n.length() < 6));
		
		
	

	}
	
	public static <T> List<T> allMatches(List<T> candidates, Predicate<T> evaluator ){
		List<T> results = new ArrayList<T>();
		for (T candidate : candidates){
			if (evaluator.test(candidate)){
				results.add(candidate);
			}
		}
		return results;
	}

}
