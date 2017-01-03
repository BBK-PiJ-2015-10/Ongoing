package sml;

public class BnzInstruction extends Instruction {

	private int op1;
	
	private String relabel;
		
	public BnzInstruction(String label, String op) {
		super(label, op);
	}
	
	public BnzInstruction(String label, int op1, String relabel) {
        this(label, "bnz");
        this.op1 = op1;
        this.relabel = relabel;
    }
	

	@Override
	public void execute(Machine m) {
		
		if (m.getRegisters().getRegister(op1) != 0 ) {
			m.setPc(Integer.parseInt(relabel.substring(1)));
		}
	}
	
	@Override
    public String toString() {
		return super.toString() + " until register " + op1 + " is zero, loop back to instruction "
			  + relabel ;
    }

}
