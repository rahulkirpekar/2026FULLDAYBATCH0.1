package exceptiontopic;

import java.util.Scanner;

public class TestApp11 
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
		
		//Nested try...catch block
		try 
		{
			try 
			{
				ans = no1 / no2;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String name = null;
				System.out.println("name.length() : " + name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}

			try 
			{
				String no1Str = "1a2b3c";
				int no11 = Integer.parseInt(no1Str);
				System.out.println("No1 : " + (no1Str+200));
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		catch(Exception e) 
		{
			System.out.println("catch(Exception e) Handled Exception.");
			e.printStackTrace();
		}
		
		System.out.println("Ans : " + ans);
	}
}
