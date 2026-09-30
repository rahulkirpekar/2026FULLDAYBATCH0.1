package polymorphismtopic.runtime.task3;

import java.util.Scanner;

public class Bike extends Vehicle
{
	boolean helmetIncluded;

	public Bike() 
	{
	}
	
	public Bike(int vehicleId, String brand, double rentPerDay, boolean helmetIncluded) 
	{
		super(vehicleId, brand, rentPerDay);
		this.helmetIncluded = helmetIncluded;
	}
	@Override
	public void startVehicle() 
	{
		System.out.println("Bike : Started.");
	}
	
	@Override
	public void showDetails() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Howmanydays for you want to take Bike for rent : ");
		int days = sc.nextInt();

		System.out.println("Bike : showDetails--\nVehicleId : " + vehicleId+" \nBrand : " + brand+" \nRent Per Day : " + rentPerDay+" \nHelmet Included : " + helmetIncluded+"\nTotal Rent : " + (days*rentPerDay));
	}
	
	public void provideHelmet() 
	{
		System.out.println("Bike Owner Provide Helmet");
	}
}
