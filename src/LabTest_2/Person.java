package LabTest_2;

import java.util.ArrayList;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int age_category;
    private String gender;
    private String occupation;
    private int illness_level = 0;
    private String illness;
    private String[] illness_list = {"heart","diabetes", "lung", "athma","hypertension"};
    private int risk_level;
    private String risk_category;

    public Person(String name, int age, String gender, String occupation, String illness) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.illness = illness;
    }

    public int getIllness_level() {
        String[] illnesses = illness.split(",");
        for (int i = 0; i < illnesses.length; i++) {
            for (int j = 0; j < illness_list.length; j++) {
                if (illnesses[i].equals(illness_list[j])) {
                    illness_level += 2;
                    break;
                }
            }
        }
        return illness_level;
    }

    public int getAge_category() {
        if (age <= 17) age_category = 2;
        else if (age >= 18 && age < 45) age_category = 3;
        else if (age >= 45 && age < 65) age_category = 4;
        else if (age >= 65 && age < 75) age_category = 5;
        else age_category = 6;

        return age_category;
    }

    public int getRisk_level() {
        return getIllness_level() + getAge_category();
    }

    public String getRisk_category() {
        if (getRisk_level() < 4) risk_category = "Low Risk";
        else if (getRisk_level() >= 4 && getRisk_level() < 7) risk_category = "Moderate Risk";
        else risk_category = "High Risk";

        return risk_category;
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

    public String getIllness() {
        return illness;
    }

    @Override
    public int compareTo(Person otherPeron) {
        if (this.name.equals(otherPeron.name))
            if (this.age == otherPeron.age)
                if (this.gender.equals(otherPeron.gender))
                    if (this.occupation.equals(otherPeron.occupation))
                        if (this.risk_category.equals(otherPeron.risk_category))
                            return 0;

        return -1;
    }
}
