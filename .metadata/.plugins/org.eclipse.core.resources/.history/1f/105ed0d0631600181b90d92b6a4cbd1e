//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.Random;

import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		Random rand = new Random();
		int randans = rand.nextInt(6) + 1;
		
		Scanner keyboard = new Scanner(System.in);
		out.print("Guessing game - how many numbers? ");
		int upperBound = keyboard.nextInt();
		
		
		out.print("Enter a number between 1 and " + upperBound + " ::");
		int response = keyboard.nextInt();
		int runnumber = 0;
		
		while (response != randans)
		{
			out.print("Enter a number between 1 and " + upperBound + " ::");
			int responseB = keyboard.nextInt();
			response = responseB;
			runnumber++;
		}
		
		if (response == randans)
		{
			out.println("It took " + (runnumber+1) + " guesses to guess " + randans);
		}
			
			
		

		
	

	
	}

	public String toString()
	{
		String output="";
		return output;
	}
}