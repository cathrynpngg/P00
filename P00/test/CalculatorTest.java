import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		// Arrange
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		// Act
		int actual = cal.add(a, b);
		
		int expected = 9999;
		//Assert
		assertEquals(expected,actual);
	}
	
	public void testSubtract() {
		// Arrange
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		// Act
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		//Assert
		assertEquals(actual, expected);
	}
	
	public void testmultiply() {
		// Arrange
		int a = 13;
		int b = 12;
		 
		Calculator cal = new Calculator();
		// Act
		int actual = cal.multiply(a, b);
		
		int expected = 156;
		//Assert
		assertEquals(actual, expected);
	}
	
	public void testdivide() {
		// Arrange
		int a = 144;
		int b = 12;
		
		try {
			Calculator cal = new Calculator();
		// Act
			int actual = cal.divide(a, b);
		
			int expected = 12;
		//Assert
			assertEquals(actual, expected);
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}
