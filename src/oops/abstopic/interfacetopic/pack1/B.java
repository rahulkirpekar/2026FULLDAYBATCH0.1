package oops.abstopic.interfacetopic.pack1;

public class B implements A
{
	@Override
	public void test1() 
	{
		System.out.println("B : test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("B : test2()");
	}
	@Override
	public void test3() 
	{
		System.out.println("B : test3()");
	}
	public static void main(String[] args) 
	{
		A obj = new B();
		obj.test1();
		obj.test2();
		obj.test3();
		
		A.test4();
		obj.test5();
	}
}
