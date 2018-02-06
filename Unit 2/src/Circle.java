//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = (3.14159 * radius * radius);
	}

	public void print( )
	{
		System.out.printf("The area is :: %.4f\n",area);
	}
}