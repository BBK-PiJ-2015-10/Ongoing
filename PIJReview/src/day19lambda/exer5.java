package day19lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Arrays;

public class exer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] original = {"yasser","aleajndro","alberto","palacios","otero"};
		
		System.out.println(allMatches(Arrays.asList(original), s-> s.length()> 7 ));
		
		System.out.println(allMatches(Arrays.asList(original),s->s.contains("al")));
		
		System.out.println(allMatches(Arrays.asList(original),s->(s.length() % 2 == 0)));
		
		System.out.println(Arrays.asList(original));
		

	}
	
	public static List<String> allMatches (List<String> candidates,Predicate<String> matchFunction){
		List<String> result = new ArrayList<>();
		for (String possiblehit : candidates){
			if (matchFunction.test(possiblehit)){
				result.add(possiblehit);
			}
		}
		return result;
		
	}

}
