package day1.ex1;

class Storage<T> {

	T x;
	
	public void setValue (T value) {
		x = value;
	}

	public T getValue(){
		return x;
	}
	
}