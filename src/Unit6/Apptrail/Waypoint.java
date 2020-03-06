package Unit6.Apptrail;

/**
 * a waypoint object containing geographic and type data
 * @author 21brownz
 * @version 3/5/20
 */
public class Waypoint {

    private String type, name, state;
    private double latitude, longitude, distanceToSpringer, distancetoKatahdin;
    private int elevation;

    /**
     *
     * @param type type
     * @param name name of waypoint
     * @param state state waypoint is in
     * @param latitude latitude of waypoint
     * @param longitude longitude of waypoint
     * @param distanceToSpringer distance of waypoint to springer
     * @param distancetoKatahdin distance of waypoint to katahdin
     * @param elevation elevation of waypoint
     */
    public Waypoint(String type, String name, String state, double latitude, double longitude, double distanceToSpringer, double distancetoKatahdin, int elevation) {
        this.type = type;
        this.name = name;
        this.state = state;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distanceToSpringer = distanceToSpringer;
        this.distancetoKatahdin = distancetoKatahdin;
        this.elevation = elevation;
    }

    /**
     * Converts waypoint to a string
     * @return waypoint as a string
     */
    public String toString(){
        return "Type: " + type + ", Name: " + name + ", State: " + state + ", Latitude: " + latitude + ", Longitude: " + longitude + ", Distance to Springer: " + distanceToSpringer + ", Distance to Katahdin: " + distancetoKatahdin + ", Elevation: " + elevation;
    }

    /**
     * gets type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * gets name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * gets state
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * gets latitude
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * gets longitude
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * gets distance to springer
     * @return distance to springer
     */
    public double getDistanceToSpringer() {
        return distanceToSpringer;
    }

    /**
     * gets distance to katahdin
     * @return distance to katahdin
     */
    public double getDistancetoKatahdin() {
        return distancetoKatahdin;
    }

    /**
     * gets elevation
     * @return elevation
     */
    public int getElevation() {
        return elevation;
    }
}
