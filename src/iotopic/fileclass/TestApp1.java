package iotopic.fileclass;

import java.io.File;
import java.io.IOException;


// File -- create,rename,delete,to get list of files and folders into given path.
public class TestApp1 
{
	public static void main(String[] args) 
	{
		// search inside project folder
		File file = new File("src/iotopic/fileclass/TestApp1.java");

		
//		System.out.println("file.getName() : " + file.getName());// FileName
		
//		System.out.println("file.getPath() : " + file.getPath());// path
		
//		System.out.println("file.getAbsolutePath() : " + file.getAbsolutePath());
		
//		try 
//		{
//			System.out.println("file.getCanonicalPath() : " + file.getCanonicalPath());
//		} 
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
		
//		System.out.println("file.exists() : " + file.exists());// true
		
//		System.out.println("file.isFile() : " + file.isFile());// true
		
//		System.out.println("file.isDirectory() : " + file.isDirectory());// true
		
//		System.out.println("file.length() : " + file.length());
		
//		System.out.println("file.canRead() : " + file.canRead());
//		System.out.println("file.canWrite() : " + file.canWrite());
		
//		File f2 = new File("src/iotopic/fileclass/Royal.java");
//		System.out.println("file.renameTo(f2) : " + file.renameTo(f2));

		File f3 = new File("src");
		
		
		String v[] = 	f3.list();
		
		for (int i = 0; i < v.length; i++) 
		{
			System.out.println("v["+ i +"] : " +  v[i]);
			
			File f4 = new File("src/"+v[i]);
			
			String v1[] = f4.list();

			System.out.println("v1.length : " +v1.length);
			
			for (int j = 0; j < v1.length; j++) 
			{
				System.out.println("\tv1["+j+"] : " + v1[j]);
			}
		}
	}
}





