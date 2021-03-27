package com.Lab_Tuto.Lab_from_snr.Lab_4.Q7_Q8;

public class Music {
    private String title, fileName;

    public Music(String title, String fileName) {
        this.title = title;
        this.fileName = fileName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Music : " + title;
    }
}
