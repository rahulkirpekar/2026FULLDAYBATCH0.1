package oops.statictopic.task2;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student.setSchoolName("DPS");
		
//		Student.schoolName = "DPS";
		
		Student s1 = new Student();// s1[rno,name,std,marks]
		Student s2 = new Student();// s2[rno,name,std,marks]
		Student s3 = new Student();// s3[rno,name,std,marks]						schoolName = "DPS"
		Student s4 = new Student();// s4[rno,name,std,marks]
		Student s5 = new Student();// s5[rno,name,std,marks]
		
		s1.scanData();// 1 Ganesh 12 100 DPS
		s2.scanData();
		s3.scanData();
		s4.scanData();
		s5.scanData();
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
		s4.dispData();
		s5.dispData();
	}
}