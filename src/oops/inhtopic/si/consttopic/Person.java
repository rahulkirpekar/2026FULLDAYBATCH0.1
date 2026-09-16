package oops.inhtopic.si.consttopic;

// Parent / Super / Base Class
public class Person 
{
	protected String name;
	
	public Person() 
	{
		System.out.println("Person : Default Constructor");
	}
	Person(String name)
	{
		this.name = name;
		System.out.println("Person : Para Constructor");
	}
}
