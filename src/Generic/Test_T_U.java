package Generic;

public class Test_T_U<T,U> {
    // one for primitive type, one array
    private T t;
    private U[] u;

    public Test_T_U(T t, U[] u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U[] getU() {
        return u;
    }

    public void setU(U[] u) {
        this.u = u;
    }

    @Override
    public String toString() {
        String print;
        print = "T is" + t + "\n";
        for (U value:u) {
            print += value + " ";
        }
        return print;
    }
}
