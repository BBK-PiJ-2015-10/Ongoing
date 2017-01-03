package day1.generics.s4;

public class NewNewBoxDriver {

	public static void main (String [] args ) {
	
		Box<Integer> intBox = new Box<Integer>(42);
		int x = intBox.getData();
		System.out.println(x);
		
		Box<String> strBox = new Box<String>("Hello");
		String s = strBox.getData();
		System.out.println(s);
		
		new MathBox<Integer>(5);
		new MathBox<Double>(32.1);
		
		Box<? extends Number> numbBox = new Box<Integer>(31);
		
		System.out.println(numbBox.getData());
	
		Box<?> b1 = new Box<Integer>(31);
		System.out.println(b1.getData());
		Box<?> b2 = new Box<String>("Hello");
		System.out.println(b2.getData());
		b1 = b2;
		System.out.println(b1.getData());
	
	}

}