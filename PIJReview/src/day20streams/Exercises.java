package day20streams;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import java.util.Optional;


public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words1 = 
		        Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
		    //System.out.printf("Original words: %s.%n", words1);
		
		List<String> words = Arrays.asList("hi","hello","bonjour","ciao","noidea");
		//System.out.printf("Original words: %s.%n",words);
		
		//Answer1
		//words.stream().forEach(n->System.out.printf("  "+n));
		
		//words.forEach(System.out::println);
		
		//Answer2
		//words.stream().forEach(n->System.out.print(" "+n));
		
		//Answer3
		
		//words.stream().map(n->n+"!").forEach(n->System.out.println(n));
	
			
		//words.stream().map(n->n.replace("a", "ii")).forEach(n->System.out.println(n));
		
		//words.stream().map(n->n.toUpperCase()).forEach(n->System.out.println(n));
		
		//words.stream().map(n->n.toUpperCase()).forEach(System.out::println);
		
		//words.stream().map(String::toUpperCase).forEach(n->System.out.println(n));
		
		//Answer4
		
		//words.stream().filter(n->n.length()<3).forEach(n->System.out.println(n));
		
		
		//words.stream().filter(n->n.contains("b")).forEach(n->System.out.println(n));
		
		//words.stream().filter(n->n.length() % 2 == 0).forEach(n->System.out.println(n));
		
		//Answer5
		
		//words.stream().filter(n->n.length()>5).filter(n->n.contains("e")).map(String::toUpperCase)
		//.forEach(n->System.out.println(n));
				
		
		//Answer7
		
		//System.out.println(words.stream().reduce("",(n1,n2)->n1+n2.toUpperCase()));
		
		
		//Answer8
		
		//System.out.println(words.stream().map(String::toUpperCase).reduce("",(n1,n2)->n1+n2));
		
		//Answer 10
		
		//System.out.println(randomNumberList(5));
		
		//Answer 11
		
		//System.out.println(orderNumberList(4));
		
		//Answer 12
		
		List<Integer> test = new ArrayList<>();
		for (int i=3;i<6;i++){
			test.add(i);
		}
		
		
		//System.out.println(sum1(test));
		
		//System.out.println(sum2(test));
	
	    //Answer 12 only even
		
		///*
		int res1 = test.stream().reduce(0,(a,b)->{
			if (b % 2 == 0){
				return a+b;
			}
			else{
				return a;
			}
		});
		
		
		System.out.println(res1);
		
		//*/
		
		//Answer13
		
		//System.out.println(test.parallelStream().reduce(0,(a,b)->(a+b),(a,b)->(a+b)));
		
		//Answer14
		
		
		/*
		List<Double> test2 = new ArrayList<>();
		test2.add(3.0);
		test2.add(4.0);
		test2.add(5.0);
		test2.add(10.0);
		
		
		System.out.println(test);
		System.out.println(test.stream().reduce(1,(a,b)->(a*b)));
		System.out.println(test2.stream().reduce(1.0,(a,b)->(a*b)));
		System.out.println(test2.parallelStream().reduce(1.0,(a,b)->(a*b)));
		
		*/

	}
	
	public static List<Double> randomNumberList(int size){
		List<Double> randomlist = new ArrayList<>();
		Random random = new Random();
		for (int i=0;i<size;i++){
			randomlist.add(random.nextDouble());
		}
		return randomlist;
		
	}
	
	public static List<Integer> orderNumberList(int n){
		List<Integer> orderlist = new ArrayList<>();
		Random random = new Random();	
		for (int i=0;i<n;i++){
			orderlist.add(random.nextInt(500));
		}
		orderlist.sort((n1,n2)->(n1-n2));
		return orderlist;
	}
	
	public static int sum1(List<Integer> inputlist){
		return inputlist.stream().reduce(0,(a,b)->(a+b));
	}
	
	public static int sum2(List<Integer> inputlist){
		Optional<Integer> result = inputlist.stream().reduce((a,b)->(a+b));
		return result.get();
	}
	
	//public static int sumEven1(List<Integer> inputlist){
		//Optional<Integer> result = inputlist.stream().
		//reduce((a,b)->{
			//if (a % 2 == 0){
				//a+b;
			//}
			//else {
				//return b;
			//}
		//});
		//return result;
	//}

}
