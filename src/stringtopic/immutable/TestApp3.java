package stringtopic.immutable;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String firstName = "Rahul";
		String lastName = "Kirpekar";
		
		
							// Immutable
		String fullName = firstName.concat(lastName);// RahulKirpekar
		
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("fullName : " + fullName);// rahulkirpekar
	}
}
