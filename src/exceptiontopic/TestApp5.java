package exceptiontopic;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		
		//  java.lang.ArrayIndexOutOfBoundsException
		a[5] = 100;
		
		System.out.println("a[5] : " + a[5]);
		
	}

}
