package proto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import sml.Instruction;

public class TestScript {

	public static void main(String[] args) {
		
		//Peg third = Black.getInstance();
		
		//third.getColor();
		
		Peg first = Black.getInstance();
		System.out.println(first.getColor());
		
		Random random = new Random();
		int  n = random.nextInt(3) - 1;
		System.out.println(n);
		
		//Boolean 
		
		//Peg second = Black.getInstance();
		
		//Peg second = new Blue();
		//System.out.println(second.getColor());
		
		
		//Class c1 = null;
		//System.out.println(first.getClass().getName());
		
		//List<Peg> testlist = new ArrayList<Peg>();
		//testlist.add(first);
		//testlist.add(second);
		//testlist.add(first);
		
		
		

	}

}
