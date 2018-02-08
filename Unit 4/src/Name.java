//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		name = " ";


	}

	public Name(String s)
	{
		setName(s);


	}

   public void setName(String s)
   {
	   name = s;


   }

	public String getFirst()
	{
		int space = name.indexOf(" ");
		String first = name.substring(0, (space + 1));
		return first;
	}

	public String getLast()
	{
		int space = name.indexOf(" ");
		String last = name.substring(space+1);
		return last;
	}

 	public String toString()
 	{
 		return getFirst() + getLast();
	}
}