package Assesment.Airline;

/**
 * A class for an object defining a certain time. built off of code from Test 5 of Cochran APCS
 * @author 21brownz
 * @since 3/26/20
 */
public class Time implements Comparable<Time>{
    private int hour, min;

    /**
     * class constructor
     * @param hr time in hours
     * @param min time in minutes
     */
    public Time(int hr, int min){
        this.hour = hr;
        this.min = min;
    }

    /**
     * calculates minutes until a different time Object
     * @param other the time object to comare to
     * @return minutes until other
     */
    public int minutesUntil(Time other){
        return (other.hour * 60 + other.min) -  (this.hour * 60 + this.min);
    }

    /**
     * compares two time Objects
     * @param other object to compare this object
     * @return int that follows Compare convention
     */
    @Override
    public int compareTo(Time other) {
        int diff = this.hour - other.hour;
        if(diff == 0){
            diff = this.min - other.min;
        }
        return diff;
    }
}
