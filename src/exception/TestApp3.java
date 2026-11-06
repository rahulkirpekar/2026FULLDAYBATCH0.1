package exception;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String no1Str = "1a2b3c";
		
					// java.lang.NumberFormatException
		int no1 = Integer.parseInt(no1Str);
		
		System.out.println("No1 : " + (no1Str+200));
	}
}
