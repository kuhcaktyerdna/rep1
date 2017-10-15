public class task2 {
    public static void main(String[] args)
    {
        Airport goodFlight = new Airport("Good flight", "Townhall str. 17", 1212121);
		ControlTower CT1 = new ControlTower();
        Aircraft boeing737 = new Aircraft("Hamburg - Amsterdam", "Boeing", 737);
		CT1.accidentWarningSystem();
		CT1.showPlanePosition();
		Dispatcher disp1 = new Dispatcher("Senior dispatcher ", "John ", "Snow ");
		disp1.Greeting();
		CT1.informAboutFlightStart();
		CT1.createFlightPlan();
		
		goodFlight.advertisment();
    }

}