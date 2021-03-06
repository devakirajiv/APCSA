//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;


	}

	public int compareTo( Word rhs )
	{
		int length1 = word.length();
		int length2 = rhs.toString().length();
		
		
		if(length1 > length2)
			return 1;
		else if(length1 < length2)
			return -1;
		else
			return word.compareTo(rhs.toString());
		

	}

	public String toString()
	{
		return word;
	}
}