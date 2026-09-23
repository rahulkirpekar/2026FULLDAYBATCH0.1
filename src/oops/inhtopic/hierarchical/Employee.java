package oops.inhtopic.hierarchical;

// Hierarchical Inheritance
public class Employee extends Person
{
	int id,salary;
	String dsgn,orgName;
	
	public Employee() 
	{
	}

	public Employee(int id, String name,int salary, String dsgn, String orgName) {
		super(name);
		this.id = id;
		this.salary = salary;
		this.dsgn = dsgn;
		this.orgName = orgName;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + orgName);
	} 
	
}
