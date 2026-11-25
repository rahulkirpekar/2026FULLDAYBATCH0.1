package innerclasstopic.ai;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		B obj = new B();
//		obj.addFun();

		// 2. Anonymous Innerclass
		A objA = new A() 
		{
			@Override
			public void addFun() 
			{
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter No1 : ");
				int no1 = sc.nextInt();
				System.out.println("Enter No2 : ");
				int no2 = sc.nextInt();
				
				int ans = no1 + no2;
				
				System.out.println("Addition : " + ans);
				System.out.println("ClassName : "+ this.getClass().getName());
			} 
		};	
		objA.addFun();
	}
}
