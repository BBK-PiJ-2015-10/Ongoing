package day1.generics.s4;

public class BoxUpper<E> {

	E data;
	
	public void copyFrom ( Box<? extends E> b ){
		this.data = b.getData();
	}

	public void copyTo ( Box<? super E> b){
		b.data=this.getData();
	}
	
	public E getData(){
		return this.data;
	}

}