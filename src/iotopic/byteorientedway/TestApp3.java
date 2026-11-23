package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try 
		{

			fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2026FULLDAYBATCH0.1\\src\\iotopic\\byteorientedway\\TestApp1.java");

			fout = new FileOutputStream("C:\\Users\\Royal\\eclipse-workspace\\2026FULLDAYBATCH0.1\\src\\iotopic\\byteorientedway\\DupTestApp1.java");
			
			int temp;
			
			while( (temp = fin.read()) != -1) 
			{
				System.out.print((char)temp);
				
				fout.write(temp);
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
				fin.close();
				fout.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		
		int temp;
		
		
		
	}

}
