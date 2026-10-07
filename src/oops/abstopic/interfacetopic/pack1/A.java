package oops.abstopic.interfacetopic.pack1;

public interface A 
{
//	1. Constant Variables(public static final)
	int NO = 10;// public static final
	
//	2. methods
//		1. abstract methods
	void test1();// public abstract
	void test2();// public abstract
	void test3();// public abstract
	
//	2. Non-abstract methods
// --------------------------
//	1. static method--8
	
	static void test4() 
	{
		System.out.println("A : static test4()");
	}
	
//  2. default method--8
	default void test5() 
	{
		System.out.println("A : default test5()");
		test6();
	}
	
//	3. private method--9			
	private void test6() 
	{
		System.out.println("A : private test6()");
	}
}
