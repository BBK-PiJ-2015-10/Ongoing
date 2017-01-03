package CompSystems;

/**
 * DiningServer.java
 *
 * This class contains the methods called by the  philosophers.
 * This is the *starvation-free* version of the solution
 * to the dining philosophers problem.
 *
 * @author Greg Gagne, Peter Galvin, Avi Silberschatz
 * @version 1.0 - August 6, 1999
 * Copyright 2000 by Greg Gagne, Peter Galvin, Avi Silberschatz
 * Applied Operating Systems Concepts - John Wiley and Sons, Inc.
 */

public class DiningServer {

      public DiningServer() {
	    // array of philosopher's state
	    state = new int[NUM_OF_PHILS];
	
	    // originally all philosopher's are thinking
	    for (int i = 0; i < NUM_OF_PHILS; i++)
	        state[i] = THINKING;
	  }
	 
	  // called by a philosopher when they wish to eat 
	  public synchronized void takeForks(int pnum) { 
	     state[pnum] = HUNGRY;
	     test(pnum);  
	
	     while ( state[pnum] != EATING) {
	        try { wait(); }
	        catch(InterruptedException e) {}
	     }
	
	  }
	 
	  // called by a philosopher when they are finished eating 
	  public synchronized void putForks(int pnum) {
	     state[pnum] = THINKING;
	
		/**
		 * now test my left and right neighbors to see if they want to eat
		 * if they want to eat and they can't, check to see if they're starving
		 */
	     test(leftNeighbor(pnum));
	     checkIfStarving(leftNeighbor(pnum));
	     test(rightNeighbor(pnum));
	     checkIfStarving(rightNeighbor(pnum));
	
	     notifyAll();
	  }
	
	  /**
	   * A philosopher is starving if they are hungry and their
	   * left and right neighbors aren't starving.
	   */
	  private void checkIfStarving(int i) {
		if ( state[i] == HUNGRY && 
		  state[leftNeighbor(i)] != STARVING && 
		  state[rightNeighbor(i)] != STARVING)  { 
			state[i] = STARVING;
			System.out.println("philosopher " + i + " is starving.");
		}
	  }
				
	
	  private void test(int i) {
		/**
		 * in other words ... if I'm hungry or starving and my left and
		 * right nieghbors aren't eating or starving, then let me eat!
		 */
	     if ( ((state[i] == HUNGRY) || (state[i] == STARVING)) &&
	        ( state[leftNeighbor(i)] != EATING && state[leftNeighbor(i)] != STARVING) &&
	        ( state[rightNeighbor(i)] != EATING && state[rightNeighbor(i)] != STARVING) ) {
	        	state[i] = EATING;
	     }
	  }
	
	  // return the index of the left neighbor of philosopher i
	  private int leftNeighbor(int i) {
	     if (i == 0) {
	        return NUM_OF_PHILS - 1;
	     }
	     else {
	        return i - 1;
	     }
	  }
	
	  // return the index of the right neighbor of philosopher i
	  private int rightNeighbor(int i) {
	     if (i == NUM_OF_PHILS - 1) { 
	        return 0;
	     }
	     else {
	        return i + 1;
	     }
	  }
	  
	  // array to record each philosopher's state
	  private int[] state;
	
	  public static final int NAP_TIME = 5;
	  public static final int NUM_OF_PHILS = 5;
	
	  // different philosopher states
	  private static final int THINKING = 0;
	  private static final int HUNGRY = 1;
	  private static final int EATING = 2;
	  private static final int STARVING = 3;
	
	
	

}
