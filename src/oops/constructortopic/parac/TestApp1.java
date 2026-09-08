package oops.constructortopic.parac;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Sagar",12,100);
		Student s2 = new Student(s1);
		
		s1.dispData();
		s2.dispData();
	}
}
