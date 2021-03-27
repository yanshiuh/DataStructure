package com.Lab_Tuto.Lab_from_snr.Lab_4.Q3;

public class Course {
    private String courseCode, courseName, grade;
    private int creditHours;
    private int credit, point;

    public Course(String courseCode, String courseName, String grade, int creditHours) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.grade = grade;
        this.creditHours = creditHours;
    }

    public int getPoint() {
        if (grade.equals("A"))
            point += 4 * creditHours;
        else if (grade.equals("B"))
            point += 3 * creditHours;
        else if (grade.equals("C"))
            point += 2 * creditHours;
        else if (grade.equals("D"))
            point += creditHours;
        else if (grade.equals("F"))
            point += 0;
        return point;
    }

    public int getCreditHours() {
        return creditHours;
    }

    @Override
    public String toString() {
        return "Course : " + courseCode + " (" + courseName + ") - " + creditHours + " credit hours. Grade : " +
                grade;
    }
}
