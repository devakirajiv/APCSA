//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = ' ';
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		int ascii = theChar;
		if ((ascii > 64) && (ascii < 91)) {
			return true;
		} 

		return false;
	}

	public boolean isLower( )
	{
		int ascii = theChar;
		if ((ascii > 96) && (ascii < 123)) {
			return true;
		}



		return false;
	}
	
	public boolean isNumber( )
	{
		int ascii = theChar;
		if ((ascii > 47) && (ascii < 58)) {
			return true;
		}



		return false;
	}	

	public int getASCII( )
	{
		int ascii = theChar;
		return ascii;
	}

	public String toString()
	{
		if (isUpper() == true) {
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		} else if (isLower() == true) {
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		} else {
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
  
	}
}