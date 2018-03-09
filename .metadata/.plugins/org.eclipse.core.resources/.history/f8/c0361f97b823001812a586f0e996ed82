//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer>count;
	private ArrayList<Character>letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		fileName = "";
	}

	public Histogram(char[] values, String fName)
	{
		this();
		
			for (int i = 0; i<values.length; i++)
			{
				letters.add(values[i]);
				count.add(i, 0);
			}
			
			fileName = fName;

		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		
		Scanner file = new Scanner(new File(fileName));
		String file1 = "";
		while (file.hasNextLine())
		{
			file1 = file1 + file.nextLine();
		}
		
		for (int i = 0; i<file1.length(); i++)
		{
			for (int ii = 0; ii<letters.size(); ii++)
			{
				if (file1.charAt(i)==letters.get(ii))
				{
					int counter = count.get(ii);
					counter++;
					count.set(ii, counter);
				}
			}
		}
		
		
	}

	public char mostFrequent()
	{
		int largest = count.get(0);
		for (int i = 0; i<count.size(); i++)
			if (count.get(i) > largest)
				largest = count.get(i);
		return letters.get(count.indexOf(largest));
	}

	public char leastFrequent()
	{
		int smallest = count.get(0);
		for (int i = 0; i<count.size(); i++)
			if (count.get(i) < smallest)
				smallest = count.get(i);
		return letters.get(count.indexOf(smallest));

	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
