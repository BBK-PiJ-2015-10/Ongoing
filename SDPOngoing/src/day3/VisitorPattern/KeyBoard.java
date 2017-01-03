package day3.VisitorPattern;

public class KeyBoard implements ComputerPart {

	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		// TODO Auto-generated method stub
		computerPartVisitor.visit(this);
		
	}
	
	

}
