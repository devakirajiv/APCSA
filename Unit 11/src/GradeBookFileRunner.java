import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("H:\\APCS\\Unit11\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));

		String name = file.nextLine();
		int numStudents = Integer.parseInt(file.nextLine());
		
		System.out.println(name + " " + numStudents);
		
		Class class1 = new Class(name, numStudents);
		
		for(int i = 0; i<numStudents; i++){
			String studentName =  file.nextLine();
			String gradeList = file.nextLine();
			class1.addStudent(i,new Student(studentName,gradeList));
		}
		
		System.out.println(class1);
		
		System.out.println("Failure List = " + class1.getFailureList(70));
		System.out.println("Highest Average = " + class1.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + class1.getStudentWithLowestAverage());
		
		
		
		out.println(String.format("Class Average = %.2f",class1.getClassAverage()));	









	}		
}
