package classSamples.revisionsession.classSamples;

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class StackTest {
	
	public class Person {
		
		private String name;
		
		public Person (String name){
			this.name=name;
		}
		
	}
	
	public class Student extends Person {
		
		private String major;
		
		public Student(String name, String major){
			super(name);
			this.major=major;
		}
		
	}
	
	public void launch(){
		
		Person first = new Person("Ale");
		Person second = new Person("Cane");
		
		Student prim = new Student("Bibio","CS");
		Student seg = new Student("Mon","IS");
		
		List<Person> listp = new LinkedList<Person>();
		listp.add(first);
		listp.add(second);
		listp.add(prim);
		
		//Generics in Java are invariant, I can't declare a list 
		//of Person and assign a LinkedList of students.
				
		
		Person[] arrap;
		Student[] arras = {prim,seg};
		arrap = arras;
		
		//arrap.
		
		//Person[[]] darra;
		
		
		
		//System.out.println(dlist.size());
		
		
	}

	public static void main(String[] args) {
		
		StackTest script = new StackTest();
		script.launch();
		

	}

}
