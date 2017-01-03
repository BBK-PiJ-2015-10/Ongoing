package day3.lexer4;

public interface Observer {
	
	void update(String desc);
	
	void subscribe();
	
	void unSubscribe();

}
