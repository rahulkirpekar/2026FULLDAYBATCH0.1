package stringtopic.mutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		StringBuilder sb1 = new StringBuilder("rahul");
		StringBuilder sb2 = new StringBuilder("Kirpekar");
		
		System.out.println("sb1 : " + sb1+"---"+sb1.hashCode());
		System.out.println("sb2 : " + sb2+"---"+sb2.hashCode());

		// Mutable Operation
		sb1.append(sb2);
		
		System.out.println("sb1 : " + sb1+"---"+sb1.hashCode());
		System.out.println("sb2 : " + sb2+"---"+sb2.hashCode());
	}
}
