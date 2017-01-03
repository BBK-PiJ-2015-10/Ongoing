package day3.VisitorPattern;

public interface ComputerPartVisitor {
	
	void visit (Monitor monitor);
	
	void visit (Mouse mouse);
	
	void visit (KeyBoard keyboard);
	
	void visit (Computer computer);

}
