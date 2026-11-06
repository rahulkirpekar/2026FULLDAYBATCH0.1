package exceptiontopic;

import java.util.Scanner;

public class TestApp9 
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
		
		// try...with multiple catch block
		try 
		{
			// ArithmeticException
			ans = no1 / no2;
			
			String name = null;
			System.out.println("name.length() : " + name.length());

			String no1Str = "1a2b3c";
			int no11 = Integer.parseInt(no1Str);
			System.out.println("No1 : " + (no1Str+200));
		}
		catch(ArithmeticException e) 
		{
			System.out.println("catch(ArithmeticException e) Handled Exception.");
			e.printStackTrace();
		}
		catch(NullPointerException e) 
		{
			System.out.println("catch(NullPointerException e) Handled Exception.");
			e.printStackTrace();
		}
		catch(NumberFormatException e) 
		{
			System.out.println("catch(NumberFormatException e) Handled Exception.");
			e.printStackTrace();
		}
		catch(Exception e) 
		{
			System.out.println("catch(Exception e) Handled Exception.");
			e.printStackTrace();
		}
		
		System.out.println("Ans : " + ans);
	}
}
