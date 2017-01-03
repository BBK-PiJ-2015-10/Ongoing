package CompSystems;

/**
 * Philosopher.java
 *
 * This class represents each philosopher thread.
 *
 * @author Greg Gagne, Peter Galvin, Avi Silberschatz
 * @version 1.0 - August 6, 1999
 * Copyright 2000 by Greg Gagne, Peter Galvin, Avi Silberschatz
 * Applied Operating Systems Concepts - John Wiley and Sons, Inc.
 */

public class Philosopher extends Thread {
	
	public Philosopher(DiningServer t, int i)
	   {
	      runner = t;
	      tNum = i;
	   }

	   private void thinking()
	   {
	     System.out.println("philosopher " + tNum + " is thinking.");

	     sleepTime = (int) (DiningServer.NAP_TIME * Math.random() );
	     try { sleep(sleepTime*1000); } 
	     catch(InterruptedException e) {}
	   }

	   private void eating()
	   {
	    System.out.println("philosopher " + tNum + " is eating.");

	    sleepTime = (int) (DiningServer.NAP_TIME * Math.random() );
	    try { sleep(sleepTime*1000); } 
	    catch(InterruptedException e) {}
	   }
	   
	   // philosophers alternate between thinking and eating
	   public void run()
	   {
	     while (true)
	      {
	       thinking();

	       System.out.println("philosopher " + tNum + " is hungry.");
	      
	       runner.takeForks(tNum);

	       eating();
	 
	       runner.putForks(tNum);
	       
	       System.out.println("philosopher " + tNum + " is done eating.");
	      }
	   }
	   
	   private DiningServer runner;
	   private int       tNum;
	   private int       sleepTime;
	
	
	

}
