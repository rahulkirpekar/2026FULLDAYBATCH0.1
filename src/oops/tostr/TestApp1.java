package oops.tostr;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		Object - Cosmic Super class
		
		Student s = new Student(1,"Ganesh",12,100);
		
							//  s-->oops.tostr.Student@4517d9a3
		System.out.println("s object : " + s);// .toString() 
		System.out.println("s.toString() object : " + s.toString());//  
		
		//s.scanData();
		
		// 1. by String Literal way
		String value1 = "rahul";
		
		// 2. by String 'new' keyword way
		String value2 = new String("rahul");
				
		System.out.println("value1 : " + value1.toString());//.toString()
		System.out.println("value2 : " + value2);//.toString()
	}
}
