package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp14 
{
	public static void isValidForVote(int age) throws IOException
	{
		if (age < 18) 
		{
			// raise exception
			
			// 1. checked Exception
			throw new IOException("\nInvalid Age,\n\tPlease enter valid Age.");
			
			// 2. Unchecked Exception
//			throw new ArithmeticException("\nInvalid Age,\n\tPlease enter valid Age.");
		} 
		else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();

		isValidForVote(age);

//		try 
//		{
//			isValidForVote(age);
//		} 
//		catch (Exception e) 
//		{
//			e.printStackTrace();
//		}
		System.out.println("General Code");
	}
}
