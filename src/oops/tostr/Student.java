package oops.tostr;

public class Student 
{
	int rno,std,marks;
	String name;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std, int marks) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
//	void scanData() {}

	 public String toString()
	 {
		 return "Student ==> "+rno+" " + name+" " + std+" " + marks;
//		 return "Student ==> "+getClass().getName()+"@"+ Integer.toHexString(hashCode());
	 }
}
