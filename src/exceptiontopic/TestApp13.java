package exceptiontopic;

import java.util.Scanner;

public class TestApp13 
{
	public static void main(String[] args) 
	{
		Scanner sc= new  Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans=0;
		try 
		{
			ans = no1 / no2;
		} 
		finally 
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("Ans : " + ans);
	}
}
