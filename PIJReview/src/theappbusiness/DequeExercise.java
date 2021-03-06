package theappbusiness;

import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;

public class DequeExercise {

	public static void main(String[] args) {
		
		DequeExercise exer = new DequeExercise();
		
		int [] uc1 = {5,3,5,2,3,2};
		
	    //Deque<Integer> test = new ArrayDeque();
	    //test.addLast(2);
	    //System.out.println(test.getFirst());
		
		exer.testCase(uc1,3,3,1);
		
		///*
		exer.testCase(uc1,2,2,2);
		exer.testCase(uc1,4,3,3);
		exer.testCase(uc1,5,3,4);
		exer.testCase(uc1,1,1,5);
		exer.testCase(uc1,6,3,6);
		
		int [] uc2 = {2,2,2,2,2,2};
		exer.testCase(uc2,3,1,7);
		exer.testCase(uc2,2,1,8);
		exer.testCase(uc2,4,1,9);
		exer.testCase(uc2,5,1,10);
		exer.testCase(uc2,1,1,11);
		exer.testCase(uc2,1,1,12);
		
		int [] uc3 = {1,2,3,4,5,6};
		exer.testCase(uc3,3,3,13);
		exer.testCase(uc3,2,2,14);
		exer.testCase(uc3,4,4,15);
		exer.testCase(uc3,5,5,16);
		exer.testCase(uc3,1,1,17);
		exer.testCase(uc3,6,6,18);
		
		
		/*
		
		int size =3;
		int[] test = {5,3,5,2,3,2};
		
		Deque<Integer> deque = new ArrayDeque();
		
		int uniqueGlobalCount=0;
		int uniqueLocalCount=0;
		
		for (int i=0; i<test.length;i++){
			int num = test[i];
			if (deque.size()>=3){
				int elim = deque.removeFirst();
				if(uniqueLocalCount>uniqueGlobalCount){
					uniqueGlobalCount=uniqueLocalCount;
				}
				if(!deque.contains(elim)){
					uniqueLocalCount--;
				}
			}
			if (!deque.contains(num)){
				uniqueLocalCount++;
			}
			deque.addLast(num);
		}
		
		System.out.println(uniqueGlobalCount);
		
		*/
		
	}
	
	
	public int maxUnique(int[] values,int targetSize){
			
		Deque<Integer> deque = new ArrayDeque();
		
		int uniqueGlobalCount=0;
		int uniqueLocalCount=0;
		
		for (int i=0; i<values.length;i++){
			int num = values[i];
			if (deque.size()>=targetSize){
				int elim = deque.removeFirst();
				if(!deque.contains(elim)){
					uniqueLocalCount--;
				}
			}
			if (!deque.contains(num)){
				uniqueLocalCount++;
				if(uniqueLocalCount>uniqueGlobalCount){
					uniqueGlobalCount=uniqueLocalCount;
				}
			}
			deque.addLast(num);
		}
		return uniqueGlobalCount;
	}
	
	public void testCase(int[] values, int targetSize, int answer, int testRef){
		if(answer==maxUniqueOpt(values,targetSize)){
			System.out.println("Passed test " +testRef);
		}
		else {
			System.out.println("Failed test " +testRef);
		}
	}
	
	
	public int maxUniqueOpt(int[] values, int targetSize){
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		Map<Integer,Integer> map = new HashMap();
		
		int maxUnique=0;
		
		for (int i=0;i<values.length;i++){
			int num = values[i];
			deque.addLast(num);
			if(map.containsKey(num)){
				map.replace(num,map.get(num)+1);
			} else {
				map.put(num,1);
			}
			if(deque.size()==targetSize){
				int first = deque.getFirst();
				if(map.size()>maxUnique){
					maxUnique=map.size();
				}
				int currentCount = map.get(first);
				if (currentCount==1){
					map.remove(first);
				}
				else {
					map.replace(first,map.get(first)-1);
				}
				deque.removeFirst();			
			}		
		}
		return maxUnique;
	}
	
	
	

}
