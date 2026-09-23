package oops.inhtopic.multilevel;

import java.util.Scanner;

public class TechEmployee extends Employee
{
	String projectName;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		name = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter Employee ProjectName : ");
		projectName = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + projectName);
	}
}
