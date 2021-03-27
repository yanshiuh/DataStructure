package Generic;

public class Main_ArrayLog {

    public static void main(String[] args) {
        ArrayLog<Integer> integerArrayLog = new ArrayLog<>(10);
        for (int i = 0; i < integerArrayLog.getSize(); i++) {
            
        }
//        integerArrayLog.clear();

        System.out.println("Log size: " + integerArrayLog.getSize());
        System.out.println("Element in log: " + integerArrayLog.toString());

        if (integerArrayLog.search(7))
            System.out.println("Log contains 7");
        else
            System.out.println("There is no 7 in log");


    }
}
