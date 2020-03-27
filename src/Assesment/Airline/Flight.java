package Assesment.Airline;

/**
 * An object that defines a flight. based of of code from APCS test 5
 * @author 21brownz
 * @since 3/26/20
 */
public class Flight implements Comparable<Flight> {

    private String depAirport,ArrAirport;
    private Time departure, arrival;

    /**
     * Constuctor for a Flight object
     * @param dep departing airport IATA code
     * @param h departure time hours
     * @param min departure time minutes
     * @param arr arrival airport IATA code
     * @param harr arrival time hours
     * @param minarr arrival time minutes
     */
    public Flight(String dep , int h, int min, String arr, int harr, int minarr){
        this.depAirport = dep;
        departure = new Time(h , min);
        this.ArrAirport = arr;
        arrival = new Time(harr, minarr);
    }

    /**
     * getter for departure time
     * @return departure time
     */
    public Time getDepartureTime() {
        return departure;
    }

    /**
     * getter for arrival time
     * @return arrival time
     */
    public Time getArrivalTime() {
        return arrival;
    }

    /**
     * comparator method for a flight's departure time.
     * @param other flight to compare to
     * @return int difference following comparator convention
     */
    public int compareTo(Flight other) {
        return this.departure.compareTo(other.departure);
    }
}
