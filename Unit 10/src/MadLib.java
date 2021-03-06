//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Math;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String story;
	
	public MadLib()
	{
		
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		verbs = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff
		
		this();
		
		try{
			story = fileName;
			loadNouns();
			loadVerbs();
			loadAdjectives();

		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		String s = "";
		try{
		Scanner file = new Scanner(new File("H:\\APCS\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
		while (file.hasNextLine())
			{
			
				s = (file.nextLine());
				if (!(s.trim()).isEmpty())
					nouns.add(s);
			}
		
		}
		catch(Exception e)
		{
			out.println("nope");
		}	
		
	}
	
	public void loadVerbs()
	{
		String s = "";
		try{
			Scanner file = new Scanner(new File("H:\\APCS\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while (file.hasNextLine())
				{
					
					
					s = (file.nextLine());
					if (!(s.trim()).isEmpty())
						verbs.add(s);
				}
			
			
	
	
	
	
		}
		catch(Exception e)
		{
			out.println("nope2");
		}
	}

	public void loadAdjectives()
	{
		String s = "";
		try{
	
			Scanner file = new Scanner(new File("H:\\APCS\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while (file.hasNextLine())
				{

					s = (file.nextLine());
					if (!(s.trim()).isEmpty())
						adjectives.add(s);
				}
			
	
			
	
		}
		catch(Exception e)
		{
			out.println("nope3");
		}
	}

	public String getRandomVerb()
	{
		int num = (int)(Math.random() * verbs.size());
		
		return (String) verbs.get(num);
	}
	
	public String getRandomNoun()
	{
		int num = (int) (Math.random() * nouns.size());
		
		return (String) nouns.get(num);
	}
	
	public String getRandomAdjective()
	{
		int num = (int) (Math.random()*adjectives.size());
		
		return (String) adjectives.get(num);
	}		

	public String toString()
	{
		String bad = "";
		String output = "";
		try{
			Scanner file = new Scanner(new File(story));
			while (file.hasNext())
				{
					bad = file.next();
				
					if (bad.equals("#"))
						output += getRandomNoun();
					else if (bad.equals("@"))
						output += getRandomVerb();
					else if (bad.equals("&"))
						output += getRandomAdjective();
					else
						output += bad;
					output +=" ";
			
				}//while
		}
		catch(Exception e)
		{
			out.println("nope2");
		}
		return output;
	}
}
