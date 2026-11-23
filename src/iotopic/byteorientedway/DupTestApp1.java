package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		// 1. Open File Connection
		FileOutputStream fout = null;
		
		try 
		{
			fout = new FileOutputStream("records.txt");
		
			// 2. Operation
			// String convert into Byte
			byte b[] = name.getBytes();
			
			fout.write(b);

			System.out.println("success");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				// 3. Close File Connection
				fout.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
