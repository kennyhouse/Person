import java.applet.*;
import java.util.*;

public class Person{  
	protected String myName;
	public Person(String str){
		myName = str;
	}
	public static void main(String args[])  
	{  		
		MotherWife mf = new MotherWife("Mary");
		mf.CallHusband();
		mf.FeedChildren();
		
		Student a = new Student("John");
		a.age();
		a.canLearn();
		
		//Person p = new Person("Patty");
		/*
		Mother m = new Mother("Mary");  
		Wife w = new Wife("Wilma");  
		//System.out.println("p is a " + p.name);  
		System.out.println("m is a " + m.name);  
		System.out.println("w is a " + w.name);  
		m.FeedChildren();  
		w.CallHusband(); 
		*/ 
	}
}

abstract class Human{
	protected String Name;
	
	public Human(String str){
		Name = str;
	}
}

interface Mother{
	public void FeedChildren();		
}

interface Wife{
	public void CallHusband();
}

class MotherWife extends Human implements Mother, Wife{
	public MotherWife(String n){
		super(n);
		Name = n;
	}

	public void CallHusband() {
		
		System.out.println(Name + " is calling the husband ...");
	}

	public void FeedChildren() {
		
		System.out.println(Name + " is feeding the kids...");
	}
}

interface Learning{
	
	public void canLearn();
}

interface Age{
	
	int theAge = 5;
	public void age();
}

class Student extends Person implements Learning, Age{
	public Student(String idName){
		super(idName);
		myName = idName;
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("The age for " + myName + " is: " + Age.theAge);
		
	}

	@Override
	public void canLearn() {
		// TODO Auto-generated method stub
		System.out.println(myName + " can learn something.");
	}
	
}


/*
class Mother extends Person  
{  
	Mother(String n)  
	{  
		super(n); //---------------subclass need to invoke the super class' constructor 
		name = "Mother:  " + n;  
	}  
	void FeedChildren()  
	{  
		System.out.println(name + " is feeding the kids ...");  
	}  
} 
 
class Wife extends Person  
{  
	Wife(String n)  
	{  
		super(n);  
		name = "Wife:  " + n;  
	}  
	void CallHusband()  
	{  
		System.out.println(name + " is calling the husband ...");  
	} 
}
  
class Test{ 
 */ 
	
  
/*
	public static void main(String args[])  
	{  
		System.out.println("Hello, world.");
		
		//Person p = new Person("Patty");
		
		Mother m = new Mother("Mary");  
		Wife w = new Wife("Wilma");  
		//System.out.println("p is a " + p.name);  
		System.out.println("m is a " + m.name);  
		System.out.println("w is a " + w.name);  
		m.FeedChildren();  
		w.CallHusband(); 
		
	}  
}
*/  

