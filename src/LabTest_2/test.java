package LabTest_2;

public class test {

    public static void main(String[] args) {
        Stack raw = new Stack("Raw list");
        raw.push("lisa",29,"f","nurse","healthy");
        raw.push("jane",47,"f","clerk","thyroid");
        raw.push("raju",55,"m","police","lung,diabetes,heart");
        raw.push("maria",20,"f","accountant","broken arm");
        raw.push("chong",70,"m","lawyer","diabetes");
        raw.push("raju",55,"m","police","lung,diabetes,heart");
        raw.push("jane",47,"f","doctor","healthy");
        raw.push("fred",47,"m","producer","lung,athma,hypertension");
        raw.push("bob",65,"m","pensioner","heart,liver");
        raw.push("jane",47,"f","doctor","healthy");
        raw.push("raju",55,"m","police","lung,diabetes,heart");
        raw.displayStack();

        System.out.println("After removing duplicates person: ");
        raw.removeDuplicates();
        raw.displayStack();
    }
}
