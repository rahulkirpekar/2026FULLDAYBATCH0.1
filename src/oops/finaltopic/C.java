package oops.finaltopic;

public class C extends B
{
	@Override
	public void test1() 
	{
		System.out.println("C : test1()");
	}
	public static void main(String[] args) 
	{
		 A obj = new C();
		 
		 obj.test1();
	}
}
