package iotopic.charorientedway;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		FileWriter fw = null;
		
		try 
		{
			fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\2026FULLDAYBATCH0.1\\src\\iotopic\\charorientedway\\TestApp1.java");
			fw = new FileWriter("C:\\Users\\Royal\\eclipse-workspace\\2026FULLDAYBATCH0.1\\src\\iotopic\\charorientedway\\DupTestApp1.java");
			
			int temp;
			
			while(	(temp = fr.read())	!= -1) 
			{
				System.out.print((char)temp);
				
				fw.write(temp);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				fr.close();
				fw.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
	}
}
