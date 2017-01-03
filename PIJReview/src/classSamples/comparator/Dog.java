package classSamples.comparator;

import java.util.Comparator;
//import java.util.Comparable;

public class Dog implements Comparator<Dog>, Comparable<Dog>  {

	private String name;
	
	private int age;
	
	public Dog(){
	}
	
	public Dog(String name, int age){
		this.name =name;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Integer getAge(){
		return this.age;
	}

	//This is the implementation of Comparable
	@Override
	public int compareTo(Dog d) {
		return (this.getName().compareTo(d.getName()));
	}

	//This is the method of comparator
	//You can use a different comparison criteria.
	@Override
	public int compare(Dog arg0, Dog arg1) {
		return arg0.getAge().compareTo(arg1.getAge());
		//return arg0.getAge()-arg1.getAge();
	}
	
	
}
