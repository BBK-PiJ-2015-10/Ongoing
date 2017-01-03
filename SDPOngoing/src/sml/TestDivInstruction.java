package sml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDivInstruction {
	
	public static Machine m = new Machine();
	
	public static Translator t;
	
///////////////////////////////////////////////////////////////////////////////////////////////
	//These are the Tests for the DivInstruction   	 	
	
	/**
	* test1div file is dividing the values of register 0 (10) by the values of register
	* 31 (5) and storing it on register 31. Testing that register 30 equals to 2.
	*/
	@Test
	public void Test1DivInstructionDifferentRegisterCase(){
		t = new Translator("test1div.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
		assertEquals(2,m.getRegisters().getRegister(30));
	}
	
	/**
	* test2div file is dividing the values of register 20 (21) by the values of register
	* 21 (7) and storing it on register 21. Testing that register 21 equals to 3.
	*/
	@Test
	public void Test2DivInstructionSameRegisterCase(){
		t = new Translator("test2div.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
		assertEquals(3,m.getRegisters().getRegister(21));
	}
	
	/**
	* test3div file is dividing the values of register 20 (-20) by the values of register
	* 21 (5) and storing it on register 22. Testing that register 22 equals to -4.
	*/
	@Test
	public void Test3DivInstructionNegativeOperandCase(){
		t = new Translator("test3div.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
		assertEquals(-4,m.getRegisters().getRegister(22));
	}

	
	
	
	
	
	
	
	
	
	
	

}
