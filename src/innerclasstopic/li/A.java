package innerclasstopic.li;

public class A 
{
	private int no =  100;
	
	void disp() 
	{
		// 3. Local Innerclass
		class B
		{
			void show() 
			{
				System.out.println("B -- show()--NO : " + no);
			}
		}
		B obj = new B();
		obj.show();
	}

	public static void main(String[] args) 
	{
		A obj = new A();

		obj.disp();
	}
}
