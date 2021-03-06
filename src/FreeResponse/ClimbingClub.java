package FreeResponse;

import java.util.List;

public class ClimbingClub {

    /** The list of climbs completed by members of the club.
     * Guaranteed not to be null. Contains only non-null references.
     */
    private List<ClimbInfo> climbList;

    /** Adds a new climb with a name peakName and time climbTime to the list of climbs.
     * @param peakName the name of the mountain peak climbed.
     * @param climbTime the number of minutes taken to complete the climb.
     */
    public void addClimb(String peakName, int climbTime) {
        ClimbInfo ci = new ClimbInfo(peakName,climbTime);
        climbList.add(ci);
    }

    /**
     * Second way to add a climb. adds alphabetically.
     * @param peakName the name of the peak climbed.
     * @param climbTime the time it takes to climb the peak.
     */
    public void addClimbB(String peakName, int climbTime) {
        int i = 0;
        while (i < climbList.size() && peakName.compareTo(climbList.get(i).getName()) > 0) {
            i++;
        }
        climbList.add(i, new ClimbInfo(peakName, climbTime));
    }

    /**
     * gives the number of distinct peak names.
     * @return the number of distinct names in the list of climbs.
     */
    public int distinctPeakNames() {
        if (climbList.size() == 0){
            return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName;
        int numNames = 1;

        for (int k = 1; k < climbList.size(); k++){
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0){
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }
    /*
    True-False answers:
    1. False
    2. False
     */
}