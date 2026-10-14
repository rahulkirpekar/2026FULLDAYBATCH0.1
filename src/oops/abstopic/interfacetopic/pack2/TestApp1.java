package oops.abstopic.interfacetopic.pack2;

import java.util.Scanner;

public class TestApp1 
{
										// Upcasting(Parent reference = child Object)
	public static void getResultBasedPlace(Person person) 
	{
		person.getBehave();
		
//		person.getSalary();//C.E

		if(person instanceof Org) 
		{
			// Downcasting (ChildReference childRef = (ChildReference)parentReference)
			Org org = (Org)person;// ClassCastException
			org.getSalary();
		}
		else if(person instanceof Home)  
		{
			// Downcasting (ChildReference childRef = (ChildReference)parentReference)
			Home home = (Home)person;
			home.getMovieOnTime();
		}
		else if(person instanceof PublicPlace)  
		{
			// Downcasting (ChildReference childRef = (ChildReference)parentReference)
			PublicPlace obj = (PublicPlace)person;
			obj.getPublicEventInfo();
		}
		else if(person instanceof School)  
		{
			// Downcasting (ChildReference childRef = (ChildReference)parentReference)
			School school = (School)person;
			school.getResult();
		}
	}
	/*
	 * public static void getResultBasedPlace(Org org) {
	 * 
	 * } public static void getResultBasedPlace(PublicPlace place) {
	 * 
	 * } public static void getResultBasedPlace(School school) {
	 * 
	 * }
	 */
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		
		System.out.println("1. School Place");
		System.out.println("2. Org Place");
		System.out.println("3. PublicPlace Place");
		System.out.println("4. Home Place");
		int choice= sc.nextInt();

		switch(choice) 
		{
			case 1: // Runtime Polymorphism / Late Binding / Dynamic Binding
					School school = new School();
					getResultBasedPlace(school);
					break;
	
			case 2: Org org = new Org();
					getResultBasedPlace(org);
					break;
					
	
			case 3: PublicPlace obj = new PublicPlace();
					getResultBasedPlace(obj);
					break;
	
			case 4: Home home = new Home();
					getResultBasedPlace(home);
					break;
		}
	}
}