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

		
		System.out.println("file.getName() : " + file.getName());// FileName
		
		System.out.println("file.getPath() : " + file.getPath());// path
		
		System.out.println("file.getAbsolutePath() : " + file.getAbsolutePath());
		
		try 
		{
			System.out.println("file.getCanonicalPath() : " + file.getCanonicalPath());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("file.exists() : " + file.exists());// true
		
		System.out.println("file.isFile() : " + file.isFile());// true
		
		System.out.println("file.isDirectory() : " + file.isDirectory());// true
		
		System.out.println("file.length() : " + file.length());
		
		System.out.println("file.canRead() : " + file.canRead());
		System.out.println("file.canWrite() : " + file.canWrite());
		
		File f2 = new File("Royal.java");
		
		System.out.println("file.renameTo(f2) : " + file.renameTo(f2));
		
	}
}





