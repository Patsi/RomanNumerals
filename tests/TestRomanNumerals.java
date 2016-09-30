import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals 
{
	RomanNumerals romanNumeral = new RomanNumerals();

	@Test (expected = RomanNumeralsException.class)
	public void testNotLegalDigitsEmptyString() throws RomanNumeralsException
	{
		// An empty String is not a valid Roman numeral
		romanNumeral.convertToInteger("");
	}
	
	@Test (expected = RomanNumeralsException.class)
	public void testNotLegalDigits() throws RomanNumeralsException
	{
		// A is not allowed in Roman numeral
		romanNumeral.convertToInteger("A");
	}
	
	@Test 
	public void testI() throws RomanNumeralsException
	{
		// I should give 1
		 assertEquals(1, romanNumeral.convertToInteger("I"));
	}
		
	@Test 
	public void testII() throws RomanNumeralsException
	{
		// I should give 2
		 assertEquals(2, romanNumeral.convertToInteger("II"));
	}
		
	@Test 
	public void testIII() throws RomanNumeralsException
	{
		// III should give 3
		 assertEquals(3, romanNumeral.convertToInteger("III"));
	}
		
	@Test  (expected = RomanNumeralsException.class)
	public void testIIII() throws RomanNumeralsException
	{
		// IIII is not a valid Roman numeral
		 romanNumeral.convertToInteger("IIII");
	}
	
	@Test 
	public void testIV() throws RomanNumeralsException
	{
		// IV should give 4
		 assertEquals(4, romanNumeral.convertToInteger("IV"));
	}
	
	
		
}
