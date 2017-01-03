package day3.VisitorPattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("Displaying Monitor");
		
	}

	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("Displaying mouse");
		
	}

	@Override
	public void visit(KeyBoard keyboard) {
		// TODO Auto-generated method stub
		System.out.println("Displaying keyboard");
		
	}

	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("Displaying computer");
	}
	

}
