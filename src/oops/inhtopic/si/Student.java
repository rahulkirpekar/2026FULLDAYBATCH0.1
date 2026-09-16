package oops.inhtopic.si;

import java.util.Scanner;

// Child / Sub / Derived class 
public class Student extends Person
{
	private int rno,std,marks;
	
	// Member Function
	public void scanData() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno  =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name  =sc.nextLine();
		System.out.println("Enter Std : ");
		std =sc.nextInt();
		System.out.println("Enter marks : ");
		marks =sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}





