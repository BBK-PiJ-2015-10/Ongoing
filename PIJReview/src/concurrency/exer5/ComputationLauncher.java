package concurrency.exer5;

public class ComputationLauncher {
	
	public static void main(String[] args) {
		
		ComputationLauncher c = new ComputationLauncher();
		c.launch();

	}
	
	public static final int COUNT = 40000;
	
	private Computation c1;
	
	private Computation c2;
	

	private double[] createArray(int size){
		double[] result = new double[size];
		for (int i = 0; i < result.length; i++){
			result[i]=Math.random();
		}
		return result;
	}
	
	private void launch(){
		
		long start, stop;
		c1 = new Computation(createArray(COUNT / 2));
		c2 = new Computation(createArray(COUNT / 2));
		
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
		Thread t1 = new Thread(c1);
		t1.start();
		Thread t2 = new Thread(c2);
		t2.start();
		double result1 = c1.getResult();
		double result2 = c2.getResult();
		System.out.println("Result: " + (result1 + result2));
	}
	
	private void sequentialComputations(){
		c1.run();
		c2.run();
		double result1 = c1.getResult();
		double result2 = c2.getResult();
		System.out.println("Result: " + (result1 + result2));
		
	}

}
