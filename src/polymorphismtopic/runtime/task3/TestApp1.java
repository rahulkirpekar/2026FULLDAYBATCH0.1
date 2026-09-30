package polymorphismtopic.runtime.task3;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// 4. Create a Vehicle array, store all three object types, and loop through it to show details and calculate rent.
		
		Vehicle v[] = new Vehicle[3];
		
		v[0] = new Car(8984, "MG Hector", 4000, true);
		v[1] = new Bike(4505, "Honda", 500, true);
		v[2] = new ElectricVehicle(1010, "TATA", 1000, 100);

		
		for (int i = 0; i < v.length; i++) 
		{
			Vehicle v1 = v[i];
			
			if (v1 instanceof Car) 
			{
				Car car = (Car)v1;
				car.startVehicle();
				car.showDetails();
				car.enableAC();
				System.out.println("------------------------------------");
			} 
			else if (v1 instanceof ElectricVehicle) 
			{
				ElectricVehicle ev = (ElectricVehicle)v1;
				ev.startVehicle();
				ev.showDetails();
				ev.checkBatteryHealth();
				System.out.println("------------------------------------");
			}
			else if (v1 instanceof Bike) 
			{
				Bike bike = (Bike)v1;
				bike.startVehicle();
				bike.showDetails();
				bike.provideHelmet();
				System.out.println("------------------------------------");
			}
		}
	}
}