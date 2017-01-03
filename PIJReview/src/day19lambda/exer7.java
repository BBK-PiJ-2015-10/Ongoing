package day19lambda;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class exer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] original = {"yasser","aleajndro","alberto","palacios","otero"};
		
		System.out.println(transformedList(Arrays.asList(original),n->  "poly" + n));
		
		System.out.println(transformedList(Arrays.asList(original),String::toUpperCase));
		
		System.out.println(transformedList(Arrays.asList(original),n-> n.replace("a","ii")));

	}
	
	public static List<String> transformedList(List<String> prelist, Function<String,String> transformer){
		List<String> results = new ArrayList<>();
		for (String preString : prelist){
			results.add(transformer.apply(preString));
		}
		return results;
	}

}
