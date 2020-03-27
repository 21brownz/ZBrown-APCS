package Assesment.Airline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trip {
    private List<Flight> flights;

    public Trip(List<Flight> flights){
        this.flights = flights;
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public int getDuration(){
        return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size()-1).getArrivalTime());
    }

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
