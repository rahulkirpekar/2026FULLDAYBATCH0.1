package basic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a[][] = new int[3][3];
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}	
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if((i+j) == 2) 
				{
					System.out.print(a[i][j]+"\t");
				}else 
				{
					System.out.print(" \t");
				}
				
			}	
			System.out.println();
		}
	}
}
