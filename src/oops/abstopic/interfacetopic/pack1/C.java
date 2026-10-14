package oops.abstopic.interfacetopic.pack1;

public class C extends B
{
	@Override
	public void test2() 
	{
		System.out.println("C : test2()");
	}
	
	@Override
	public void test3() 
	{
		System.out.println("C : test3()");
	}
	
	public static void main(String[] args) 
	{
		A obj = new C();
		obj.test1();
		obj.test2();
		obj.test3();
		
		A.test4();
		obj.test5();
	}

}
