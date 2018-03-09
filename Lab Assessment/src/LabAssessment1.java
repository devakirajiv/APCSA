
public class LabAssessment1 {
	Numbers test = new Numbers();
	test.Numbers();
	test.isGoofy(25);
	test.getSomeGoofyNumbers(5);
}

public class Numbers {
	
	private int num;
	private int count;
	private int[] numbers;
	private int[] goofy;
	
public Numbers(){
	num = 0;
	count = 0;
	
}
	
/** @param num is a positive non-decimal value
* Precondition : num &gt;= 0
* @return true if the sum of digit divisors of num is odd
@return false if the sum of the digit divisors of num is even
*/

public boolean isGoofy(int num)
{
	int[] digits;
	int notgoofy;
	digits = num; //need to convert the integer to array with the digit values, but don't know how to do it.
	numbers = new int[digits.length];
	for (int i = 0; i < digits.length; i++){
		if(num % digits[i] == 0)
			notgoofy += digits[i];
	}
	if(notgoofy % 2 == 0)
		return false;
	return true;
/* to be implemented in part(a) */
}

/* @param count is a positive non-decimal value
* Precondition : count &gt; 0
* @return an array containing count Goofy numbers
*/
public int[] getSomeGoofyNumbers(int count)
{
	goofy = new int[count];
	
	for (int c = 0; c < count; c++){
		if (isGoofy(num)){
			goofy += num; //add the number to the array
		return goofy;
		
		}	
	}
/* to be implemented in part(b) */
}

// There may be variables / fields, constructors, and methods that are not shown.
}
