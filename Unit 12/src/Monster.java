//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myHeight;
	private int myWeight;
	private int myAge;

	//write a default Constructor

public Monster(){
	myHeight = 0;
	myWeight = 0;
	myAge = 0;
}

	//write an initialization constructor with an int parameter ht
public Monster(int ht){
	myHeight = ht;
}


	//write an initialization constructor with int parameters ht and wt
public Monster(int ht, int wt){
	myHeight = ht;
	myWeight = wt;
}



	//write an initialization constructor with int parameters ht, wt, and age
public Monster(int ht, int wt, int age){
	myHeight = ht;
	myWeight = wt;
	myAge = age;
}


	//modifiers - write set methods for height, weight, and age
public void setHeight(int ht){
	myHeight = ht;
}

public void setWeight(int wt){
	myWeight = wt;
}

public void setAge(int age){
	myAge = age;
}
	
	
	//accessors - write get methods for height, weight, and age
public int getHeight(){
	return myHeight;
}

public int getWeight(){
	return myWeight;
}

public int getAge(){
	return myAge;
}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight,myWeight,myAge);
	}

	public boolean equals( Object obj )
	{
		if((this.getHeight()==((Monster) obj).getHeight())&&(this.getWeight()==((Monster) obj).getWeight())&&(this.getAge()==((Monster) obj).getAge()))
			return true;


		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		
		if(this.getHeight() > rhs.getHeight()){
			return 1;
		} else if (this.getHeight() < rhs.getHeight()){
			return -1;
		}else{
			if(this.getWeight() > rhs.getWeight()){
				return 1;
			}else if (this.getWeight() < rhs.getWeight()){
				return -1;
			}else{
				if(this.getAge() > rhs.getAge()){
					return 1;
				}else if (this.getAge() < rhs.getAge()){
					return -1;
				}
			}
		}
		return -1;
	
	}

	//write a toString() method
	public String toString(){
		return getHeight() + " " + getWeight() + " " + getAge();
	}
	
}

