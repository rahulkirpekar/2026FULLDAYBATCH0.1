package oops.inhtopic.multilevel.consttopic;

public class Person 
{
	String name;
	
	public Person() 
	{
		System.out.println("Person - Default Constructor");
		name = "Ganesh";
	}
	public Person(String name) 
	{
		System.out.println("Person - One-PARA Constructor");
		this.name = name;
	}
}