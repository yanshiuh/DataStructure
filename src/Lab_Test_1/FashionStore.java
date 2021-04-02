package Lab_Test_1;

public class FashionStore extends ShopLot implements Comparable<FashionStore> {
    protected Item[] clothes;

    public FashionStore(String shopName, Person person, Person[] allEmployee, Item[] clothes) {
        super(shopName, person, allEmployee);
        this.clothes = clothes;
    }

    @Override
    public int compareTo(FashionStore o) {
        if (this.allEmployee.length > o.allEmployee.length)
            return 1;
        else if (this.allEmployee.length < o.allEmployee.length)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        FashionStore other = (FashionStore) o;
        return this.person.name.equals(other.person.name);
    }

    @Override
    public String toString() {
        String result = "ShopLot{shopName=" + super.shopName + ", \ncontact=" + super.person.toString() + " \nclothes=[";
        for (Item item: clothes) {
            result += item.toString();
        }
        result += "], \nemployees=[";
        for (int i = 0; i < allEmployee.length; i++) {
            if (i == allEmployee.length - 1)
                result += allEmployee[i];
            else
                result += allEmployee[i] + ", ";
        }
        result += "]}\n";
        return result;
    }
}

