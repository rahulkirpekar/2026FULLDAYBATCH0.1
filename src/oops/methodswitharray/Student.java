package oops.methodswitharray;

import java.util.Scanner;

// 1. Data Security-----private dm's
// 2. reduce Code / Logic Duplication

public class Student 
{
	private int rno,std,marks;
	private String name;
	
	// 2. Member Function---Optional
	
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
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}