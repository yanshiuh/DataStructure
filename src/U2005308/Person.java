package U2005308;

public class Person {
    private String name;
    private String contactNumber; // can be null

    public Person(String name){
        this.name = name;
    }
    public Person(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }
}
