package sampleQuestionsPDF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exer1to31 {
	
	public class Person {
		
		private String firstName;
		
		private String lastName;
		
		public Person(String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		
		@Override
		public String toString(){
			StringBuilder sb = new StringBuilder();
			sb.append(firstName);
			sb.append(" ");
			sb.append(lastName);
			return sb.toString(); 
		}
		
		@Override
		public boolean equals(Object obj){
			if (!(obj instanceof Person)){
				return false;
			}
			if (this==obj){
				return true;
			}	
			    Person other = (Person) obj;
				return (this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName));
		}
		
	}
	
	public void exer1(){
		ArrayList list = new ArrayList();
		list.add("P");
		list.add("Q");
		list.add("R");
		list.set(2, "s");
		list.add(2,"T");
		list.add("u");
		System.out.println(list);	
	}
	
	public void exer2(){
		
		Person ale = new Person("Alejandro","Palacios");
		System.out.println(ale);
		
		Person yas = new Person("Alejandro","Palacios");
		System.out.println(ale.equals(yas));
		
	}
	
	static void fiddle(int[] test, int element){
		test[0]=10;
		test[1]=11;
		element +=7;
		System.out.println(test[0]+","+test[1]+","+element);
		test = new int[2];
		test[0]=20;
		test[1]=21;
	}
	
	public void exer3(){
		
		int[] test = new int[2];
		test[0] = test[1] =5;
		System.out.println(test[0]+","+test[1]);
		fiddle(test,test[1]);
		System.out.println(test[0]+","+test[1]);
		
	}
	
	public int countDigitLooping(int n, int digit){
		String temp = ((Integer) n).toString();
		char comp = (((Integer) digit).toString()).charAt(0);
		int count =0;
		for (int i=0;i<temp.length();i++){
			if(temp.charAt(i) == comp){
				count ++;
			}
		}		
		return count;
	}
	
	
	public int countDigit(int n, int digit){
		String temp = ((Integer) n).toString();
		char comp = (((Integer) digit).toString()).charAt(0);
		int cum =0;
		return countDigit(temp,comp,cum);
	}
	
	public int countDigit(String n, char comp,int cum){
		if (n.isEmpty()) {
				return cum;
		}
		else {
			if (n.charAt(0)==comp){
				cum++;	
			}
			return countDigit(n.substring(1),comp,cum);
			
		}
	}
	
	public int countDigit2(int n, int digit){
		int BASE =10;
		if (n==0){
			return 0;
		}
		if (n % BASE == digit){
			return 1+countDigit(n/BASE,digit);
		}
		else {
			return countDigit(n/BASE,digit);
		}
	}
	
	public void exer28(){
		
		System.out.println(countDigit2(1001,0));
		
	}
	
	public int exponentiate(int x, int n){
		if (n==0){
			return 1;
		}
		else {
			return x * exponentiate(x,n-1);
		}
	}
	
	public void exer29(){
		
		System.out.println(exponentiate(-3,4));
	}
	
	public int fibN(int num, int terms){
		int total=0;
		if (num <=1){
			return 1;
		}
		else {
			for (int i =1;i<=terms;i++){
				total +=fibN(num-i,terms);
			}
			return total;
		}
	
	}
	
	public void exer30(){
	    //ystem.out.println(fibN(1,2));
		//List<Integer> mylist = new LinkedList<>();
		//mylist.add(1);
		//System.out.println(mylist.size());
		//tester(mylist);
		//System.out.println(mylist.size());
		//\String tonto = "ale";
		//System.out.println(tonto);
		//System.out.println(tester2(tonto));
		//System.out.println(tonto);
		
	}
	
	public void tester (List<Integer> list){
		list.add(10);
	}
	
	public void tester2 (String input){
		input=input+"palacios";
	}

	public static void main(String[] args) {
		
		Exer1to31 exercises = new Exer1to31();
		exercises.exer30();

	}

}
