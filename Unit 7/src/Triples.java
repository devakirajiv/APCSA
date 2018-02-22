//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
		
	}

	public Triples(int num)
	{
		number = 0;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for(int i = 1; i <= a; i++){
			if (a % i ==0){
				if(b % i ==0){
					if(c % i ==0){
						max = i;
					}
				}
			}
		}



		return max;
	}

	public String toString()
	{
		String output="";
		
		for(int c=1; c < number; c++){
			for(int b = 1; b < number; b++){
				for(int a = 1; a < number-2; a++){
					if(a*a+b*b == c*c && greatestCommonFactor(a,b,c) <= 1){
						if((a%2 ==0 && b%2!=0) || (a%2 !=0 && b%2==0)){
							if(c%2 !=0){
								output = output + (a + " " + b + " " + c) + "\n";
							}
						}
					}
				}
			}
		}


		return output+"\n";
	}
}