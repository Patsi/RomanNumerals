
public class RomanNumerals 
{
	public int convertToInteger(String romanNum) throws RomanNumeralsException
	{
		if (romanNum.equals("") || romanNum.equals(null))
		{
			throw  new RomanNumeralsException();
		}
		else if (!romanNum.matches("[IVXLCDM]+"))
		{
			throw new RomanNumeralsException();
		}
		else if  (romanNum.equals("I"))
		{
			return 1;
		}		else if  (romanNum.equals("II"))
		{
			return 2;
		}		
		else if  (romanNum.equals("III"))
		{
			return 3;
		}
		else throw  new RomanNumeralsException();
		
	}
}
