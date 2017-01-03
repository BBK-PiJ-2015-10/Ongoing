package day3.VisitorPattern;

public interface ComputerPart {
	
	public void accept (ComputerPartVisitor computerPartVisitor);

}
