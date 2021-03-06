//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		for(int i = 0; i < word.length(); i++)
			if(vowels.indexOf(word.charAt(i)) >= 0) {
				vowelCount++;
			}

		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		if(this.numVowels() == rhs.numVowels()){
			//if(word.compareTo(rhs.word) == 0)
				//return 0;
			//else if(word.compareTo(rhs.word) >= 1)
				//return 1;
		//	else if(word.compareTo(rhs.word) <= -1)
			//	return -1;
			return (word.compareTo(rhs.word));
		}
		
		if(this.numVowels() >= rhs.numVowels())
			return 1;
		if(this.numVowels() <= rhs.numVowels())
			return -1;
		
	return -1;

	}

	public String toString()
	{
		return word;
	}
}