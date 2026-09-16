package oops.inhtopic.si;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();// s-[rno name std marks]
		Student s2 = new Student();// s-[rno name std marks]
		Student s3 = new Student();// s-[rno name std marks]
		
		s1.scanData();
		s2.scanData();
		s3.scanData();
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
	}
}
