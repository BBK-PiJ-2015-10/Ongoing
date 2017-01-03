package concurrencyII.exer4a;


public class ResponsiveUI implements Runnable {
	
	protected static final int LIMIT = 10;
	
	protected static String buffer = "";
	
	private final int duration;
	
	private final int taskId;
	
	public ResponsiveUI(int time,int task){
		this.duration = time;
		this.taskId = task;
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(duration);
		} catch (InterruptedException ex){
		
		}
		synchronized (buffer){
			if (!buffer.equals("")){
				buffer += "," +taskId;
			}
			else {
				buffer = "" + taskId;
			}
			
		}
		
	}
	
	
	

}
