//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	
	
	private int length;
	private double[] grades;
	//instance variables
	
	

	//constructor
	public Grades()
	{
		length = 0;
		grades = new double[length];
	}



	//set method
	public void setGrades(double[] nums)
	{
		grades = nums;
	}



	private double getSum()
	{
		double sum=0.0;
		for(int i = 0; i < grades.length; i++)
		{
			sum += grades[i];
		}

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		
		average = getSum()/grades.length;
	
		
		
		return average;
	}


	public String toString()
	{
		String output = null;
		for (int i = 0; i < grades.length; i++)
		{
			output = ("grade " + i + ":: " + grades[i]);
			System.out.println(output);
		}
		
		output += "\nsum= " + getSum() + "\n";
		output += "average= " + getAverage() + "\n";
		return output;
		 
		
	}



}