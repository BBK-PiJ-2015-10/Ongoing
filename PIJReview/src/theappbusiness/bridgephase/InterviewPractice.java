package theappbusiness.bridgephase;

import java.util.List;
import java.util.LinkedList;

import java.util.Map;
import java.util.HashMap;

import java.util.Collections;
import java.util.stream.Collectors;

public class InterviewPractice {

	public static void main(String[] args) {
		
		InterviewPractice ip = new InterviewPractice();
		ip.run();

	}
	
	private String[] firstNames = {"yasser","alejandro","alberto"};
	
	private String[] lastNames = {"palacios","otero","cortez"};
	
	private int[] ages = {39,40,41};
	
	private List<Person> persons = new LinkedList();
	
	private Map<String,Person> personMap = new HashMap();
	
	private void run(){
		
		/*
		populateList();
		persons.forEach(System.out::println);
		System.out.println();
		List<Person> tempList = getUnmodifiableList();
		Person first = tempList.get(0);
		first.setFirstName("Culoncito");
		persons.forEach(System.out::println);
		 */
		
		/*
		populateMap();
		personMap.values().forEach(System.out::println);
		System.out.println();
		List<Person> tempList = getUnmodifiableList();;
		Person first = tempList.get(0);
		first.setFirstName("Culoncito");
		personMap.values().forEach(System.out::println);
		*/
		
		Person first = new Person("yasser","alejandro",35);
		try {
			Person second = ((Person) first.clone());
			second.setAge(31);
			
		}
		catch (CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		
		
		//second.setAge(31);
		System.out.println(first);
		
		
	}
	
	private void populateList(){
		for (int i=0;i<firstNames.length;i++){
			Person temp = new Person(firstNames[i],lastNames[i],ages[i]);
			persons.add(temp);
		}
	}
	
	
	private void populateMap(){
		for (int i=0;i<firstNames.length;i++){
			Person temp = new Person(firstNames[i],lastNames[i],ages[i]);
			personMap.put(firstNames[i],temp);
		}
	}
	
	private List<Person> getNormalList(){
		List<Person >result = personMap.values().stream().collect(Collectors.toList());
		return result;
		//return persons;
	}
	
	private List<Person> getUnmodifiableList(){
		List<Person >result = personMap.values().stream().collect(Collectors.toList());
		return Collections.unmodifiableList(result);
		//return Collections.unmodifiableList(persons);
	}


}
