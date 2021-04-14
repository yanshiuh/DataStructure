package VivaQuestion;

public class CourseRegistrationSystem {
    MyArrayList<Student> confirmedList;
    MyArrayList<Student> waitingList;

    private int numberOfStudents;
    private String courseName;
    private String courseCode;

    public CourseRegistrationSystem(int numberOfStudents, String courseName, String courseCode) {
        this.numberOfStudents = numberOfStudents;
        this.courseName = courseName;
        this.courseCode = courseCode;
        confirmedList = new MyArrayList<>(numberOfStudents);
        waitingList = new MyArrayList<>();
    }

    public int getCourseYear() {
        return Integer.parseInt(courseCode.charAt(3) + "");
    }

    public void addStudent(Student student) {
        if (confirmedList.getSize() < numberOfStudents) {
            confirmedList.add(student);
        }
        else if (confirmedList.getSize() == numberOfStudents && student.getYearStudy() >= getCourseYear()) {
            for (int i = 0; i < confirmedList.getSize(); i++) {
                if (confirmedList.get(i).getYearStudy() < getCourseYear()) {
                    Student remove = confirmedList.get(i);
                    confirmedList.remove(i);
                    waitingList.add(0, remove);
                    confirmedList.add(student);
                } else {
                    for (int j = 0; j < waitingList.getSize(); j++) {
                        if (waitingList.get(i).getYearStudy() < getCourseYear()) {
                            waitingList.add(i, student);
                            break;
                        }
                    }
                }
            }
        } else if (confirmedList.getSize() == numberOfStudents && student.getYearStudy() < getCourseYear()) {
            waitingList.add(student);
        }
        System.out.println(student.toString() + " register to the course");
    }

    @Override
    public String toString() {
        String res = "Course: " + courseName + "\nCourse Code: " + courseCode + "\n";
        res += "\nWaiting List:\n";
        for (int i = 0; i < waitingList.getSize(); i++) {
            res += waitingList.get(i).toString() + " ,\n";
        }

        res += "\nConfirmed List:\n";
        for (int i = 0; i < confirmedList.getSize(); i++) {
            res += confirmedList.get(i).toString() + " ,\n";
        }
        return res;
    }
}
