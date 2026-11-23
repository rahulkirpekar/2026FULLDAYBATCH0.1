package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp15 
{
	public static void isValidForVote(int age) //throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception
			
			// 1. checked Exception
//			throw new InvalidAgeException("\nInvalid Age,\n\tPlease enter valid Age.");
			
			// 2. Unchecked Exception
			throw new InvalidAgeException("\nInvalid Age,\n\tPlease enter valid Age.");
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

		try 
		{
			isValidForVote(age);
		} 
		catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}
		System.out.println("General Code");
	}
}
