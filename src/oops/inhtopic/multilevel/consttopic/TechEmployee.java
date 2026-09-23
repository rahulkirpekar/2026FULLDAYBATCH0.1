package oops.inhtopic.multilevel.consttopic;

public class TechEmployee extends Employee
{
	String projectName;
	
	public TechEmployee() 
	{
		System.out.println("TechEmployee - Default Constructor");
	}
	
	public TechEmployee( int id, String name, int salary, String dsgn, String projectName) 
	{
		super(id, name, salary, dsgn);
		System.out.println("TechEmployee - Para-5 Constructor");
		this.projectName = projectName;
	}
	
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + projectName);
	}
}
