//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0;
		letter = "";
	}

	public TriangleThree(int sz, String let)
	{
		setTriangle(sz, let);
	}

	public void setTriangle(int sz, String let )
	{
		for (int i = 1; i <= sz; i++)
		{
			for (int c = 1; c <= i; c++)
				System.out.print(let);
			System.out.println();
		}
		
		
	}

	//public String getLetter()
	//{
		//return letter;
	//}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}