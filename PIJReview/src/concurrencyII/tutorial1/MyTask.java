package concurrencyII.tutorial1;

public class MyTask implements Runnable {
	
	private String myName;
	
	private int count;
	
	private final long timeSleep;
	
	public MyTask(String myName, int count, long timeSleep) {
		this.myName = myName;
		this.count = count;
		this.timeSleep = timeSleep;
	}
	
	@Override
	public void run() {
		
		int sum = 0;
		for (int i = 0; i <= this.count; i++){
			sum = sum+1;
		}
		System.out.println(myName + " thread has sum = " +sum +
				" and is going to sleep for " + timeSleep);
		try {
			Thread.sleep(timeSleep);
		} catch (InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println(myName + " thread with a sum of = " +sum +
				" is now awaked ");
		
	}
	
	

}
