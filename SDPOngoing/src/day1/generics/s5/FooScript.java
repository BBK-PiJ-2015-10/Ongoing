package day1.generics.s5;

public class FooScript {

	public static void main (String [] args){
	
		Foo foo = new Foo();
		
		int k = foo.aMethod(5);
		System.out.println(k);
		
		String l = foo.aMethod("Tontolone");
		System.out.println(l);
		
		
		Bar<Integer> bar = new Bar<Integer>();
		
		int n = bar.aMethod(25);
		System.out.println(n);
		
		
		//String o = bar.aMethod("Tontolone");
	
	}

}