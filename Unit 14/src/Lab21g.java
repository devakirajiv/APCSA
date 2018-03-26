import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter test1 = new AtCounter();
		
		

		//test the code
		int row = 0;
		int col = 0;
		test1.countAts(row, col);
		out.println(row + " " + col + " " +test1);
		
		row = 2;
		col = 5;
		AtCounter test2 = new AtCounter();
		test2.countAts(row, col);
		out.println(row + " " + col + " " +test2);
		
		row = 5;
		col = 0;
		AtCounter test3 = new AtCounter();
		test3.countAts(row, col);
		out.println(row + " " + col + " " +test3);
		
		row = 9;
		col = 9;
		AtCounter test4 = new AtCounter();
		test4.countAts(row, col);
		out.println(row + " " + col + " " +test4);
			
		
	}
}
