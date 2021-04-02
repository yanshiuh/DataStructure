package Lab_Test_1;

public class Person {
    protected String name;
    protected String contact; // can be null for employee's contact

    public Person(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Person{name=" + name + ", contactNo=" + contact + "}";
    }
}
