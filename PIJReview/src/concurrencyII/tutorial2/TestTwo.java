package concurrencyII.tutorial2;

public class TestTwo implements Runnable {

	@Override
	public void run() {
		while (true){
			System.out.println("Starting task two");
			try {
				Thread.sleep(1000);
			} catch (Throwable e){
				e.printStackTrace();
			}
		}
	}
	
	

}
