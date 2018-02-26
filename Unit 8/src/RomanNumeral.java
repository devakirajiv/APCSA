//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{

		setRoman(str);

	}

	public RomanNumeral(Integer orig)
	{

		setNumber(orig);

	}

	public void setNumber(Integer num)
	{
		number = num;

	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		String modified = roman;
		String firstTwo = modified.substring(0,2);
		String first = modified.substring(0,1);
		int total = 0;
		
		for (int i = 0; i<LETTERS.length; i++)
		{
			if (firstTwo.equals(LETTERS[i]))
			{
				modified = modified.substring(2);
				total += NUMBERS[i];
				i=-1;
				if (modified.length()>=2)
					firstTwo = modified.substring(0,2);
				if (modified.length()>=1)
					first = modified.substring(0,1);
			}
			else if (first.equals(LETTERS[i]))
			{
				modified = modified.substring(1);
				total += NUMBERS[i];
				i=-1;
				if (modified.length()>=2)
					firstTwo = modified.substring(0,2);
				if (modified.length()>=1)
					first = modified.substring(0,1);
				
			}
			else if (modified.isEmpty()==true)
			{
				return total;
			}
		}
		return number;
	}

	public String toString()
	{
		int modified = number;
		String output ="";
		for (int i = 0; i<NUMBERS.length; i++)
		{
			//checks to see if it is already in NUMBERS array
			if (number == NUMBERS[i])
			{
				return LETTERS[i];
			}
			//checks to make sure number can be subtracted and be greater than
			//zero, can't be zero on first try b/c already checked with first if
			else if ((modified-NUMBERS[i]) > 0)
			{
				//new for loop inside 
				for (int ii = 0; ii<NUMBERS.length; ii++)
				{
					//now it can be equal to zero
					if ((modified-NUMBERS[ii]) >= 0)
					{
						modified = (modified-NUMBERS[ii]);
						output+= LETTERS[ii];
						
						//set to -1 b/c it will increment to 0 when 
						//for loop repeats
						ii=-1;	
					}
					else if (modified ==0)
						return output;
				}
			}
		}
		return roman + "\n";
	}
}
