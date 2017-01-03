package day3.BridgePattern.Sample2;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Applying Color to the Rectangle");
		color.applyColor();
	}
	
	

}
