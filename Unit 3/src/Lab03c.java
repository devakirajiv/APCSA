//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a :: ");
		int a = keyboard.nextInt();
		
		System.out.println("Enter b :: ");
		int b = keyboard.nextInt();
		
		System.out.println("Enter c :: ");
		int c = keyboard.nextInt();
		
		Quadratic test = new Quadratic(0,0,0);
		
		test.setEquation(a, b, c);
		test.calcRoots();
		test.print();
		
		
   	//add test cases
   	
   	
		
		
	}
}