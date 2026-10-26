package stringtopic.immutable;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		2. By 'new' keyword way [RAM----->HEAP]:-	
//		----------------------------------------

		String name10 = new String("royal");
		String name11 = new String("royal");
		String name12 = name10;
		String name13 = new String("technosoft");
		String name14 = name13;

//		Object Equality:-
//		------------------
//				1. referenceBased(==)				2. valuesBased(.equals())
//				---------------------				-------------------------
		
		System.out.println("1. referenceBased(==) : ");
		System.out.println("---------------------------------");
		System.out.println("name10==name11 : " + (name10==name11));//false
		System.out.println("name10==name12 : " + (name10==name12));//true
		System.out.println("name10==name13 : " + (name10==name13));//false
		System.out.println("name10==name14 : " + (name10==name14));//false
		System.out.println("name11==name12 : " + (name11==name12));//false
		System.out.println("name11==name13 : " + (name11==name13));//false
		System.out.println("name11==name14 : " + (name11==name14));//false
		System.out.println("name12==name13 : " + (name12==name13));//false
		System.out.println("name12==name14 : " + (name12==name14));//false
		System.out.println("name13==name14 : " + (name13==name14));//true

		System.out.println("2. valuesBased(.equals()) :- ");
		System.out.println("---------------------------------");
		System.out.println("name10==name11 : " + (name10==name11));//true
		System.out.println("name10==name12 : " + (name10==name12));//true
		System.out.println("name10==name13 : " + (name10==name13));//false
		System.out.println("name10==name14 : " + (name10==name14));//false
		System.out.println("name11==name12 : " + (name11==name12));//true
		System.out.println("name11==name13 : " + (name11==name13));//false
		System.out.println("name11==name14 : " + (name11==name14));//false
		System.out.println("name12==name13 : " + (name12==name13));//false
		System.out.println("name12==name14 : " + (name12==name14));//false
		System.out.println("name13==name14 : " + (name13==name14));//true
	}
}
