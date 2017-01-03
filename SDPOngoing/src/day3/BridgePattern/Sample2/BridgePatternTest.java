package day3.BridgePattern.Sample2;

public class BridgePatternTest {

	public static void main(String[] args) {
		
		Shape rec = new Rectangle(new RedColor());
		rec.applyColor();
		
		Shape arr = new Arrow(new Green());
		arr.applyColor();
		

	}

}
