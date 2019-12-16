package FreeResponse;

public class ClimbInfo {
    String pName;
    int cTime;
    /** Creates a ClimbInfo object with the name peakName and time climbTime.
     *  @param peakName the name of the mountain peak
     *  @param climbTime the number of minutes taken to complete the climb.
     */
    public ClimbInfo(String peakName, int climbTime){
        pName = peakName;
        cTime = climbTime;
    }

    public String getName(){
        return pName;
    }

    public int getTime(){
        return cTime;
    }

    public String toString(){
        return(getName() + " , " + getTime());
    }
}
