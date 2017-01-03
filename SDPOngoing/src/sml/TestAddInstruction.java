package sml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAddInstruction {
		
		public static Machine m = new Machine();
		
		public static Translator t;
		
///////////////////////////////////////////////////////////////////////////////////////////////
	    // These are the Tests for the AddInstruction   	
		
		/**
		* test1add file is adding the values of register 0 (5)to the values of register
		* 31 (10) and storing it on register 31. Testing that register 30 equals to 15.
		*/
		@Test
		public void Test1AddInstructionDifferentRegisterCase(){
			t = new Translator("test1add.sml");
		    t.readAndTranslate(m.getLabels(), m.getProg());
			m.execute();
			assertEquals(15,m.getRegisters().getRegister(30));
		}
		
		/**
		* test2add file is adding the values of register 20 (6)to the values of register
		* 21 (7) and storing it on register 21. Testing that register 21 equals to 13.
		*/
		@Test
		public void Test2AddInstructionSameRegisterCase(){
			t = new Translator("test2add.sml");
		    t.readAndTranslate(m.getLabels(), m.getProg());
			m.execute();
			assertEquals(13,m.getRegisters().getRegister(21));
		}
		
		/**
		* test3add file is adding the values of register 20 (-5)to the values of register
		* 21 (20) and storing it on register 22. Testing that register 22 equals to 15.
		*/
		@Test
		public void Test3AddInstructionNegativeOperandCase(){
			t = new Translator("test3add.sml");
		    t.readAndTranslate(m.getLabels(), m.getProg());
			m.execute();
			assertEquals(15,m.getRegisters().getRegister(22));
		}

}
