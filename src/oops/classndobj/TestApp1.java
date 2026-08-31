package oops.classndobj;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Object-compiletime / Instance--Runtime-allocate memory of object--Instance
		
		// obj - Reference Variable(One type of Pointer variable)
		
		// obj(Refrence Variable)--store address of Object
		
		// new - Keyword(Jvm Create Object )
		
		// Student--Object()
//		Student obj = new Student();
		
		Student obj = null;
		obj = new Student();// [rno name std marks]
		
		System.out.println("obj : " + obj);
		System.out.println("----------------");
		
		System.out.println("obj.rno : " + obj.rno);
		System.out.println("obj.name : " + obj.name);
		System.out.println("obj.std : " + obj.std);
		System.out.println("obj.marks : " + obj.marks);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Rno : ");
		obj.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		obj.name = sc.nextLine();
		System.out.println("Enter Std : ");
		obj.std = sc.nextInt();
		System.out.println("Enter Marks : ");
		obj.marks = sc.nextInt();
		
		System.out.println("obj : " + obj);
		System.out.println("----------------");
		System.out.println("obj.rno : " + obj.rno);
		System.out.println("obj.name : " + obj.name);
		System.out.println("obj.std : " + obj.std);
		System.out.println("obj.marks : " + obj.marks);
		
		
//		obj = new Student();
//		System.out.println("obj : " + obj);
		
//		System.out.println("obj : " + obj);
		
	}// GC--release(Free) Memory
}
