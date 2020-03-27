package Assesment.Airline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Object defining a trip composed of multiple flights
 * @author 21brownz
 * @since 3/26/20
 */
public class Trip {
    private List<Flight> flights;

    /**
     * constructor that imports a list of flights
     * @param flights list of flights
     */
    public Trip(List<Flight> flights){
        this.flights = flights;
    }

    /**
     * adds a flight to the list of flights in the Trip
     * @param flight flight to add
     */
    public void addFlight(Flight flight){
        flights.add(flight);
    }

    /**
     * gets the duration of the trip in minutes
     * @return duration in minutes
     */
    public int getDuration(){
        return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size()-1).getArrivalTime());
    }

    /**
     * gets the shortest layover between two flights
     * @return shortest layover.
     */
    public int getShortestLayover() {
        if (flights.size() >= 2) {
            ArrayList<Integer> layovers = new ArrayList<>();
            int i = 1;
            while (i <= flights.size()) {
                layovers.add(flights.get(i).getArrivalTime().minutesUntil(flights.get(i - 1).getDepartureTime()));
                i++;
            }
            Collections.sort(layovers);
            return layovers.get(0);
        }
        return -1;
    }
}
