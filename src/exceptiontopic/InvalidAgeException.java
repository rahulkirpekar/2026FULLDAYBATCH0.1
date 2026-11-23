package exceptiontopic;

// User Defined Exception / Custom Exception
//--------------------------------------------


// 1. checked Exception
//public class InvalidAgeException extends Exception


// 2. Unchecked Exception
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
