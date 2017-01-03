package concurrencyII.exer3;

public class TimedTask implements Runnable {

	private int wait;
	
	public TimedTask(int wait){
		if (wait < 1000){
			this.wait=wait;
		} else {
			this.wait = 1000;
		}
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(wait);
			System.out.println("Waking up from a " +wait +" nap");
		} catch(InterruptedException ex){
		}
	}
	
	

}
