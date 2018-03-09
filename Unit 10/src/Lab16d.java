//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab16d
{
	public static void main( String args[] )
	{
		//make a new MadLib
		MadLib test = new MadLib("H:\\APCS\\Unit10\\Unit10-2016\\Unit10-Assignments\\story.dat");
		test.loadNouns();
		
		test.loadVerbs();
		
		test.loadAdjectives();
		
		out.println("\n");
		out.println(test);
	}
}