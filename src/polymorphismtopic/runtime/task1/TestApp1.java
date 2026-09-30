package polymorphismtopic.runtime.task1;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		
		System.out.println("1. School Place");
		System.out.println("2. Org Place");
		System.out.println("3. PublicPlace Place");
		System.out.println("4. Home Place");
		int choice= sc.nextInt();

		Person person = null;
		
		switch(choice) 
		{
			case 1: // Runtime Polymorphism / Late Binding / Dynamic Binding
					person = new School();
					person.getBehave();
					break;
	
			case 2: person = new Org();
					person.getBehave();
					break;
	
			case 3: person = new PublicPlace();
					person.getBehave();
					break;
	
			case 4: person = new Home();
					person.getBehave();
					break;
		}
	}
}