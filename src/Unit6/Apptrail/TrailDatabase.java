package Unit6.Apptrail;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TrailDatabase {
    ArrayList<Waypoint> waypoints;

    public TrailDatabase(){
    waypoints = new ArrayList<>();
    }
    public String[] getSearchTerms(){

        try{
            Scanner sc = new Scanner(System.in);
        }catch(Exception e){
            e.printStackTrace();
        }

        return new String[]{"bruh", "moment"};
    } //used in main for input

    public void populateDatabase(){
        try {
            Scanner scan = new Scanner(new File("datafiles/apptrailDB.txt"));
            while(scan.hasNextLine()){
                String loc = scan.nextLine();
                String[] split = loc.split("\t");
                String type = split[0];
                String name = split[1];
                String state = split[2];
                double latitude = Double.parseDouble(split[3]);
                double longitude = Double.parseDouble(split[4]);
                double disttoSpr = Double.parseDouble(split[5]);
                double disttoKata = Double.parseDouble(split[6]);
                int elevation = Integer.parseInt(split[7]);
                waypoints.add(new Waypoint(type, name, state, latitude, longitude, disttoSpr, disttoKata, elevation));
            }
        scan.close();
        System.out.println(waypoints);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void printDatabase(){

    }
    public void sortDB(WaypointComparator wc){

    }
    public static void main(String[] args){
        TrailDatabase db = new TrailDatabase();
        db.populateDatabase();
    }
}
