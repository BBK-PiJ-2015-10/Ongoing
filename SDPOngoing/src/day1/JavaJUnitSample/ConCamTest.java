package day1.JavaJUnitSample;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCamTest {

	@Test
	public void test() {
		MyJUnitClass junit = new MyJUnitClass();
	    String result = junit.Concat("Hello","Ale");
		assertEquals("HelloAle",result);
	
		
		
	
	}

}
