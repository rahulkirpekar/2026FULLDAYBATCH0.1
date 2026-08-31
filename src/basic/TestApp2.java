package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		Array Declaration:- 
//		--------------------------
			int a[] = new int[5];
			
			System.out.println("a array : " + a);// [I@24d46ca6
			
			System.out.println("a.length : " + a.length);
			
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println("Enter A["+ i +"]: ");
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println("A["+ i +"]: " + a[i]);
			}
			
			
//			float a2[] = new float[5];
//			double a3[] = new double[5];
//		--------------------------------------------
//			int a4[] = new int[5];
//			int[] a5 = new int[5];
//			int []a6 = new int[5];
//			int [] a7 = new int[5];
//		-----
//			int [] a8 = null;
//			a8 = new int[5];
//		-----
//		Array Declaration With Initialisation:-
//		-----------------------------------------
//			int a9[] = {10,20,30,40,50};
//			int a10[] = new int[]{10,20,30,40,50};
	}
}
