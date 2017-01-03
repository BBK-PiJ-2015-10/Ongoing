package cwtwo.tests;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import cwtwo.colors.*;

public class ColoursTest {
	
	private Colour black = Black.getInstance();
	private Colour blue = Blue.getInstance();
	private Colour green = Green.getInstance();
	private Colour orange  = Orange.getInstance();
	private Colour purple  = Purple.getInstance();
	private Colour red  = Red.getInstance();
	private Colour white  = White.getInstance();
	private Colour yellow  = Yellow.getInstance();
	
	
//////////////////////////////////////////////////////////////////////////////////////////////
	
/**
*  Below are the tests related to the Color Singleton Black.
*/
	
	@Test
	public void testgetInstanceBlackValid() {
		assertEquals(black,Black.getInstance());
	}
	
	@Test
	public void testgetInstanceBlackinValid() {
		assertThat(blue, not(equalTo(Black.getInstance())));
	}
	
	@Test
	public void testgetNameBlackValid() {
		assertEquals("Black",black.getName());
	}
	
	
	@Test
	public void testgetNameBlackInvalid() {
		assertThat("black", not(equalTo(black.getName())));
	}
	
	
	@Test
	public void testgetNameBlackInvalidOnlyInitial() {
		assertThat("B", not(equalTo(black.getName())));
	}
	
	
	@Test
	public void testgetNameBlackInvalidRandomText() {
		assertThat("Free", not(equalTo(black.getName())));
	}
		
	
//////////////////////////////////////////////////////////////////////////////////////////////
	
/**
*  Below are the tests related to the Color Singleton Blue.
*/
	
	@Test
	public void testgetInstanceBluekValid() {
		assertEquals(blue,Blue.getInstance());
	}
	
	
	@Test
	public void testgetInstanceBlueinValid() {
		assertThat(yellow, not(equalTo(Blue.getInstance())));
	}
	
	
	@Test
	public void testgetNameBlueValid() {
		assertEquals("Blue",blue.getName());
	}
	
	
	@Test
	public void testgetNameBlueInvalid() {
		assertThat("blue", not(equalTo(blue.getName())));
	}
	
	
	@Test
	public void testgetNameBlueInvalidOnlyInitial() {
		assertThat("B", not(equalTo(blue.getName())));
	}
	
	
	@Test
	public void testgetNameBlueInvalidRandomText() {
		assertThat("Free", not(equalTo(black.getName())));
	}
		
	
//////////////////////////////////////////////////////////////////////////////////////////////
	
/**
*  Below are the tests related to the Color Singleton Green.
*/
	
	@Test
	public void testgetInstanceGreenValid() {
		assertEquals(green,Green.getInstance());
	}
	
	
	@Test
	public void testgetInstanceGreenkinValid() {
		assertThat(blue, not(equalTo(Green.getInstance())));
	}
	
	
	@Test
	public void testgetNameGreenValid() {
		assertEquals("Green",green.getName());
	}
	
	
	@Test
	public void testgetNameGreenInvalid() {
		assertThat("green", not(equalTo(green.getName())));
	}
	
	
	@Test
	public void testgetNameGreenInvalidOnlyInitial() {
		assertThat("G", not(equalTo(green.getName())));
	}
	
	
	@Test
	public void testgetNameGreenInvalidRandomText() {
		assertThat("Free", not(equalTo(green.getName())));
	}
		
	
////////////////////////////////////////////////////////////////////////////////////////////	
	
/**
*  Below are the tests related to the Color Singleton Orange.
*/
	
	@Test
	public void testgetInstanceOrangeValid() {
		assertEquals(orange,Orange.getInstance());
	}
	
	
	@Test
	public void testgetInstanceOrangekinValid() {
		assertThat(blue, not(equalTo(Orange.getInstance())));
	}
	
	
	@Test
	public void testgetNameOrangeValid() {
		assertEquals("Orange",orange.getName());
	}
	
	
	@Test
	public void testgetNameOrangeInvalid() {
		assertThat("orange", not(equalTo(orange.getName())));
	}
	

