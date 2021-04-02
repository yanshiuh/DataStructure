package Lab_Test_1;

public class ShopLot<S extends Comparable<S>>  {
    protected String shopName;
    protected Person person;
    protected Person[] allEmployee;

    public ShopLot(String shopName, Person person, Person[] allEmployee) {
        this.shopName = shopName;
        this.person = person;
        this.allEmployee = allEmployee;
    }

    public int compareTo(ShopLot<S> o) {
        if (this.allEmployee.length > o.allEmployee.length)
            return 1;
        else if (this.allEmployee.length < o.allEmployee.length)
            return -1;
        else
            return 0;
    }

    public boolean equals(Object o) {
        ShopLot other = (ShopLot) o;
        return this.person.name.equals(other.person.name);
    }
}

