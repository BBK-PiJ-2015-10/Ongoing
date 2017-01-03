package day1.generics.s1;

public class OldBoxDriver {

	public static void main (String [] args){
		
		OldBox intBox = new OldBox(42);
		int x = (Integer) intBox.getData();
		System.out.println(x);
		
		OldBox strBox = new OldBox("Hello");
		String s = (String) strBox.getData();
		System.out.println(s);
		
		//int y = (Integer) strBox.getData();
		//intBox = strBox;
		
	}

}