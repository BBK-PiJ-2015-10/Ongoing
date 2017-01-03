package day19lambda;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;


public class exer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] original = {"yasser","aleajndro","alberto","palacios","otero"};
		
		System.out.println(transformedList2(Arrays.asList(original),n->  "poly" + n));
		
		System.out.println(transformedList2(Arrays.asList(original),String::toUpperCase));
		
		System.out.println(transformedList2(Arrays.asList(original),n-> n.replace("a","ii")));
		
		
		

	}
	
	public static <T,R> List<R> transformedList2(List<T> inputlist, Function<T,R> transformer){
		List<R> results = new ArrayList<>();
		for (T elem: inputlist){
			results.add(transformer.apply(elem));
		}
		return results;
		
	}

}
