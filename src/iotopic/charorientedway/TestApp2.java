package iotopic.charorientedway;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		
		int temp;
		
		try 
		{
			fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\2026FULLDAYBATCH0.1\\list1.txt");
		
			while((temp = fr.read())!= -1) 
			{
				System.out.print((char)temp);
				
			}
		
		} catch (FileNotFoundException e) 
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
				fr.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}