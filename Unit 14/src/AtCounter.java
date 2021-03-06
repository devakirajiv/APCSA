//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private int row;
   private int col;
  
 

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	
		
	}

	public int countAts(int r, int c)
	{
		row = r;
		col = c;


		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if( r < atMat.length && r >= 0 && c < atMat.length && c >= 0 && atMat[r][c] == '@'){
			atMat[r][c] = '-';
			countAts(r+1,c);
			countAts(r-1,c);
			countAts(r, c+1);
			countAts(r, c-1);
			atCount += 1;
		}

		return 0;
	}

	public int getAtCount()
	{
		return atCount;
	}
	
	

	public String toString()
	{
		String output="";
		output=  "has " + getAtCount()+" @s connected.";
		return output;
	}
}
