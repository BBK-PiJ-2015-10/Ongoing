package concurrencyII.tutorial2;

public class TestOne implements Runnable {

	@Override
	public void run() {
		while(true){
			System.out.println("Starting task one");
			try {
				Thread.sleep(1000);
			} catch (Throwable e){
				e.printStackTrace();
			}
		}
	}
	
	

}
