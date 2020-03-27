package Assesment.Airline;

public class Flight implements Comparable<Flight> {
    private String depAirport,ArrAirport;
    private Time departure, arrival;

    public Flight(String dep , int h, int min, String arr, int harr, int minarr){
        this.depAirport = dep;
        departure = new Time(h , min);
        this.ArrAirport = arr;
        arrival = new Time(harr, minarr);
    }

    public Time getDepartureTime() {
        return departure;
    }

    public Time getArrivalTime() {
        return arrival;
    }

    public int compareTo(Flight other) {
        return this.departure.compareTo(other.departure);
    }
}
