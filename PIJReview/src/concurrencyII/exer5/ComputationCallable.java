package concurrencyII.exer5;

import java.util.Random;

import java.util.concurrent.*;

public class ComputationCallable implements Callable<Double> {
	
	private String name;
	
	private double result =0;
		
	private double[] numbers = null;
	
	public ComputationCallable(double[] data,String name){
		this.numbers=data;
		this.name=name;
	}
	
	private Boolean finished = false;

	@Override
	public Double call() throws Exception {
		double result = 0.0;
		Random r = new Random(-1);
		for (int i = 0; i < numbers.length; i++) {
            result += Math.sqrt(numbers[i]);
            result += Math.sqrt(r.nextDouble() * result);
            result += Math.sqrt(r.nextDouble() * result);
            result += Math.sqrt(r.nextDouble() * result);
        }
		this.result = result;
		finished=true;
		System.out.println("The task done by " + name +" is " +finished);
		finished=false;
		return result;
	}


	
	
	
	

}
