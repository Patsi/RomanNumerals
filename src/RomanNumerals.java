
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
		/*
		else
		{
			// refactoring the rest...not ready

			int digits = romanNum.length();
			int sum = 0;
			for (int i = 0; i < digits; i++)
			{
				if (romanNum.charAt(i) == 'I')
				{
					sum += 1;
					if (++i == digits) break;
					if (romanNum.charAt(i) == 'I')
					{
						sum += 1;
						if (++i == digits) break;
						if (romanNum.charAt(i) == 'I')
						{
							sum += 1;
							if (++i < digits)
							{
								throw new RomanNumeralsException();
							}
						}
						else
						{
							throw new RomanNumeralsException();
						}
					}
					else if (romanNum.charAt(i) == 'V')
					{
						sum += 3;
						if (++i < digits)
						{
							throw new RomanNumeralsException();
						}
					}
					else if (romanNum.charAt(i) == 'X')
					{
						sum += 8;
						if (++i < digits)
						{
							throw new RomanNumeralsException();
						}
					}
				}
			}
		} */
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
		else if  (romanNum.equals("IV"))
		{
			return 4;
		}		
		else if  (romanNum.equals("V"))
		{
			return 5;
		}		
		else if  (romanNum.equals("VI"))
		{
			return 6;
		}
		else if  (romanNum.equals("VII"))
		{
			return 7;
		}
		else if  (romanNum.equals("VIII"))
		{
			return 8;
		}
		else if  (romanNum.equals("IX"))
		{
			return 9;
		}
		else throw  new RomanNumeralsException();
		
	}
}
