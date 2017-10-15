public class ControlTower implements IAirTrafficControl 
{

	
	public void showPlanePosition()
	{
		System.out.print("Plane number 1 is staying on flying line. ");
	}

	public void accidentWarningSystem()
	{
		System.out.println("No accidents. ");
	}	

	public void informAboutFlightStart(){
		System.out.print("Flight 'Hamburg - Amsterdam' starts at 8:30 PM. ");
	}
	
	public void createFlightPlan(){
		System.out.print("Flight will take 1,5 hours. At 10:00 PM plane will arrive to Amsterdam. All people must be in plane at 8:25 PM. ");
	}

	}