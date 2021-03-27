package com.Lab_Tuto.Lab_from_snr.Lab_1;

public class Time {
    private int hour, minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public boolean checkTimeFormat() {
        return (hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59);
    }

    public String displayTime() {
        if (!checkTimeFormat())
            return "Invalid Time Input";
        else if (hour >= 12)
            return hour + ":" + minute + " PM";
        else
            return hour + ":" + minute + " AM";
    }

    @Override
    public String toString() {
        return "Hour: " + hour + " Minute: " + minute + "  " + displayTime();
    }
}
