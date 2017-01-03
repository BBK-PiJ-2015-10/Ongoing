package staticvsdynamic.statico;

import staticvsdynamic.dynamic.Animal;
import staticvsdynamic.dynamic.Dog;;

public class StaticScript {

	public static void main(String[] args) {
		
		Dog ani = new Dog();
		
		StaticScript bk = new StaticScript();
		bk.bark(ani);
		

	}
	
	private static final void bark(Animal animal){
		System.out.println("The Animal is barking");
	}
	
	private static final void bark(Dog dog){
		System.out.println("The Dog is barking");
	}


}
