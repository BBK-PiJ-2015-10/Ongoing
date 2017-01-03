package interviewprep;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

import java.util.List;
import java.util.LinkedList;

public class InterviewPrepPractice {

	public static void main(String[] args) {
		
		Patient first = new Patient("Ale","Cane");
		
		Patient second = new Patient("Ale","Cane");
		
		Patient fifth = new Patient("Ale","Biruta");
		
		Patient seventh = new Patient("Ale","Biruta");
		
		
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());
		
		System.out.println(first.equals(second));
		
		Set hset = new HashSet();
		hset.add(first);
		hset.add(second);
		hset.add(null);
		hset.add(fifth);
		System.out.println(hset.size());
		
		Set h2set = new HashSet();
		h2set.add(first);
		h2set.add(second);
		h2set.add(null);
		h2set.add(fifth);
		
		System.out.println(h2set.equals(hset));
		System.out.println(h2set.hashCode());
		System.out.println(hset.hashCode());
		
		List list = new LinkedList();
		list.add(first);
		list.add(second);
		list.add(null);
		
		
		System.out.println(list.size());
		
		Set tset = new TreeSet<Patient>();
		tset.add(first);
		tset.add(second);
		System.out.println(tset.size());
		
		
		
		Patient third = second;
		System.out.println(third.hashCode());
		
		System.out.println(third.equals(second));
		
		Patient fourth = null;
		
		String ales = "tonto";
		String ales2 = "tonto";
				
		System.out.println(ales.hashCode());
		System.out.println(ales2.hashCode());
		
		System.out.println("Aa".hashCode());
		
		System.out.println("BB".hashCode());
		
		Set<String> tester = new HashSet<>();
		tester.add("ale");
		tester.add("ALE");
		//tester.add("Aa");
		//tester.add("BB");
		
		System.out.println(tester.size());
		
		System.out.println(fifth.hashCode());
		
		System.out.println(seventh.hashCode());
		
		//tester.contains
		
		Set<Patient> testerhc = new HashSet<>();
		testerhc.add(fifth);
		testerhc.add(seventh);
		
		System.out.println(testerhc.size());
		
		

	}

}
