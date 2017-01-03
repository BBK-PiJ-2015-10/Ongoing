package day3.BridgePattern.Sample2;

public class Arrow extends Shape {

	public Arrow(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Applying Color to the Rectangle");
		color.applyColor();	
	}
	
	

}
