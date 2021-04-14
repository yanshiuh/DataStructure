package VivaQuestion;

public class Registration {

    public static void main(String[] args) {
        MyArrayList<Student> list = new MyArrayList<>();
        list.add(new Student("Ali", 2));
        list.add(new Student("Brandon", 3));
        list.add(new Student("Charles", 3));
        list.add(new Student("Ben", 3));
        list.add(new Student("Frick", 1));

        CourseRegistrationSystem course1 = new CourseRegistrationSystem(3,"Data Structure", "WIX3003");
        for (int i = 0 ; i < list.getSize(); i++) {
            course1.addStudent(list.get(i));
        }
        System.out.println();

        System.out.println(course1.toString());
    }
}
