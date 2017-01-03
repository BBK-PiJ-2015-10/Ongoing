package classSamples.comparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//import java.util.Comparator;

public class ScriptSample2 {

	public static void main(String[] args) {
		
		
		
		List<Dog> list = new ArrayList<>();
		list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));
		
        //list.sort((a,b)->a.compareTo(b));
        
        //list.sort(new Dog());
        
        //Collections.sort(list);
        //list.forEach(n->System.out.print(n.getName()+ ","));
        
        
        
        //System.out.println();
        
        //Collections.sort(list,new Dog());
        //list.forEach(x -> System.out.print(x.getName() + "  : " + x.getAge() + ", "));
        
        
		
        List<Cat> catlist = new ArrayList<>();
        catlist.add(new Cat("Shagg", 3));
        catlist.add(new Cat("Lac", 2));
        catlist.add(new Cat("Roge", 10));
        catlist.add(new Cat("Tomm", 4));
        catlist.add(new Cat("Tamm", 1));
        
        //catlist.sort((a,b)->(a.getAge()-b.getAge()));
        
        //catlist.sort((a,b)->(b.getAge().compareTo(a.getAge())));
        
        //*/
        
        //catlist.forEach(n->System.out.println(n.getName()+ "," + n.getAge()));
        
        //catlist.sort((a,b)->(a.getName().compareTo(b.getName())));
        //catlist.forEach(n->System.out.println(n.getName()+ "," + n.getAge()));
        
		//System.out.println(list);
		
		
		
		// TODO Auto-generated method stub
        
        
        List<Integer> ages = new ArrayList<>();
        ages.add(34);
        ages.add(5);
        ages.add(30);
        
        System.out.println(Collections.max(ages));
        
        
        
        ages.forEach(System.out::println);
        
        

	}

}
