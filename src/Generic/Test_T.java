package Generic;

public class Test_T<T> {
    private T t;

    public Test_T(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    @Override
    public String toString() {
        return t + "";
    }
}
