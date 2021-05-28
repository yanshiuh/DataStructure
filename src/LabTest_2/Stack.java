package LabTest_2;

import java.util.ArrayList;

public class Stack {
    private String stack_name;
    ArrayList<Person> personList = new ArrayList<>();

    public Stack(String stack_name) {
        this.stack_name = stack_name;
    }

    public void push(String name, int age, String gender, String occupation, String illness) {
        Person newPerson = new Person(name, age, gender, occupation, illness);
        personList.add(newPerson);
    }

    public void push(Person newPerson) {
        personList.add(newPerson);
    }

    public Person pop() {
        return personList.remove(personList.size() - 1);
    }

    public Person peek() {
        return personList.get(personList.size() - 1);
    }

    public boolean isEmpty() {
        return personList.isEmpty();
    }

    public void displayStack() {
        if (personList.isEmpty()) {
            System.out.println("Empty stack");
        }

        System.out.println("----" + stack_name + "----");
        for (int i = personList.size() - 1; i >= 0; i--) {
            System.out.print(i + " " + personList.get(i).getName() + " " + personList.get(i).getAge()
                    + " " + personList.get(i).getGender() + " " + personList.get(i).getOccupation() + " " + personList.get(i).getRisk_category());
            System.out.println();
        }
    }

    public void removeDuplicates() {
        for (int i = 0; i < personList.size(); i++) {
            Person currentPerson = personList.get(i);
            for (int j = i + 1; j < personList.size(); j++) {
                if (currentPerson.compareTo(personList.get(j)) == 0)
                    personList.remove(personList.get(j));
            }
        }
    }
}
