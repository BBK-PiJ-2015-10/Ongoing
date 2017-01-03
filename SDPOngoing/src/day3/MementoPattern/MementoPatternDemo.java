package day3.MementoPattern;

public class MementoPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Originator originator = new Originator();
		
		CareTaker caretaker = new CareTaker();
		
		originator.setState("State #1");
		
		originator.setState("State #2");
		
		caretaker.add(originator.saveStateToMemento());
		
		originator.setState("State #3");
		
		caretaker.add(originator.saveStateToMemento());
		
		originator.setState("State #4");
		
		System.out.println("Current State: " +originator.getState());
	
		originator.getStateFromMemento(caretaker.get(0));
		
		System.out.println("First saved state: " +originator.getState());
		
		originator.getStateFromMemento(caretaker.get(1));
		
		System.out.println("Second saved state: " +originator.getState());
		
		
		
	

	}

}
