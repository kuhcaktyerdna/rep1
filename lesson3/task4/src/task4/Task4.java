package task4;

public class Task4 {

    public static void main(String[] args) {
        Airport airport = new Airport("Airport");
        Flight[] flights = new Flight[0];

        Passenger[] passengersForFlight1 = new Passenger[92];
        Passenger[] passengersForFlight2 = new Passenger[100];
        Passenger[] passengersForFlight3 = new Passenger[100];
        Passenger[] passengersForFlight4 = new Passenger[100];
        Passenger[] passengersForFlight5 = new Passenger[99];
        Passenger passenger = new Passenger();
        Flight flight1 = new Flight("New York - Tokyo ");
        flight1.setStatus("canceled");
        Flight flight2 = new Flight("New York - Berlin ");
        flight2.setStatus("late");
        Flight flight3 = new Flight("New York - Moscow ");
        flight3.setStatus("canceled");
        Flight flight4 = new Flight("New York - Minsk ");
        flight4.setStatus("late");
        Flight flight5 = new Flight("New York - London ");
        flight5.setStatus("normal");

        FlightManager flManager = new FlightManager(5, 500);

        flights = flManager.manageFlights(flights, flight1);
        flights = flManager.manageFlights(flights, flight2);
        flights = flManager.manageFlights(flights, flight3);
        flights = flManager.manageFlights(flights, flight4);
        flights = flManager.manageFlights(flights, flight5);
        passengersForFlight1 = flManager.managePassengers(flight1, passenger, passengersForFlight1, "add");
        passengersForFlight2 = flManager.managePassengers(flight2, passenger, passengersForFlight2, "add");
        passengersForFlight3 = flManager.managePassengers(flight3, passenger, passengersForFlight3, "add");
        passengersForFlight4 = flManager.managePassengers(flight4, passenger, passengersForFlight4, "add");
        passengersForFlight5 = flManager.managePassengers(flight5, passenger, passengersForFlight5, "add");

        flManager.showInfo(flights, passengersForFlight5);
    }

}
