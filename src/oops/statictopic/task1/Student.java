package oops.statictopic.task1;

public class Student 
{
	int rno;
	String name;
	int std;
	int marks;
	static String schoolName;
	
	

	public static void main(String[] args) 
	{
		// static Properties = static Way
		
		Student.schoolName = "DPS"; 
		
		Student s1 = new Student();// s1 [rno,name,std,marks]
		Student s2 = new Student();// s2 [rno,name,std,marks]				schoolName
		Student s3 = new Student();// s3 [rno,name,std,marks]
		
		
		System.out.println("s1.schoolName : " + s1.schoolName+"---"+s1.schoolName.hashCode());
		System.out.println("s2.schoolName : " + s2.schoolName+"---"+s2.schoolName.hashCode());
		System.out.println("s3.schoolName : " + s3.schoolName+"---"+s3.schoolName.hashCode());
		
		System.out.println("--------------");
		
		s2.schoolName= "MuktJeevan";
		
		System.out.println("s1.schoolName : " + s1.schoolName+"---"+s1.schoolName.hashCode());
		System.out.println("s2.schoolName : " + s2.schoolName+"---"+s2.schoolName.hashCode());
		System.out.println("s3.schoolName : " + s3.schoolName+"---"+s3.schoolName.hashCode());
		
		System.out.println("--------------");
		
		Student.schoolName= "ABC";
		
		System.out.println("s1.schoolName : " + s1.schoolName+"---"+s1.schoolName.hashCode());
		System.out.println("s2.schoolName : " + s2.schoolName+"---"+s2.schoolName.hashCode());
		System.out.println("s3.schoolName : " + s3.schoolName+"---"+s3.schoolName.hashCode());
		
	}
}
