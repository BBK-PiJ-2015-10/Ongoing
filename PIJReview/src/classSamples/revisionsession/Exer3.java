package classSamples.revisionsession;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;

import java.util.List;
import java.util.ArrayList;


public class Exer3 {

	public static class AgeTracker {
		
		Integer count;
		
		Integer age;
		
		public AgeTracker(Integer count, Integer age ){
			this.count=count;
			this.age=age;
		}
		
		public Integer getAge(){
			return this.age;
		}
		
		public Integer getCount(){
			return this.count;
		}
		
	}
	
	public static Integer minCount(List<AgeTracker> input){
		Integer minAge = Integer.MAX_VALUE;
		Integer minCount =Integer.MAX_VALUE; 
		Iterator<AgeTracker> itr = input.iterator();
		while (itr.hasNext()){
			AgeTracker temp = itr.next();
			if(temp.getCount()==minCount){
				if (temp.getAge()<minAge){
					minAge=temp.getAge();
				}
			}
			else if(temp.getCount()<minCount){
				minAge=temp.getAge();
			}
		}
		return minAge;
	}
	
	public static Integer rarestAge(Map<String,Integer> input){
		if (input.size()==0){
			throw new IllegalArgumentException();
		}
		Map<Integer,Integer> agemap = new HashMap<>();
		Iterator<String> nameitr = input.keySet().iterator();
		while (nameitr.hasNext()){
			agemap.put(input.get(nameitr.next()),0);
		}
		while (nameitr.hasNext()){
			Integer age;
			age = input.get(nameitr.next());
			agemap.put(age,agemap.get(age)+1 );
		}
		Iterator<Integer> ageiter = agemap.keySet().iterator();
		List<AgeTracker> agetrackerlist = new ArrayList<>();
		
		while (ageiter.hasNext()){
			Integer age;
			age = ageiter.next();
			agetrackerlist.add(new AgeTracker(agemap.get(age),age));
		}
		return minCount(agetrackerlist);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> tester = new HashMap<>();
		tester.put("Alyssa", 22);
		tester.put("Char", 25);
		tester.put("Dan", 25);
		tester.put("Jeff", 20);
		tester.put("Casey", 20);
		tester.put("Kim", 20);
		tester.put("Morgan", 25);
		tester.put("Ryan", 25);
		tester.put("Steff", 22);
		
		//tester.values().forEach(n->System.out.println(n));
		System.out.println(rarestAge(tester));
		
		
		//Map<String,Integer> tester2 = new HashMap<>();
		//tester2.putAll(tester);
		//tester2 = tester;
		//tester2.remove("ale");
		//System.out.println(tester.size());
		
		

	}

}
