package U2005308_LabTest2;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String[] occupation_list = {"doctor", "nurse", "teacher", "police"};
    private boolean frontLiner;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        frontLiner = setFrontLiner(occupation);
    }

    public boolean setFrontLiner(String occupation) {
        if (occupation == null) return false;
        for (int i = 0; i < occupation_list.length; i++) {
            if (occupation.equals(occupation_list[i]))
                return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public boolean isFrontLiner() {
        return frontLiner;
    }
}
