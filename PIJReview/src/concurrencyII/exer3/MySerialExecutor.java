package concurrencyII.exer3;

import java.util.concurrent.Executor;

import concurrencyII.exer2.SerialExecutor;

public class MySerialExecutor extends SerialExecutor {

	public MySerialExecutor(Executor executor) {
		super(executor);
	}
	
	public int getMaxPendingTime(){
		return this.tasks.size() * 1000;
	}
	

}
