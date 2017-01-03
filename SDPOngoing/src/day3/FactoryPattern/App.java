package day3.FactoryPattern;

/*
* Want to create objects implementing some interface
* or having some parent.
* Creating an object is complex.
* e.g. lost of constructors parameters
* Possible to simplify choice of objects
*
*/

public class App {
	
	public static void main (String[] args) {
		
		Animal animal = AnimalFactory.createAnimal(AnimalFactory.CAT); 
		
		animal.speak();
		animal.eat();
		
	}

}
