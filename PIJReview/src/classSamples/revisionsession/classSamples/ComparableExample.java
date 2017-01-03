package classSamples.revisionsession.classSamples;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableExample {

	public static void main(String[] args) {
		
		Fruit[] fruits = new Fruit[4];
		
	    Fruit pineapple = new Fruit("pineapple","desc");
	    Fruit apple = new Fruit("apple", "desc");
	    Fruit orange = new Fruit("orange", "desc");
	    Fruit kiwi = new Fruit("kiwi", "desc");
	    
	    fruits[0] = pineapple;
	    fruits[1] = apple;
	    fruits[2] = orange;
	    fruits[3] = kiwi;
	    
	    
	    //for (Fruit f:fruits){
	    	//System.out.println(f);
	    //}
	    
	    
	    //Arrays.sort(fruits);
	    
	    //Arrays.sort(fruits,(a,b)->a.fruitName.compareTo(b.fruitName));
	    
	    Arrays.sort(fruits,new Fruit("ale","tester"));
	    
	    for (Fruit f:fruits){
	    	System.out.println(f);
	    }
	   

	}

}

class Fruit implements Comparable<Fruit> , Comparator<Fruit>  {

	String fruitName;
	
	String fruitDesc;
	
	Fruit(String fruitName, String fruitDesc){
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
	}
	
	@Override
	public String toString(){
		return fruitName;
	}
	
	@Override
	public int compareTo(Fruit arg0) {
		return this.fruitName.compareTo(arg0.fruitName)*-1;
	}

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.fruitName.compareTo(o2.fruitName);
	}


	
	
	
}





