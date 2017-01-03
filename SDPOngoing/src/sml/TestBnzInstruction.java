package sml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBnzInstruction {
	
	public static Machine m = new Machine();
	
	public static Translator t;
	
///////////////////////////////////////////////////////////////////////////////////////////////
	//These are the Tests for the BnzInstruction   	 	
	
	/**
	* test1bnz file is testing the bnz method by testing if it properly calculate the factorial
	* of 5. The test is comparing the value of register(21) is equal to 120.
	*/
	@Test
	public void TestBnzInstructionCaseSmallNumber(){
		t = new Translator("test1bnz.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
		assertEquals(120,m.getRegisters().getRegister(21));
	}
	
	/**
	* test1bnz file is testing the bnz method by testing if it properly calculate the factorial
	* of a larger number 10. The test is comparing the value of register(21) is equal to 3628800.
	*/
	@Test
	public void TestBnzInstructionCaseLargerNumber(){
		t = new Translator("test2bnz.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
		assertEquals(3628800,m.getRegisters().getRegister(21));
	}
	
	
	
	

}
