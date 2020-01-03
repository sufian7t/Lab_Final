package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestCalculator 
{
	private Calculator calculator = new Calculator();

	@Test
	public void testFindMax()
	{
		assertEquals(9, calculator.findMax(7, 8, 9));
		assertEquals(2, calculator.findMax(0, 1, 2));
		assertEquals(0, calculator.findMax(0, -1, -2));
	}
	
	@Test
	public void testSquare()
	{
		assertEquals(4, calculator.square(2));
		assertEquals(9, calculator.square(3));
		assertEquals(16, calculator.square(4));		
	}
	
	@Test
	public void testCube()
	{
		assertEquals(8, calculator.square(2));
		assertEquals(27, calculator.square(3));
		assertEquals(64, calculator.square(4));
	}
	
	@Test
	public void testNull()
	{
		assertNotNull(calculator);
	}

}
