package concurrency.exer2;

public class Exer2Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		for (int i=0;i<100;i++){
			Increaser increaserTask = new Increaser(counter);
			Thread t = new Thread(increaserTask);
			t.start();
		}
		
	}

}
