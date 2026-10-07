package oops.abstopic.aclass.task1;

// 0% to 100% Abstraction -- Abstract class
public abstract class A 
{
	int no1,no2;
	
	A()
	{
		System.out.println("A() Default Constructor");
		no1 = 10;
		no2 = 20;
	}
	
	// Abstract Methods
	public abstract void test1();
	public abstract void test2();
	
	// Non-Abstract Methods
	public void test3() 
	{
		System.out.println("A : test3()");
	};
	public void test4() 
	{
		System.out.println("A : test4()");
	}
}
