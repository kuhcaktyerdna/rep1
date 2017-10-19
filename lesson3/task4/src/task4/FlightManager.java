
package task4;


public class FlightManager {
    
    private int canceledFlights;
    private int lateFlights;
    private Flight[] flights;
    private int flightNum;
    private Passenger[] passengers;
    private int passengerNum;
    
    public FlightManager(int numOfFlights, int numOfPassangers){
        flights = new Flight[numOfFlights];
        flightNum=0;
        passengers = new Passenger[numOfPassangers];
        passengerNum=0;
    }
    
    public Flight[] addFlight(Flight flight){
        flights[flightNum]=flight;
        Printer.println("Flight "+flight.getName()+" was added.");
        flightNum++;
        return flights;
    }
    
    public Flight[] removeFlight(Flight flight){
        flights[flightNum]=null;
        flightNum--;
        return flights;
    }
    
    public Passenger[] addPassenger(Passenger passenger, Flight flight){
        if (flight.getStatus()=="canceled") {
            passenger = null;
            
            //Printer.println("Passengers weren't added to "+flight.getName()+". Flight is canceled.");
        } else if(passengers.length<100) {
        passengers[passengerNum]=passenger;
        passengerNum++;}
        //else Printer.println("Passengers weren't added to "+flight.getName()+". Aircraft is full.");
        return passengers;
    }
    
    public Passenger[] removePassenger(Passenger passenger){
        passengers[passengerNum]=null;
        passengerNum--;
        return passengers;
    }
    
    
    
    public Passenger[] managePassengers(Flight flight, Passenger passenger, Passenger[] passengers, String command){
        if(command.equals("add")){ 
            for (int i=0; i<passengers.length; i++){
                this.passengers = addPassenger(passenger, flight);
            }
        }
        else if(command.equals("remove")) {
            for (int i=0; i<passengers.length; i++){
            this.passengers = removePassenger(passenger);
            }
        }
        else Printer.print("Error. Wrong command.");
        return passengers;
    }
    
    public Flight[] manageFlights(Flight[] flights, Flight flight){
        flights = addFlight(flight);
        return flights;
    }
     
    public void showInfo(Flight[] flights, Passenger[] passengers){
        checkFlightStatus(flights);
        showFlightsInformation();
        Printer.println("Number of late flights: "+lateFlights+" . Number of canceled flights: "+canceledFlights);
    }


    private void showFlightsInformation(){
         Printer.print("There are "+flights.length+" flights are going to be started.");
    }
   
    private void checkFlightStatus(Flight[] flights){
        for(int i=0; i<flights.length-1; i++){
            if(flights[i].getStatus()=="canceled") canceledFlights++;
            else if(flights[i].getStatus()=="late") lateFlights++;
        }
    }

}
