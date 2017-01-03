package concurrency.exer2;

public class Counter {
	
	private int n =0;
	
	public void increase(){
		n++;
	}
	
	public int getCount(){
		return this.n;
	}

}
