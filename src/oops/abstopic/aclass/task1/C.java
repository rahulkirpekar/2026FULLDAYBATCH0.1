package oops.abstopic.aclass.task1;

public class C extends B
{
	C()
	{
		System.out.println("C() Default Constructor");
	}
	@Override
	public void test2() 
	{
		System.out.println("C : test2()");
	}
	
	public static void main(String[] args) 
	{
		A obj = new C();
		
		obj.test1();// B--test1()
		obj.test2();// C : test2()
		obj.test3();// A : test3()
		obj.test4();// A : test4()
		
//		B : test1()
//		C : test2()
//		A : test3()
//		A : test4()
	}
}
