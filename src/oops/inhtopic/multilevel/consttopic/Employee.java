package oops.inhtopic.multilevel.consttopic;

public class Employee extends Person
{
	int id,salary;
	String dsgn;
	
	public Employee()
	{
		System.out.println("Employee - Default Constructor");
	}

	public Employee( int id,String name,int salary, String dsgn) 
	{
		super(name);
		System.out.println("Employee - Para-4 Constructor");
		this.salary = salary;
		this.id = id;
		this.dsgn = dsgn;
	}
}
