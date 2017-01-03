package day3.VisitorPattern;

public class VisitorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
		
		

	}

}
