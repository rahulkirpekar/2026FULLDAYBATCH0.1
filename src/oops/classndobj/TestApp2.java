package oops.classndobj;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();// s1 - Student[rno , name , std , marks]
		Student s2 = new Student();// s2 - Student[rno , name , std , marks]
		Student s3 = new Student();// s3 - Student[rno , name , std , marks]

		System.out.println("First Student Information : ");
		
		System.out.println("Enter Rno : ");
		s1.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		s1.name = sc.nextLine();
		System.out.println("Enter Std : ");
		s1.std = sc.nextInt();
		System.out.println("Enter Marks : ");
		s1.marks = sc.nextInt();

		System.out.println("Second Student Information : ");
		
		System.out.println("Enter Rno : ");
		s2.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		s2.name = sc.nextLine();
		System.out.println("Enter Std : ");
		s2.std = sc.nextInt();
		System.out.println("Enter Marks : ");
		s2.marks = sc.nextInt();

		System.out.println("Third Student Information : ");
		
		System.out.println("Enter Rno : ");
		s3.rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		s3.name = sc.nextLine();
		System.out.println("Enter Std : ");
		s3.std = sc.nextInt();
		System.out.println("Enter Marks : ");
		s3.marks = sc.nextInt();

		System.out.println(s1.rno+" " + s1.name+" " + s1.std+" " + s1.marks);
		System.out.println(s2.rno+" " + s2.name+" " + s2.std+" " + s2.marks);
		System.out.println(s3.rno+" " + s3.name+" " + s3.std+" " + s3.marks);
		
	}
}
