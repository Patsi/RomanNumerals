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
	
	@Test 
	public void testV() throws RomanNumeralsException
	{
		// V should give 5
		 assertEquals(5, romanNumeral.convertToInteger("V"));
	}

	
	@Test 
	public void testVI() throws RomanNumeralsException
	{
		// VI should give 6
		 assertEquals(6, romanNumeral.convertToInteger("VI"));
	}
	
	@Test 
	public void testVII() throws RomanNumeralsException
	{
		// VII should give 7
		 assertEquals(7, romanNumeral.convertToInteger("VII"));
	}
	
	@Test 
	public void testVIII() throws RomanNumeralsException
	{
		// VIII should give 8
		 assertEquals(8, romanNumeral.convertToInteger("VIII"));
	}
	
	@Test (expected = RomanNumeralsException.class)
	public void testVIIII() throws RomanNumeralsException
	{
		// VIIII is not a valid Roman numeral
		 romanNumeral.convertToInteger("VIIII");	
	}
	
	@Test 
	public void testIX() throws RomanNumeralsException
	{
		// IX should give 9
		 assertEquals(9, romanNumeral.convertToInteger("IX"));
	}
		
}
