package oops.encapsulationtopic.task2;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		
		// 1 , Ganesh , 1000 , SE
		
		// setters--Mutators
		e1.setId(1);
		e1.setName("Ganesh");
		e1.setSalary(1000);
		e1.setDsgn("SE");
		
		// getters---Accessors
		
		System.out.println(e1.getId()+" " + e1.getName()+" " + e1.getSalary()+" " + e1.getDsgn());
	}
}
