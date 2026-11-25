package innerclasstopic.mi;

public class A 
{
	private int no = 100;
	
	// 1. Member Innner class
	class B
	{
		void show() 
		{
			System.out.println("No : " + no); 
		}
	}
	
	public static void main(String[] args) 
	{
		A objA  = new A();
		
		A.B objB = objA.new B();
		
		objB.show();
	}
}
