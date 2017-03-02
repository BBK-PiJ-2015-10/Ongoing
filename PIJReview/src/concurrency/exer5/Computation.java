package concurrency.exer5;

import java.util.Random;

public class Computation implements Runnable {
	
	private double result =0;
	
	private boolean resultReady = false;
	
	private double[] numbers = null;
	
	public Computation(double[] data){
		this.numbers=data;
	}

	@Override
	public void run() {
		synchronized (this){
			double localResult = 0.0;
			Random r = new Random(-1);
			for (int i = 0; i < numbers.length; i++) {
	            result += Math.sqrt(numbers[i]);
	            result += Math.sqrt(r.nextDouble() * result);
	            result += Math.sqrt(r.nextDouble() * result);
	            result += Math.sqrt(r.nextDouble() * result);
	        }
			this.result = localResult;
			this.resultReady = true;
			notifyAll();
		}
		
	}
	
	public synchronized double getResult(){
		while (!resultReady){
			try {
				wait();
			} catch (InterruptedException ex){
				
			}
		}
		resultReady = false;
		return result;
	}

	
	
	
	

}
