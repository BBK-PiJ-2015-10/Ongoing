package concurrency.exer1;

public class TextLoop implements Runnable {
	
	public static final int COUNT = 100;
	
	private final String name;
	
	public TextLoop(String name){
		this.name=name;
	}

	@Override
	public void run() {
		for (int i=0;i<COUNT;i++){
			System.out.println("Loop: " +name +", iteraction" +i + ".");
		}
	}
	
	

}
