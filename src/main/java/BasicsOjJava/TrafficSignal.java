package BasicsOjJava;

public class TrafficSignal {
	
	
	public void ShowSignalStatus(String color,String vehicle,String patient)
	{
		if(color.equalsIgnoreCase("Green"))
		{
			System.out.println("You are good to go");
		}
		else if(color == "Red")
		{
			if(vehicle.equalsIgnoreCase("Ambulance") && patient.equalsIgnoreCase("Yes") ) {
				
				System.out.println("Please give me a way i am Ambulance");
				
			}
			else
			{
			System.out.println("You have to stop");
			}
		}
		else if(color == "Orange" || color=="Yellow")
		{
			System.out.println("You are about to stop /start");
		}
		else
		{
			System.out.println("You have given invalid color");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficSignal T = new TrafficSignal();
		T.ShowSignalStatus("Red","Ambulance","Yes");
	}

}
