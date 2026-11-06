package exceptiontopic;

import java.util.Scanner;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		Scanner sc= new  Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();// InputMismatchException
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
	}

}
