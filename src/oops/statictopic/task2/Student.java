package oops.statictopic.task2;

import java.util.Scanner;

public class Student 
{
	int rno;
	String name;
	int std;
	int marks;
	static String schoolName;
	
	public static void setSchoolName(String schoolName) 
	{
		Student.schoolName = schoolName;
	}
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
		
		System.out.println("Enter SchoolName : ");
		schoolName = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks +" " + schoolName);
	}
}
