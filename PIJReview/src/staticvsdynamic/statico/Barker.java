package staticvsdynamic.statico;

import staticvsdynamic.dynamic.Animal;
import staticvsdynamic.dynamic.Dog;

public class Barker {
	
	public void bark(Animal animal){
		System.out.println("The Animal is barking");
	}
	
	public void bark(Dog dog){
		System.out.println("The Dog is barking");
	}

}
