package U2005308_LabTest2;

import java.util.ArrayList;

public class Stack {
    private String stackName;
    ArrayList<Person> personArrayList = new ArrayList<>();

    public Stack(String stackName) {
        this.stackName = stackName;
    }

    public void push(String name, int age) {
        Person newPerson = new Person(name, age);
        personArrayList.add(newPerson);
    }

    public void push(String name, int age, String gender) {
        Person newPerson = new Person(name, age, gender);
        personArrayList.add(newPerson);
    }

    public void push(String name, int age, String gender, String occupation) {
        Person newPerson = new Person(name, age, gender, occupation);
        personArrayList.add(newPerson);
    }

    public void push(Person newPerson) {
        personArrayList.add(newPerson);
    }

    public Person pop() {
        return personArrayList.remove(personArrayList.size() - 1);
    }

    public Person peek() {
        return personArrayList.get(personArrayList.size() - 1);
    }

    public boolean isEmpty() {
        return personArrayList.isEmpty();
    }

    public void displayStack() {
        if (personArrayList.isEmpty()) {
            System.out.println("Empty stack");
        }
        System.out.println("-----" +  stackName + "-----");
        for (int i = personArrayList.size() - 1; i >= 0; i--) {
            System.out.print(i + " " + personArrayList.get(i).getName() + " " + personArrayList.get(i).getAge()
            + " " + personArrayList.get(i).getGender() + " ");
            if (personArrayList.get(i).setFrontLiner(personArrayList.get(i).getOccupation()))
                System.out.print("Frontliner");
            else
                System.out.print("Not frontliner");
            System.out.println();
        }
    }
}