	@Test
	public void testgetNameOrangeInvalidOnlyInitial() {
		assertThat("O", not(equalTo(orange.getName())));
	}
	
	
	@Test
	public void testgetNameOrangeInvalidRandomText() {
		assertThat("Free", not(equalTo(orange.getName())));
	}
		
	
////////////////////////////////////////////////////////////////////////////////////////////	
	
/**
*  Below are the tests related to the Color Singleton Purple.
*/
	
	@Test
	public void testgetInstancePurpleValid() {
		assertEquals(purple,Purple.getInstance());
	}
	
	
	@Test
	public void testgetInstancePurpleinValid() {
		assertThat(blue, not(equalTo(Purple.getInstance())));
	}
	
	
	@Test
	public void testgetNamePurpleValid() {
		assertEquals("Purple",purple.getName());
	}
	
	
	@Test
	public void testgetNamePurpleInvalid() {
		assertThat("purple", not(equalTo(purple.getName())));
	}
	

	@Test
	public void testgetNamePurpleInvalidOnlyInitial() {
		assertThat("P", not(equalTo(purple.getName())));
	}
	
	
	@Test
	public void testgetNamePurpleInvalidRandomText() {
		assertThat("Free", not(equalTo(purple.getName())));
	}
		
	
////////////////////////////////////////////////////////////////////////////////////////////		
	
/**
*  Below are the tests related to the Color Singleton Red.
*/
	
	@Test
	public void testgetInstanceRedValid() {
		assertEquals(red,Red.getInstance());
	}
	
	
	@Test
	public void testgetInstanceRedinValid() {
		assertThat(blue,not(equalTo(Red.getInstance())));
	}
	
	
	@Test
	public void testgetNameRedValid() {
		assertEquals("Red",red.getName());
	}
	
	
	@Test
	public void testgetNameRedInvalid() {
		assertThat("red", not(equalTo(red.getName())));
	}
	

	@Test
	public void testgetNameRedInvalidOnlyInitial() {
		assertThat("R", not(equalTo(red.getName())));
	}
	
	
	@Test
	public void testgetNameRedInvalidRandomText() {
		assertThat("Free", not(equalTo(red.getName())));
	}
		
	
////////////////////////////////////////////////////////////////////////////////////////////
	
/**
*  Below are the tests related to the Color Singleton White.
*/
	
	@Test
	public void testgetInstanceWhiteValid() {
		assertEquals(white,White.getInstance());
	}
	
	
	@Test
	public void testgetInstanceWhiteinValid() {
		assertThat(blue,not(equalTo(White.getInstance())));
	}
	
	
	@Test
	public void testgetNameWhiteValid() {
		assertEquals("White",white.getName());
	}
	
	
	@Test
	public void testgetNameWhiteInvalid() {
		assertThat("white", not(equalTo(white.getName())));
	}
	

	@Test
	public void testgetNameWhiteInvalidOnlyInitial() {
		assertThat("W", not(equalTo(white.getName())));
	}
	
	
	@Test
	public void testgetNameWhiteInvalidRandomText() {
		assertThat("Free", not(equalTo(white.getName())));
	}
	
//////////////////////////////////////////////////////////////////////////////////////	

	/**
	*  Below are the tests related to the Color Singleton Yellow.
	*/
		
		@Test
		public void testgetInstanceYellowValid() {
			assertEquals(yellow,Yellow.getInstance());
		}
		
		
		@Test
		public void testgetInstanceYellowinValid() {
			assertThat(blue,not(equalTo(Yellow.getInstance())));
		}
		
		
		@Test
		public void testgetNameYellowValid() {
			assertEquals("Yellow",yellow.getName());
		}
		
		
		@Test
		public void testgetNameYellowInvalid() {
			assertThat("yellow", not(equalTo(yellow.getName())));
		}
		

		@Test
		public void testgetNameYellowInvalidOnlyInitial() {
			assertThat("Y", not(equalTo(yellow.getName())));
		}
		
		
		@Test
		public void testgetNameYellowInvalidRandomText() {
			assertThat("Free", not(equalTo(yellow.getName())));
		}	
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
