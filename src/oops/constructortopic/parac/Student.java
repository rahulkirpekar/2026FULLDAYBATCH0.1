package oops.constructortopic.parac;

// Constructor  Overloadd---Different Version
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
	// 2. Para Constructor--Two args
	public Student(int rno,String name) 
	{
		this();
		System.out.println("Student- START : PARA--Two Constructor---"+this);
		
		System.out.println(this.rno+" " + this.name+" " + this.std+" " + this.marks);
		
		this.rno = rno;
		this.name = name;
		
		System.out.println(this.rno+" " + this.name+" " + this.std+" " + this.marks);
		System.out.println("Student- EXIT : PARA--Two Constructor");
	}

	// 2. Para Constructor--Three args
	public Student(int rno,String name,int std) 
	{
		this(rno, name);
		System.out.println("Student- START : PARA--Three Constructor---"+this);
		
		System.out.println(this.rno+" " + this.name+" " + this.std+" " + this.marks);
		
		this.std = std;
		
		System.out.println(this.rno+" " + this.name+" " + this.std+" " + this.marks);
		System.out.println("Student- EXIT : PARA--Three Constructor");
	}
	// 2. Para Constructor--Four args
	public Student(int rno,String name,int std,int marks) 
	{
		this(rno,name,std);
		System.out.println("Student- START : PARA--Four Constructor---"+this);
		
		System.out.println(this.rno+" " + this.name+" " + this.std+" " + this.marks);
		
		this.marks = marks;
		
		System.out.println(this.rno+" " + this.name+" " + this.std+" " + this.marks);
		System.out.println("Student- EXIT : PARA--Four Constructor");
	}
	
	// Copy Constructor(Para)
	public Student(Student s) 
	{
		this(s.rno,s.name,s.std,s.marks);
		
		System.out.println("Student- START : COPY Constructor---"+this);
//		this.rno = s.rno;
//		this.name = s.name;
//		this.std = s.std;
//		this.marks = s.marks;
		
		System.out.println("Student- EXIT : COPY Constructor---"+this);
	}
	
	// Display Information
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks+"---"+this);
	}
}
