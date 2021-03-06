import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;


public class Class
{
	private String name;
	//private Student[] studentList;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name = "";
		//studentList = new Student[0];
		studentList = new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{
		//studentList = new Student[stuCount];
		this.name =  name;

	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		//studentList[stuNum] = s;
		studentList.add(stuNum,s);
		
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public void sort(){
		//for(int i = 0; i < studentList.length-1; i++){
		
		//studentList[i].(getAverage().compareTo(studentList[i+1]));
		Collections.sort(studentList);
		//}
		//return studentList;
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double AvrgSum = 0.0;
		for(int i = 0; i < studentList.size(); i++){
			//AvrgSum += studentList[i].getAverage();
			AvrgSum += studentList.get(i).getAverage();
		}
		classAverage = AvrgSum/studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(int i = 0; i < studentList.size(); i++){
			if(studentList.get(i).getName().equals(stuName)){
				return studentList.get(i).getAverage();
			}
		}

		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		
		for(int i = 0; i < studentList.size(); i++){
			if(studentList.get(i).getAverage() > high){
				high = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}
		}
		return hName;
	}
	
	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		

		for(int i = 0; i < studentList.size(); i++){
			if(studentList.get(i).getAverage() < low){
				low = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}
		}

		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i < studentList.size(); i++){
			if(studentList.get(i).getAverage() < failingGrade){
				output += studentList.get(i).getName() + " ";
			}
		}

		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		
		for(int i = 0; i < studentList.size(); i++){
			output += studentList.get(i).toString() + "     " + studentList.get(i).getAverage() + "\n";
		}


		return output + "\n";
	}  	
}
