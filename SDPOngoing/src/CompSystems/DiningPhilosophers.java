package CompSystems;

public class DiningPhilosophers {

	public static void main(String[] args) {
		
	      DiningServer server = new DiningServer();

	      Philosopher[] philosopherArray = new Philosopher[DiningServer.NUM_OF_PHILS];
	     
	     // create the philosopher threads
	     for (int i = 0; i < DiningServer.NUM_OF_PHILS; i++)
	         philosopherArray[i] = new Philosopher(server,i);
	     
	     for (int i = 0; i < DiningServer.NUM_OF_PHILS; i++)
	         philosopherArray[i].start();		

	}

}
