package oops.classexeflow;

// Class Execution Flow
//------------------------
public class A
{
	// 1. static Block
	static
	{
		System.out.println("Static Block---1(1)");
	}
	static
	{
		System.out.println("Static Block---2(1)");
	}
	
	// static method
	static void testStaticMethod()
	{
		System.out.println("static Methd : testStaticMethod()---3"); 
	}
		
	// 2. Instance Block
	{
		System.out.println("Instance Block---1(4)");
	}
	{
		System.out.println("Instance Block---2(4)");
	}
	
	// Default Constructor
	A()
	{
		System.out.println("A-Default Constructor---(5)");
	}
	
	// Para Constructor
	A(int no)
	{
		System.out.println("A-Para Constructor---(5)");
	}
	
	// Nonstatic method
	void testNonStaticMethod()
	{
		System.out.println("Non-static Method : testNonStaticMethod()---6"); 
	}
	
	public static void main(String[] args) 
	{
		System.out.println("START : Main Method---2");
		
		A.testStaticMethod();
		
		System.out.println("-------------------------");
		A obj1 = new A();
		
		System.out.println("-------------------------");
		A obj2 = new A(100);
		
		
		
		obj2.testNonStaticMethod();

		System.out.println("EXIT : Main Method---7");
	}
}
