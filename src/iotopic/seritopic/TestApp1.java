package iotopic.seritopic;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "Ganesh", 12, 100);

		try 
		{
			FileOutputStream fout = new FileOutputStream("records.txt");
		
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
		
			fout.close();
			System.out.println("success");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
