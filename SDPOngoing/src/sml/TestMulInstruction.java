package sml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMulInstruction {
	
	public static Machine m = new Machine();
	
	public static Translator t;
	
///////////////////////////////////////////////////////////////////////////////////////////////
	//These are the Tests for the MulInstruction   	 	
	
	/**
	* test1mul file is multiplying the values of register 0 (5) by the values of register
	* 31 (10) and storing it on register 31. Testing that register 30 equals to 50.
	*/
	@Test
	public void Test1MulInstructionDifferentRegisterCase(){
		t = new Translator("test1mul.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
		assertEquals(50,m.getRegisters().getRegister(30));
	}
	
	/**
	* test2mul file is multiplying the values of register 20 (6) by the values of register
	* 21 (7) and storing it on register 21. Testing that register 21 equals to 42.
	*/
	@Test
	public void Test2MulInstructionSameRegisterCase(){
		t = new Translator("test2mul.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
		assertEquals(42,m.getRegisters().getRegister(21));
	}
	
	/**
	* test3mul file is multiplying the values of register 20 (-5) by the values of register
	* 21 (20) and storing it on register 22. Testing that register 22 equals to -100.
	*/
	@Test
	public void Test3MulInstructionNegativeOperandCase(){
		t = new Translator("test3mul.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
		assertEquals(-100,m.getRegisters().getRegister(22));
	}


}
