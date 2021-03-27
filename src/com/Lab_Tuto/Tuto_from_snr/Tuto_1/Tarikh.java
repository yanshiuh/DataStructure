package com.Lab_Tuto.Tuto_from_snr.Tuto_1;

public class Tarikh {
    private String day, month, year;

    public Tarikh(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Day: " + day +
                "\nMonth: " + month +
                "\nYear: " + year +
                "\nDate is " + day + "/" + month + "/" + year;
    }
}
