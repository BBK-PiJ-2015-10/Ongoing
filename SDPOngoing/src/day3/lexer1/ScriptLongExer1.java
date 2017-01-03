package day3.lexer1;

public class ScriptLongExer1 {

	public static void main(String[] args) {
		
		Creator factoryPattern = new ConcreteCreator();
		Product first = factoryPattern.createProduct("type1");
		Product second = factoryPattern.createProduct("type2");
		Product third = factoryPattern.createProduct("type3");
		
		System.out.println(first.getClass().getName());
		System.out.println(second.getClass().getName());
		System.out.println(third.getClass().getName());
		
		
		

	}

}
