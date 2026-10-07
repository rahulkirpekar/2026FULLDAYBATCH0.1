package oops.abstopic.aclass.task2;

public class PublicPlace extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace : getBehave() -- Citizen Behaviour");
	}
	
	public void getPublicEventInfo() 
	{
		System.out.println("PublicPlace : PublicEventInfo()");
	}
}
