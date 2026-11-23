package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder(); 
		
		FileInputStream fin = null;
		try 
		{
			// 1. Open File Connection
			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2026FULLDAYBATCH0.1\\records.txt");
		
			// 2. Operation--read
			int temp;
			
			while( (temp = fin.read())  != -1 )
			{
					sb.append((char)temp);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			// 3. Close File Connection
			try 
			{
				fin.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Final String : " + sb);
	}
}