package oops.encapsulationtopic.task2;

// Pure Encapsulation
//------------------------
public class Employee 
{
	// 1. Data Members--private
	private int id,salary;
	private String name,dsgn;
	
	// 2. Member Function -- public
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDsgn() {
		return dsgn;
	}
	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
}
