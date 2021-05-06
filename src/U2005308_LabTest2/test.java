package U2005308_LabTest2;

public class test {

    public static void main(String[] args) {
        // Part A
        Stack raw = new Stack("Raw list");
        raw.push("ali",32,"m","doctor");
        raw.push("lisa",29,"f","nurse");
        raw.push("tanaka",41);
        raw.push("ahmad",18,"m","developer");
        raw.push("maria",20,"f","accountant");
        raw.push("chong",70,"m","lawyer");
        raw.push("raju",55,"m","police");
        raw.push("alex",16,"f","business man ");
        Person katie = new Person("katie",36,"f","teacher");
        raw.push(katie);
        raw.displayStack();

        // Part B
        Stack frontLiners = new Stack("Frontliners");
        Stack others = new Stack("Others");
        while (!raw.isEmpty()) {
            if (raw.peek().isFrontLiner())
                frontLiners.push(raw.pop());
            else
                others.push(raw.pop());
        }
        raw.displayStack();
        frontLiners.displayStack();
        others.displayStack();

        // Part C
        Stack priority = new Stack("Vaccine Priority List");

        // Arrange the not frontliners / others and push them first
        // as they are less priority than frontliners
        while(!others.isEmpty()) {
            Person tempPerson = others.pop();

            while(!priority.isEmpty() && priority.peek().getAge() > tempPerson.getAge()) {
                others.push(priority.pop());
            }

            priority.push(tempPerson);
        }

        // frontliners will at the top of the stack
        // as frontliners have the higher priority for vaccinated
        Stack tempStack = new Stack("Temporary Stack");
        while(!frontLiners.isEmpty()) {
            Person tempPerson = frontLiners.pop();

            while(!tempStack.isEmpty() && tempStack.peek().getAge() < tempPerson.getAge()) {
                frontLiners.push(tempStack.pop());
            }

            tempStack.push(tempPerson);
        }
        while(!tempStack.isEmpty()) {
            priority.push(tempStack.pop());
        }
        priority.displayStack();
    }
}
