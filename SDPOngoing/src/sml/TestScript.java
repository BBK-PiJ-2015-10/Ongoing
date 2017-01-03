package sml;

public class TestScript {

	public static void main(String[] args) {
		
		Machine m = new Machine();
		Translator t = new Translator("test3.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
	    
	    System.out.println("Here is the program; it has " + m.getProg().size() + " instructions.");
        System.out.println(m);

        System.out.println("Beginning program execution.");
        m.execute();
        System.out.println("Ending program execution.");

        System.out.println("Values of registers at program termination:");
        System.out.println(m.getRegisters() + ".");
	    
		
		// TODO Auto-generated method stub

	}

}
