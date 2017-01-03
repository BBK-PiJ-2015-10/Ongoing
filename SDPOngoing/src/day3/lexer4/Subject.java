package day3.lexer4;

public interface Subject {
	
	void susbcribeObserver(Observer observer);
	
	void unSubscribeObserver(Observer observer);
	
	void notifyObservers();
	
	String subjectDetails();

}
