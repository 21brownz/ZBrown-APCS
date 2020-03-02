package Unit6.Apptrail;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class WaypointComparator implements Comparator<Waypoint> {

    private String sort;
    private boolean asc;

    public WaypointComparator(){
        asc = true;
        sort = "NA";
    }

    public WaypointComparator(boolean a, @NotNull String sort){
        this.asc = a;
        this.sort = sort.toUpperCase();
    }

    @Override
    public int compare(Waypoint w1, Waypoint w2) {
        if(asc) {
            if ("NA".equals(sort)) {
                return w1.getName().compareTo(w2.getName());
            } else if ("DS".equals(sort)) {
                return Double.compare(w1.getDistanceToSpringer(), w2.getDistanceToSpringer());
            } else if ("DK".equals(sort)) {
                return Double.compare(w1.getDistancetoKatahdin(), w2.getDistancetoKatahdin());
            } else if ("EL".equals(sort)) {
                return Integer.compare(w1.getElevation(), w2.getElevation());
            } else {
                throw new IllegalStateException("Illegal Waypoint");
            }
        }else{
            if ("NA".equals(sort)) {
                return w2.getName().compareTo(w1.getName());
            } else if ("DS".equals(sort)) {
                return Double.compare(w2.getDistanceToSpringer(), w1.getDistanceToSpringer());
            } else if ("DK".equals(sort)) {
                return Double.compare(w2.getDistancetoKatahdin(), w1.getDistancetoKatahdin());
            } else if ("EL".equals(sort)) {
                return Integer.compare(w2.getElevation(), w1.getElevation());
            } else {
                throw new IllegalStateException("Illegal Waypoint");
            }
        }
    }
}
