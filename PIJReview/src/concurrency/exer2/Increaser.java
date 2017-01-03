package concurrency.exer2;

public class Increaser implements Runnable {
	
	private Counter c;
	
	public Increaser(Counter counter){
		this.c= counter;
	}
	

	@Override
	public void run() {
		
		synchronized(c){
			System.out.println("Starting at " +c.getCount());
			for (int i=0;i<1000;i++){
				c.increase();
			}
			System.out.println("Stopping at " +c.getCount());
		}
		
		/*
		System.out.println("Starting at " +c.getCount());
		for (int i=0;i<1000;i++){
			c.increase();
		}
		System.out.println("Stopping at " +c.getCount());
		*/
		
	}
	
	

}
