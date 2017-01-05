package recursion;

import java.util.ArrayList;

public class PermutationGenerator {

	private String word;

	public PermutationGenerator(String word){
		this.word=word;
	}
	
	public ArrayList<String> getPermutations(){
		
		ArrayList<String> permutations = new ArrayList();
		
		if (word.length()==0){
			permutations.add(word);
			return permutations;
		}
		
		//Loop thru all character positions
		
		for (int i=0;i<word.length();i++){
			
			//Form a simple word by removing the ith character
			String shorterWord = word.substring(0, i)+word.substring(i+1);
			
			//Generate all permutations of the simpler word
			PermutationGenerator shorterPermutationGenerator = new PermutationGenerator(shorterWord);
			ArrayList<String> shorterWordPermutations = shorterPermutationGenerator.getPermutations();
			
			//Add the removed charcater to the front of each permutation of the simpler word
			for (String s: shorterWordPermutations){
				permutations.add(word.charAt(i)+s);
			}
			
		}
		
		return permutations;
		
	}
	
	
	
	public static void main(String[] args) {
		
		 PermutationGenerator pm = new PermutationGenerator("eat");
		 pm.getPermutations().forEach(System.out::println);
		
		
	}
	
	

}
