//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCS\\Unit12-2016\\Unit12-2016\\Unit12-Assignments\\Lab18d\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		ArrayList<Word> words = new ArrayList<Word>();
		//ArrayList<String> words = new ArrayList<String>();
		
		
		while (file.hasNextLine()){
			for(int i = 0; i < size; i++){
				//words.add(file.nextLine());
				Word word = new Word(file.nextLine());
				words.add(word);
			}
		}
		
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size - 1; j++){
			
				if(words.get(j).compareTo(words.get(j+1)) > 0){
					Word temp = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, temp);
				  
				}
				
			}
			
			
		}
		for(int i = 0; i < size; i++){
			System.out.println(words.get(i));
		}


		











	}
}