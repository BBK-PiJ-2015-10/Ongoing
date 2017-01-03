package concurrencyII.exer5;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;


public class ComputationLauncher {
	
	public static void main(String[] args) {
		
		ComputationLauncher c = new ComputationLauncher();
		c.launch();

	}
	
	public static final int COUNT = 40000;
	
	private ComputationRunnable c1;
	
	private ComputationRunnable c2;
	
	private ComputationCallable c3;
	
	private ComputationCallable c4;
	
	private static Future task3Results = null;
	
	private static Future task4Results = null;
	
	
	

	private double[] createArray(int size){
		double[] result = new double[size];
		for (int i = 0; i < result.length; i++){
			result[i]=Math.random();
		}
		return result;
	}
	
	private void launch(){
		
		long start, stop;
		c1 = new ComputationRunnable(createArray(COUNT / 2),"seq1");
		c2 = new ComputationRunnable(createArray(COUNT / 2),"seq2");
		
		c3 = new ComputationCallable(createArray(COUNT / 2),"par1");
		c4 = new ComputationCallable(createArray(COUNT / 2),"par2");
		
		start = System.currentTimeMillis();
		sequentialComputations();
		stop = System.currentTimeMillis();
		System.out.println("Time without threads: " + (stop - start) + "ms");
		
		
		start = System.currentTimeMillis();
		parallelComputations();
		stop = System.currentTimeMillis();
		System.out.println("Time with threads: " + (stop - start) + "ms");
		
	}
	
	private void parallelComputations(){
		//Thread t1 = new Thread(c3);
		//t1.start();
		//Thread t2 = new Thread(c4);
		//t2.start();
		//double result1 = c3.getResult();
		//double result2 = c4.getResult();
		//System.out.println("Result: " + (result1 + result2));
		
		ExecutorService e = Executors.newFixedThreadPool(2);
		//e.submit(c3)
		//e.submit(c4);
		//e.execute(c3);
		double result1 =0;
		double result2 =0;
		try {
			result1 = e.submit(c3).get();
			result2 = e.submit(c4).get();
		}  catch (Exception ex){
			ex.printStackTrace();
		}
		finally {
			System.out.println("Result: " + (result1 + result2));	
		}
	
	}
	
	private void sequentialComputations(){
		c1.run();
		c2.run();
		double result1 = c1.getResult();
		double result2 = c2.getResult();
		System.out.println("Result: " + (result1 + result2));
		
	}

}
