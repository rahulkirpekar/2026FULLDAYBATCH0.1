package polymorphismtopic.runtime.task3;

import java.util.Scanner;

public class ElectricVehicle extends Vehicle
{
	double batteryPercentage;
	
	public ElectricVehicle() 
	{
	}

	public ElectricVehicle(int vehicleId, String brand, double rentPerDay, double batteryPercentage) 
	{
		super(vehicleId, brand, rentPerDay);
		this.batteryPercentage = batteryPercentage;
	}
	
	@Override
	public void startVehicle() 
	{
		System.out.println("ElectricVehicle : Started.");
	}
	@Override
	public void showDetails() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Howmanydays for you want to take ElectricVehicle for rent : ");
		int days = sc.nextInt();

		System.out.println("ElectricVehicle : showDetails--\nVehicleId : " + vehicleId+" \nBrand : " + brand+" \nRent Per Day : " + rentPerDay+" \nBatteryPercentage : " + batteryPercentage+"\nTotal Rent : " + (days*rentPerDay));
	}
	
	public void checkBatteryHealth() 
	{
		System.out.println("ElectricVehicle : BatteryHealth is Good");
	}
}
