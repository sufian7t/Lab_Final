package calculator;


/**
 * This is a simple calculator class that has three methods; FindMax, Square and Cube. 
 * @author Sufian 
 */

public class Calculator 
{
	
	/**
	 * This method finds the maximum of all the received numbers.
	 * @param num1 The <b> First </b> received number.
	 * @param num2 The <b> Second </b> received number.
	 * @param num3 The <b> Third </b> received number.
	 * @return The maximum of all the received numbers.
	 */
	
	public int findMax(int num1, int num2, int num3) 
	{
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) 
		{
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	/**
	 * This method calculates the square of the received number.
	 * @param num The received number.
	 * @return The calculated square of the received number.
	 * @throws IllegalArgumentException Throws an exception when the received number is an illegal argument.
	 */
	
	public int square(int num) throws IllegalArgumentException 
	{
		int result = 0;
		if (num > 0 && num < 10) 
		{
			result = num * num;
		} 
		else
			throw new IllegalArgumentException();
		return result;
	}
	
	/**
	 * This method calculates the cube of the received number.
	 * @param num The received number.
	 * @return The calculated cube of the received number.
	 */
	
	public int cube(int num)
	{
		int result = 0;
		result = num*num*num;
		return result;
	}
}
