package polymorphismtopic.runtime.task3;

import java.util.Scanner;

public class Car extends Vehicle
{
	boolean hasSunroof;

	public Car() 
	{
	}
	
	public Car(int vehicleId, String brand, double rentPerDay, boolean hasSunroof) 
	{
		super(vehicleId, brand, rentPerDay);
		this.hasSunroof = hasSunroof;
	}

	@Override
	public void startVehicle() 
	{
		System.out.println("Car : Started.");
	}
	
	@Override
	public void showDetails() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Howmanydays for you want to take Car for rent : ");
		int days = sc.nextInt();
		
		System.out.println("Car : showDetails--\nVehicleId : " + vehicleId+" \nBrand : " + brand+" \nRent Per Day : " + rentPerDay+" \nHas Sunroof : " + hasSunroof+"\nTotal Rent : " + (days*rentPerDay));
	}
	
	
	public void enableAC() 
	{
		System.out.println("Car has enableAC" );
	}
}
