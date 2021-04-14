package VivaQuestion;

public class Student {
    private String nameStudent;
    private int yearStudy;

    public Student(String nameStudent, int yearStudy) {
        this.nameStudent = nameStudent;
        this.yearStudy = yearStudy;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getYearStudy() {
        return yearStudy;
    }

    @Override
    public String toString() {
        return "Student : " + nameStudent + "  Year of Study : " + yearStudy;
    }
}
