package U2005308;

public class ShopLot implements Comparable<ShopLot>{
    protected String shopName;
    protected Person contactPerson;
    protected Person[] employees;

    @Override
    public int compareTo(ShopLot other) {
        return employees.length - other.employees.length;
    }

    @Override
    public boolean equals(Object obj) {
        ShopLot other = (ShopLot) obj;
        return contactPerson.equals(other.contactPerson);
    }
}
