package oops.methodswitharray;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Object With Array
		//---------------------
		
		Student s[] = new Student[3];

		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
	}
}
