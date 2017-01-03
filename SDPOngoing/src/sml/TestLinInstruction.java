package sml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinInstruction {
	
	public static Machine m = new Machine();
	
	public static Translator t;
	
///////////////////////////////////////////////////////////////////////////////////////////////
    // These are the Tests for the LinInstruction   
	
	/**
	* test1lin file is storing a value of 5 in register 0. Testing that indeed the value
	* got stored.
	*/
	@Test
	public void Test1LinInstructiononRegister0(){
		t = new Translator("test1lin.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
		assertEquals(5,m.getRegisters().getRegister(0));
	}
	
	/**
	* test1lin file is storing a value of 5 in register 31. Testing that indeed the value
	* got stored.
	*/
	@Test
	public void Test1LinInstructionOnLastRegister(){
		t = new Translator("test2lin.sml");
	    t.readAndTranslate(m.getLabels(), m.getProg());
		m.execute();
		assertEquals(5,m.getRegisters().getRegister(31));
	}
	
	
	

}
