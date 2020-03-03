package Unit6.Apptrail;

public class Waypoint {

    private String type, name, state;
    private double latitude, longitude, distanceToSpringer, distancetoKatahdin;
    private int elevation;

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

    public String toString(){
        return "Type: " + type + ", Name: " + name + ", State: " + state + ", Latitude: " + latitude
        + ", Longitude: " + longitude + ", Distance to Springer: " + distanceToSpringer + ", Distance to Katahdin: " + distancetoKatahdin + ", Elevation: " + elevation;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getDistanceToSpringer() {
        return distanceToSpringer;
    }

    public double getDistancetoKatahdin() {
        return distancetoKatahdin;
    }

    public int getElevation() {
        return elevation;
    }
}
