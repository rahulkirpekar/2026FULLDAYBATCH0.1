
package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static  void getSort(int a[] , int index1, int index2) 
	{
		

	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int a[] = new int[5];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : " );
			a[i] = sc.nextInt();
		}
		
//		scan index1,index2
		
//		getSort(a, index1, index2);
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+i+"] : " + a[i]);
		}
	}
}
