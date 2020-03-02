package Unit6.Apptrail;

import java.util.Comparator;

public class WaypointComparator implements Comparator<Waypoint> {

    private int sort; // 0 - name; 1 - distance to springer; 2 - distance to katahdin; 3 - elevation
    private boolean asc;

    public WaypointComparator() {
        asc = true;
        sort = 0;
    }

    public WaypointComparator(int sort, boolean a) {
        this.asc = a;
        this.sort = sort;
    }

    public int compare(Waypoint w1, Waypoint w2) {
        if(sort > 3 || sort < 0) throw new IllegalArgumentException("Invalid Input");
        int diff = 0;
        if (sort == 0) {
            diff = w1.getName().compareTo(w2.getName());
        } else if (sort == 1) {
            diff = Double.compare(w1.getDistanceToSpringer(), w2.getDistanceToSpringer());
        } else if (sort == 2) {
            diff = Double.compare(w1.getDistancetoKatahdin(), w2.getDistancetoKatahdin());
        } else {
            diff = Integer.compare(w1.getElevation(), w2.getElevation());
        }
        return asc ? diff : -diff;
    }
}
