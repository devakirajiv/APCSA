//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab08g
{
	public static void main ( String[] args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a number :: ");
		int start = keyboard.nextInt();
		
		
		out.print("Enter another number :: ");
		int stop = keyboard.nextInt();
		
		LoopStats test = new LoopStats(0,0);
		
		test.setNums(start, stop);
		//out.print(test.getEvenCount());
		//out.print(test.getOddCount());
		//out.print(test.getTotal());
		out.println(test);
		
		
		//add test cases
		
		
		
		
		
		
		
					
	}
}