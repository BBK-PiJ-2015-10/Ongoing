package day3.FactoryPattern;

/*
 * Imagine that this class requires a lot of configuration
 * before use
 * 
 */

public class Cat extends AbstractAnimal implements Animal {

	@Override
	public void speak() {
		System.out.println("Meaow, meaouw");
		
	}

}
