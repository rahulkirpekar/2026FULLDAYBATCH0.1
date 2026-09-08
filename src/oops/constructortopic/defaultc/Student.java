package oops.constructortopic.defaultc;

public class Student 
{
	private int rno,std,marks;
	private String name;
	
	// 1. Default Constructor
	public Student()
	{
		System.out.println("Student- START : Default Constructor---"+this);
		System.out.println(rno+" " + name+" " + std+" " + marks);
		
		rno = 1;
		name = "Ganesh";
		std = 12;
		marks = 100;
		
		System.out.println(rno+" " + name+" " + std+" " + marks);
		
		System.out.println("Student- EXIT : Default Constructor");
	}
	
	// 2. Para Constructor
	
	public Student(int rno,String name,int std,int marks) 
	{
		System.out.println("Student- START : PARA Constructor---"+this);
		
		System.out.println(this.rno+" " + this.name+" " + this.std+" " + this.marks);
		
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
		
		System.out.println(this.rno+" " + this.name+" " + this.std+" " + this.marks);
		System.out.println("Student- EXIT : PARA Constructor");
	}
	
	
	
	// Display Information
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks+"---"+this);
	}
}
