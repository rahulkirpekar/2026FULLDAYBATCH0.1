package exceptiontopic;

import java.util.Scanner;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		// Exception Handling --- try..catch
		
		Scanner sc= new  Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		try 
		{
			// ArithmeticException
			ans = no1 / no2;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Catch Block Hanlded Exception.");
		}
		
		System.out.println("Ans : " + ans);
	}
}
