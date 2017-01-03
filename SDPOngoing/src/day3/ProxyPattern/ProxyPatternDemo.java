package day3.ProxyPattern;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		
		Image image = new ProxyImage("test_10mb.jbg");
		
		//image will be loaded from disk
		
		image.display();
		
		System.out.println("");
		
		image.display();
		
		// TODO Auto-generated method stub

	}

}
