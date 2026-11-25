package oops.recordtopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Rahul Kirpekar", 10, 100);
		
		System.out.println(s1.id());
		System.out.println(s1.name());
		System.out.println(s1.std());
		System.out.println(s1.marks());
		
	}
}
