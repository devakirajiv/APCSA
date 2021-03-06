//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 0;
		b = 0;
		c = 0;
		rootOne = 0;
		rootTwo = 0;
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	
 	}

	public void calcRoots( )
	{
		rootOne = ((-(double)b +Math.sqrt(((double)b*(double)b)-(4*(double)a*(double)c)))/(2*(double)a));
		rootTwo = ((-(double)b -Math.sqrt(((double)b*(double)b)-(4*(double)a*(double)c)))/(2*(double)a));


	}

	public void print( )
	{
		System.out.println(String.format("Root one is :: %.3f", rootOne));
		System.out.println(String.format("Root two is :: %.3f", rootTwo));


	}
}