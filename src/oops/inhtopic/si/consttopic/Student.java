package oops.inhtopic.si.consttopic;

// Child / Sub / Derived class 
public class Student extends Person
{
	private int rno,std,marks;
	
	Student()
	{
		System.out.println("Student Default Constructor");
		rno = 1 ;
		name = "Rahul";
		std = 12;
		marks = 100;
	}	
	// Para 
	Student(int rno,String name)
	{
		System.out.println("Student Para-Two Constructor");
		this.rno = rno;
		this.name = name;
	}
	// Para 
	Student(int rno,String name,int std)
	{
		super(name);
		System.out.println("Student Para-Three Constructor");
		this.rno = rno;
//		this.name = name;
		this.std = std;
	}
	// Para 
	Student(int rno,String name,int std,int marks)
	{
		super(name);
		super.name = name;
		System.out.println("Student Para-Four Constructor");
		this.rno = rno;
		this.std=std;
		this.marks = marks;
	}
	
	
/*	
	// Member Function
	public void scanData() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno  =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name  =sc.nextLine();
		System.out.println("Enter Std : ");
		std =sc.nextInt();
		System.out.println("Enter marks : ");
		marks =sc.nextInt();
	}
*/	
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}





