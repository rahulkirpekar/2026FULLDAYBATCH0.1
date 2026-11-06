package exceptiontopic;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		A objA = new B();
		
		// ClassCastException
		C objC = (C)objA;
		
	}
}
