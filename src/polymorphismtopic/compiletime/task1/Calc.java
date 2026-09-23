package polymorphismtopic.compiletime.task1;


// Compiletime Polymorphism
//      |
// Method Overloadding---different-different  version
public class Calc 
{
	public static  void addFun(float no1,float no2) 
	{
		System.out.println("addFun(float no1,float no2)  : " + (no1+no2));
	}
	
	public static  void addFun(double no1,double no2) 
	{
		System.out.println("addFun(double no1,double no2)  : " + (no1+no2));
	}
	
	public static  void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(int no1,int no2,int no3)  : " + (no1+no2+no3));
	}
	public static  void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4)  : " + (no1+no2+no3+no4));
	}
	public static  void addFun(int no1,int no2,int no3,int no4,int no5) 
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4,int no5)  : " + (no1+no2+no3+no4+no5));
	}

	public static void main(String[] args) 
	{
		Calc.addFun('a', 'b');
		
	}
}
/*
 Method Overloadding step by step filter:-
 ---------------------------------------------
	
	1. Argument Count
	
	2. excat data-type match
	
	3. Type pramotion Rule


Type pramotion Rule:-
---------------------

	boolean----X
	
			byte
			 |
		    short
			 |
char-------> int 
			 |
			long 
			 |
			float 
			 |
			double 
			  
			 	
















*/



