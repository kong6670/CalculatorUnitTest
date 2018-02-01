import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		
		assertEquals(cal.add(110,40),50);
	}
	
	@Test
	public void testMinus() {
		Calculator cal = new Calculator();
		assertEquals(cal.minus(60,10),80);
	
	}
	@Test
	public void testMultiply() {
		Calculator cal = new Calculator();
		assertEquals(cal.multiply(90,10),30);
	}

}
