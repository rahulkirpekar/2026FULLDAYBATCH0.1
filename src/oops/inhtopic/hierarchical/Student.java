package oops.inhtopic.hierarchical;

// Hierarchical Inheritance
public class Student extends Person
{
	int rno,std,marks;
	
	public Student() 
	{
	}
	Student(int rno,String name,int std,int marks)
	{
		super(name);
		this.rno = rno;
		this.std = std;
		this.marks = marks;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	} 
	
}
