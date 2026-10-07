package oops.abstopic.aclass.task2;

import java.util.Scanner;

public class TestApp1 
{
	public static  void getBehaviourByPlace(Person person) 
	{
		person.getBehave();
		
		if (person instanceof School) 
		{
			School s = (School)person;
			s.getResult();
		} 
		else if(person instanceof Org)
		{
			Org org = (Org)person;
			org.getSalary();
		}
		else if(person instanceof PublicPlace)
		{
			PublicPlace obj = (PublicPlace)person;
			obj.getPublicEventInfo();
		}
		else if(person instanceof Home)
		{
			Home home = (Home)person;
			home.getMoviewOnTime();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in );
		
		System.out.println("Enter Place Choice : ");
		
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPlace");
		System.out.println("4) For Home");
		int choice = sc.nextInt();
		
		Person person = null;
		switch (choice) 
		{
			case 1: person = new School();
					getBehaviourByPlace(person);
					break;
	
			case 2: person = new Org();
					getBehaviourByPlace(person);
					break;
					
			case 3: person = new PublicPlace();
					getBehaviourByPlace(person);
					break;
					
			case 4: person = new Home();
					getBehaviourByPlace(person);
					break;
		}
	}
}
