
package task4;


public class FlightManager {
    
    private int canceledFlights;
    private int lateFlights;
    
    
    
    public Passenger[] managePassengers(Flight flight, Passenger passenger, Passenger[] passengers, String command){
        if(command.equals("add")) passengers = addPassenger(flight, passenger, passengers);
        else if(command.equals("remove")) passengers = removePassenger(passenger, passengers);
        else Printer.print("Error. Wrong command.");
        return passengers;
    }
    
    public Flight[] manageFlights(Flight[] flights, Flight flight){
        Flight[] newFlights = addFlight(flights, flight);
        return newFlights;
    }
     
    public void showInfo(Flight[] flights, Passenger[] passengers){
        showPassengersInformation(passengers);
        checkFlightStatus(flights);
        showFlightsInformation(flights);
        Printer.println("Number of late flights: "+lateFlights+" . Number of canceled flights: "+canceledFlights);
    }
    
    private Flight[] addFlight(Flight[] flights, Flight flight){
        Flight[] newFlights = new Flight[flights.length+1];
        System.arraycopy(flights, 0, newFlights, 0, flights.length);
        newFlights[newFlights.length-1]= flight;
        Printer.println("Flight "+flight.getName()+" was added.");
        return newFlights;
    }
    
     private Passenger[] addPassenger(Flight flight, Passenger passenger, Passenger[] passengers) {
        Passenger[] newPassengers = new Passenger[passengers.length + 1];
        if ("canceled".equals(flight.getStatus())) {
            passengers = null;
            Printer.println("Passengers weren't added to "+flight.getName()+". Flight is canceled.");
        } else if(passengers.length<100) {
            System.arraycopy(passengers, 0, newPassengers, 0, passengers.length);
            newPassengers[newPassengers.length - 1] = passenger;
        }
        else Printer.println("Passengers weren't added to "+flight.getName()+". Aircraft is full.");
        return newPassengers;
        }
    

    private Passenger[] removePassenger(Passenger passenger, Passenger[] passengers) {
        Passenger[] newPassengers = new Passenger[passengers.length - 1];
        return newPassengers;
    }

    private void showFlightsInformation(Flight[] flights){
         Printer.print("There are "+flights.length+" flights are going to be started.");
    }
    
    private void showPassengersInformation(Passenger[] passengers){
         Printer.print("There are "+passengers.length+" passengers ready to enter the aircraft.");
    }
    
    private void checkFlightStatus(Flight[] flights){
        for(int i=0; i<flights.length-1; i++){
            if(flights[i].getStatus()=="canceled") canceledFlights++;
            else if(flights[i].getStatus()=="late") lateFlights++;
        }
    }

}
