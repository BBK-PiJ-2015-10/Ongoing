package sml;

public class OutInstruction extends Instruction {

	private int register;
	
	public OutInstruction(String label, String op) {
		super(label, op);
	}
	
	 public OutInstruction(String label, int register) {
	        super(label, "out");
	        this.register = register;
	    }
	
	
	@Override
	public void execute(Machine m) {
		 System.out.println(m.getRegisters().getRegister(register));
	}
	
	@Override
    public String toString() {
        return super.toString() + " register " + register + " content has been printed in the Java console " ;
    }

	
}
