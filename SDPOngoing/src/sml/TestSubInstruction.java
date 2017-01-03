package sml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSubInstruction {
	
		
	public static Machine m = new Machine();
		
	public static Translator t;	
	
///////////////////////////////////////////////////////////////////////////////////////////////
//These are the Tests for the SubInstruction   	
	
	/**
	* test1sub file is subtracting the values of register 31 (10) to the values of register
	* 0 (5) and storing it on register 31. Testing that register 30 equals to -5.
	*/
	@Test
	public void Test1SubInstructionDifferentRegisterCase(){
	t = new Translator("test1sub.sml");
	t.readAndTranslate(m.getLabels(), m.getProg());
	m.execute();
	assertEquals(-5,m.getRegisters().getRegister(30));
	}
	
	/**
	* test2add file is subtracting the values of register 21 (7) to the values of register
	* 20 (6) and storing it on register 21. Testing that register 21 equals to -1.
	*/
	@Test
	public void Test2SubInstructionSameRegisterCase(){
	t = new Translator("test2sub.sml");
	t.readAndTranslate(m.getLabels(), m.getProg());
	m.execute();
	assertEquals(-1,m.getRegisters().getRegister(21));
	}
	
	/**
	* test6sub file is subtracting the values of register 21 (20)to the values of register
	* 20 (-5) and storing it on register 22. Testing that register 22 equals to -25.
	*/
	@Test
	public void Test6SubInstructionNegativeOperandCase(){
	t = new Translator("test3sub.sml");
	t.readAndTranslate(m.getLabels(), m.getProg());
	m.execute();
	assertEquals(-25,m.getRegisters().getRegister(22));
	}
		

}
