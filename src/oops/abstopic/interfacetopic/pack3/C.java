package oops.abstopic.interfacetopic.pack3;

public class C  extends B implements A
{
	@Override
	public void test1() 
	{
		System.out.println("C : test1()");
	}

	public static void main(String[] args) 
	{
		B obj1 = new B();
		obj1.test1();
	
		A obj2 = new C();
		obj2.test1();
	}
}
