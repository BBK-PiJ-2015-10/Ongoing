package classSamples.generics;

public class GenericBox<T> {

	private T t;
	
	public void add (T input){
		this.t=input;
	}
	
	public T getT(){
		return this.t;
	}
	
	public static void main(String[] args) {
		
		GenericBox<Integer> integerBox = new GenericBox<>();
		integerBox.add(10);
		
		GenericBox<String> stringBox = new GenericBox<>();
		stringBox.add("ale");
		stringBox.add("cane");
				
		
		System.out.println(integerBox.getT());
		
		// TODO Auto-generated method stub

	}

}
