package Assesment.Airline;

public class Time implements Comparable<Time>{
    private int hour, min;

    public Time(int hr, int min){
        this.hour = hr;
        this.min = min;
    }

    public int minutesUntil(Time other){
        return (other.hour * 60 + other.min) -  (this.hour * 60 + this.min);
    }

    @Override
    public int compareTo(Time other) {
        int diff = this.hour - other.hour;
        if(diff == 0){
            diff = this.min - other.min;
        }
        return diff;
    }
}
