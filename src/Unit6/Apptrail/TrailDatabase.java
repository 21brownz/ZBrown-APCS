package Unit6.Apptrail;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A program that sorts points of interest on the Appalachian trail by certain characteristics
 * @author 21brownz
 * @version 3/5/20
 * @since 2/27/20
 */
public class TrailDatabase {

    /**
     * Waypoint database
     */
    private ArrayList<Waypoint> waypoints;

    /**
     * Class Constructor
     */
    public TrailDatabase() {
        waypoints = new ArrayList<>();
    }

    /**
     * method to get search terms from a list
     */
    public int getSearchTerms(String in) {
        ArrayList<String> terms = new ArrayList<>();
        terms.add("NA");
        terms.add("DS");
        terms.add("DK");
        terms.add("EL");
        return terms.indexOf(in);
    }

    /**
     * helper method to populate Waypoint database
     */
    public void populateDatabase() {
        try {
            /*
    ____                            __     ____              __
   / __ \___  ____ _________  _____/ /_   / __ )____  ____  / /__  ____ _____
  / / / / _ \/ __ `/ ___/ _ \/ ___/ __/  / __  / __ \/ __ \/ / _ \/ __ `/ __ \
 / /_/ /  __/ /_/ / /  /  __(__  ) /_   / /_/ / /_/ / /_/ / /  __/ /_/ / / / /
/_____/\___/\__,_/_/   \___/____/\__/  /_____/\____/\____/_/\___/\__,_/_/ /_( )
                                                                            |/
    __  __                  _
   / / / /__  ________     (_)____   ____ ___  __  __   ______________ _____  ____  ___  _____
  / /_/ / _ \/ ___/ _ \   / / ___/  / __ `__ \/ / / /  / ___/ ___/ __ `/ __ \/ __ \/ _ \/ ___/
 / __  /  __/ /  /  __/  / (__  )  / / / / / / /_/ /  (__  ) /__/ /_/ / / / / / / /  __/ /
/_/ /_/\___/_/   \___/  /_/____/  /_/ /_/ /_/\__, /  /____/\___/\__,_/_/ /_/_/ /_/\___/_/
                                            /____/
    ____                                     __      __        _____ __
   / __/___  _____   ____ ___  __  __   ____/ /___ _/ /_____ _/ __(_) /__
  / /_/ __ \/ ___/  / __ `__ \/ / / /  / __  / __ `/ __/ __ `/ /_/ / / _ \
 / __/ /_/ / /     / / / / / / /_/ /  / /_/ / /_/ / /_/ /_/ / __/ / /  __/
/_/  \____/_/     /_/ /_/ /_/\__, /   \__,_/\__,_/\__/\__,_/_/ /_/_/\___(_)
                            /____/
   _____ _                           __
  / ___/(_)___  ________  ________  / /_  __
  \__ \/ / __ \/ ___/ _ \/ ___/ _ \/ / / / /
 ___/ / / / / / /__/  __/ /  /  __/ / /_/ /
/____/_/_/ /_/\___/\___/_/   \___/_/\__, ( )
                                   /____/|/
 _____
/__  /  ____ ___________
  / /  / __ `/ ___/ ___/
 / /__/ /_/ / /__/ /__
/____/\__,_/\___/\___/
             */
            Scanner scan = new Scanner(new File("datafiles/apptrailDB.txt"));
            while (scan.hasNextLine()) {
                String loc = scan.nextLine();
                String[] split = loc.split("\t");
                waypoints.add(new Waypoint(split[0], split[1], split[2], Double.parseDouble(split[3]), Double.parseDouble(split[4]), Double.parseDouble(split[5]), Double.parseDouble(split[6]), Integer.parseInt(split[7])));
            }
            scan.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for printing contents of the Database.
     */
    public void printDatabase() {
        for (int i = 0; i < waypoints.size(); i++) {
            String type = waypoints.get(i).getType();
            String name = waypoints.get(i).getName();
            String state = waypoints.get(i).getState();
            double lat = waypoints.get(i).getLatitude();
            double lon = waypoints.get(i).getLongitude();
            double ds = waypoints.get(i).getDistanceToSpringer();
            double dk = waypoints.get(i).getDistancetoKatahdin();
            int elev = waypoints.get(i).getElevation();
            System.out.printf("%-10s %10s %10s %5f %5f %5f %5f %5d\n", type, name, state, lat, lon, ds, dk, elev);
        }
    }

    /**
     * interface method for MergeSort class.
     * @param wc waypoint comparator object to allow correct sorting arguments.
     */
    public void sortDB(WaypointComparator wc) {
        MergeSort ms = new MergeSort(wc);
        Waypoint[] wp = new Waypoint[waypoints.size()];
        for (int i = 0; i < wp.length; i++) {
            wp[i] = waypoints.get(i);
        }
        ms.sort(wp);
        for (int i = 0; i < wp.length; i++) {
            waypoints.add(i, wp[i]);
        }
    }

    /**
     * Entry point to the program
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        TrailDatabase app = new TrailDatabase();
        app.populateDatabase();
        Scanner in = new Scanner(System.in);
        System.out.println("*** Welcome to the Appalachian Trail Database ***");
        while (true) {
            System.out.println("+ Menu of search terms to use for sorting waypoints +");
            System.out.println("\tNA: by name");
            System.out.println("\tDS: by distance to Springer");
            System.out.println("\tDK: by distance to Katahdin");
            System.out.println("\tEL: by elevation");
            System.out.print("Enter your preferred sort by term or 'Q' to quit: ");
            String term = in.nextLine();
            if (term.equalsIgnoreCase("q")) {
                break;
            }
            int sortField = app.getSearchTerms(term.toUpperCase());
            if (sortField == -1) {
                System.out.println("Invalid input, try again.");
                System.out.println("\n");
            } else {
                System.out.print("Enter 'A' to sort in ascending order or 'D' to sort in descending order: ");
                term = in.nextLine().toUpperCase();
                if (term.equals("A") || term.equals("D")) {
                    boolean asc = term.equals("A");
                    WaypointComparator wc = new WaypointComparator(sortField, asc);
                    app.sortDB(wc);
                    app.printDatabase();
                    System.out.println("\n");
                } else {
                    System.out.println("Invalid input, try again.");
                    System.out.println();
                }
            }
        }

    }
}
