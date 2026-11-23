package iotopic.seritopic;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{

		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2026FULLDAYBATCH0.1\\records.txt");
			
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student s= (Student)	oin.readObject();
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
			
			oin.close();
			fin.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
