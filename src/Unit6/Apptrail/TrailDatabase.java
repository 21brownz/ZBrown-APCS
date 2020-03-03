package Unit6.Apptrail;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TrailDatabase {

    private ArrayList<Waypoint> waypoints;
    private ArrayList<String> terms;

    public TrailDatabase(){
        terms = new ArrayList<>();
        terms.add("NA");
        terms.add("DS");
        terms.add("DK");
        terms.add("EL");
        terms.add("q");
        waypoints = new ArrayList<>();
    }

    public int[] getSearchTerms(){
        int searchterm;
        int order = 0;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("*** Welcome to the Appalachian Trail Database ***");
            System.out.println("+ Menu of search terms to use for sorting waypoints +");
            System.out.println("\tNA - by name");
            System.out.println("\tDS - by distance to Springer");
            System.out.println("\tDK - by distance to Katahdin");
            System.out.println("\tEL - by elevation");
            System.out.println("Enter your preferred search term or pres 'Q' to quit: ");
            searchterm = terms.indexOf(sc.nextLine().toUpperCase());
            System.out.println("Enter 'A' to sort in ascending order or 'D' to sort in descending order: ");
            if(sc.nextLine().equals("D")) order = 1;
            return new int[]{searchterm, order};
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    } //used in main for input

    public void populateDatabase(){
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
            while(scan.hasNextLine()){
                String loc = scan.nextLine();
                String[] split = loc.split("\t");
                waypoints.add(new Waypoint(split[0], split[1], split[2], Double.parseDouble(split[3]), Double.parseDouble(split[4]), Double.parseDouble(split[5]), Double.parseDouble(split[6]), Integer.parseInt(split[7])));
            }
        scan.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void printDatabase(){
        for (Waypoint waypoint : waypoints) {
            System.out.println(waypoint);
        }
    }
    public void sortDB(WaypointComparator wc){

    }

    public static void main(String[] args){
        TrailDatabase db = new TrailDatabase();
        db.populateDatabase();

    }
}
