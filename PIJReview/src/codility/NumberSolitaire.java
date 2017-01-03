package codility;

import java.util.Arrays;

import java.util.List;
import java.util.LinkedList;

public class NumberSolitaire {

	public static void main(String[] args) {
		
		//In a given array, find the subset of maximal sum in which the distance 
		//between consecutive elements is at most 6
		
		int[] test = {1,-2,0,9,-1,-2};
		//-1 -5 -1
		int[] test2 = {-1,-2,-3,-4,-3,-8,-5,-2,-3,-4,-5,-6,-1};
		
		//List<Integer> tester = createList(test2);
		
		
		
		NumberSolitaire sol = new NumberSolitaire();
		
		//System.out.println(sol.largeEnough(test,5));
		System.out.println(sol.helper(test,0,0));
		
		//System.out.println(sol.solution(test2));
		//List<Integer> tester = sol.createList(test2);
		//int val = sol.createList(test2).size();
		//System.out.println(val);
		//sol.createList(test2).subList(6,12).forEach(System.out::println);
		
		//System.out.println(sol.createList(test2).get(val-1));
		//test2.subList(1,5).forEach(System.out::println);
		
		//System.out.println(sol.solution(test2));
		
		
	}
	

	public int solution(int[] A){
		return helper(A,0,0);
	}
	
	public int helper(int[]B,int pos,int cum){
		int upper=pos+5;
		int max = Integer.MIN_VALUE;
		int newpos=pos;
		if (upper > B.length){
			upper=B.length-1;
			
		}
		for (int i=pos;i<=upper;i++){
			if (B[i]>max){
				max=B[i];
				newpos=i+1;
			}
		}
		if(largeEnough(B,newpos)){
			System.out.println("New poss is " +(newpos));
			return helper(B,newpos,cum+max);
		}
		else {
			return cum+max;
		}
		
	}
	
	public boolean largeEnough(int[]B,int pos){
		if (B.length>=pos+1){
			return true;
		}
		else{
			return false;
		}
		
	}
	

	
}
