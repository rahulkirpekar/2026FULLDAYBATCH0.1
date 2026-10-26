package stringtopic.immutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		Ways to create Object of String class:-
//		-----------------------------------------

//		1. By String Literal Way [RAM----->HEAP-------->SCP(String Constant Pool)]:- 
//		----------------------------------------------------------------------------

//		"String class is Special class"

		String name1 = "royal";
		String name2 = "royal";
		String name3 = "technosoft";
		String name4 = name1;

		String name5 = "royaltechnosoft";
		String name6 = name1+name3; //name1.concat(name3);// royaltechnosoft
		String name7 = name3;
		String name8 = name5;
		String name9 = name6;
		
		System.out.println("1. referenceBased(==) : ");
		System.out.println("---------------------------------");
		
		System.out.println("name1==name2 : " + (name1==name2));  		
		System.out.println("name1==name3 : " + (name1==name3));  		
		System.out.println("name1==name4 : " + (name1==name4));  		
		System.out.println("name1==name5 : " + (name1==name5));  		
		System.out.println("name1==name6 : " + (name1==name6));  		
		System.out.println("name1==name7 : " + (name1==name7));  		
		System.out.println("name1==name8 : " + (name1==name8));  		
		System.out.println("name1==name9 : " + (name1==name9));  		
		System.out.println("name2==name3 : " + (name2==name3));  		
		System.out.println("name2==name4 : " + (name2==name4));  		
		System.out.println("name2==name5 : " + (name2==name5));  		
		System.out.println("name2==name6 : " + (name2==name6));  		
		System.out.println("name2==name7 : " + (name2==name7));  		
		System.out.println("name2==name8 : " + (name2==name8));  		
		System.out.println("name2==name9 : " + (name2==name9));  		
		System.out.println("name3==name4 : " + (name3==name4));  		
		System.out.println("name3==name5 : " + (name3==name5));  		
		System.out.println("name3==name6 : " + (name3==name6));  		
		System.out.println("name3==name7 : " + (name3==name7));  		
		System.out.println("name3==name8 : " + (name3==name8));  		
		System.out.println("name3==name9 : " + (name3==name9));  		
		System.out.println("name4==name5 : " + (name4==name5));  		
		System.out.println("name4==name6 : " + (name4==name6));  		
		System.out.println("name4==name7 : " + (name4==name7));  		
		System.out.println("name4==name8 : " + (name4==name8));  		
		System.out.println("name4==name9 : " + (name4==name9));  		
		System.out.println("name5==name6 : " + (name5==name6));  		
		System.out.println("name5==name7 : " + (name5==name7));  		
		System.out.println("name5==name8 : " + (name5==name8));  		
		System.out.println("name5==name9 : " + (name5==name9));  		
		System.out.println("name6==name7 : " + (name6==name7));  		
		System.out.println("name6==name8 : " + (name6==name8));  		
		System.out.println("name6==name9 : " + (name6==name9));  		
		System.out.println("name7==name8 : " + (name7==name8));  		
		System.out.println("name8==name9 : " + (name8==name9));  		
		System.out.println("name8==name9 : " + (name8==name9));	 		
		
		
		System.out.println("2. valuesBased(.equals()) :- ");
		System.out.println("---------------------------------");
		
		System.out.println("name1.equals(name2) : " + (name1.equals(name2)));      
		System.out.println("name1.equals(name3) : " + (name1.equals(name3)));      
		System.out.println("name1.equals(name4) : " + (name1.equals(name4)));      
		System.out.println("name1.equals(name5) : " + (name1.equals(name5)));      
		System.out.println("name1.equals(name6) : " + (name1.equals(name6)));      
		System.out.println("name1.equals(name7) : " + (name1.equals(name7)));      
		System.out.println("name1.equals(name8) : " + (name1.equals(name8)));      
		System.out.println("name1.equals(name9) : " + (name1.equals(name9)));      
		System.out.println("name2.equals(name3) : " + (name2.equals(name3)));      
		System.out.println("name2.equals(name4) : " + (name2.equals(name4)));      
		System.out.println("name2.equals(name5) : " + (name2.equals(name5)));      
		System.out.println("name2.equals(name6) : " + (name2.equals(name6)));      
		System.out.println("name2.equals(name7) : " + (name2.equals(name7)));      
		System.out.println("name2.equals(name8) : " + (name2.equals(name8)));      
		System.out.println("name2.equals(name9) : " + (name2.equals(name9)));      
		System.out.println("name3.equals(name4) : " + (name3.equals(name4)));      
		System.out.println("name3.equals(name5) : " + (name3.equals(name5)));      
		System.out.println("name3.equals(name6) : " + (name3.equals(name6)));      
		System.out.println("name3.equals(name7) : " + (name3.equals(name7)));      
		System.out.println("name3.equals(name8) : " + (name3.equals(name8)));      
		System.out.println("name3.equals(name9) : " + (name3.equals(name9)));      
		System.out.println("name4.equals(name5) : " + (name4.equals(name5)));      
		System.out.println("name4.equals(name6) : " + (name4.equals(name6)));      
		System.out.println("name4.equals(name7) : " + (name4.equals(name7)));      
		System.out.println("name4.equals(name8) : " + (name4.equals(name8)));      
		System.out.println("name4.equals(name9) : " + (name4.equals(name9)));      
		System.out.println("name5.equals(name6) : " + (name5.equals(name6)));      
		System.out.println("name5.equals(name7) : " + (name5.equals(name7)));      
		System.out.println("name5.equals(name8) : " + (name5.equals(name8)));      
		System.out.println("name5.equals(name9) : " + (name5.equals(name9)));      
		System.out.println("name6.equals(name7) : " + (name6.equals(name7)));      
		System.out.println("name6.equals(name8) : " + (name6.equals(name8)));      
		System.out.println("name6.equals(name9) : " + (name6.equals(name9)));      
		System.out.println("name7.equals(name8) : " + (name7.equals(name8)));      
		System.out.println("name8.equals(name9) : " + (name8.equals(name9)));      
		System.out.println("name8.equals(name9) : " + (name8.equals(name9)));      
	}
}
