package com.emisdep;

public class Utility {

//    public int hours;
//    public int mins;
//    public int hoursPassed;
//    public int minutesPassed;

    public void convertHours(int hours, int mins, int hoursPassed) {
        int time = (hours + hoursPassed) % 24;
        System.out.println(time);
    }

    public void convertHours2(int hours, int minutes, int hoursPassed) {
        int time = (hours + hoursPassed) % 24;
        if (time < 0) {
            time = 24 + time;
        }
        System.out.println(time);
    }

    public void convertMinutes(int hours, int minutes, int minutesPassed) {
        int time = (hours + minutes + minutesPassed / 60);
        int timeMinutes = (minutesPassed % 60);
        System.out.println(time + ":" + timeMinutes);
    }

    public void convertHours3(int hours, int minutes, int hoursPassed, boolean standard){

    }


}
