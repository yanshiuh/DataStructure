package Lab_Test_1;

public class FoodStore extends ShopLot implements Comparable<FoodStore> {
    protected Item[] menu;


    public FoodStore(String shopName, Person person, Person[] allEmployee, Item[] menu) {
        super(shopName, person, allEmployee);
        this.menu = menu;
    }

    @Override
    public int compareTo(FoodStore o) {
        if (this.allEmployee.length > o.allEmployee.length)
            return 1;
        else if (this.allEmployee.length < o.allEmployee.length)
            return -1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        FoodStore other = (FoodStore) o;
        return this.person.name.equals(other.person.name);
    }

    @Override
    public String toString() {
        String result = "ShopLot{shopName=" + super.shopName + ", \ncontact=" + super.person.toString() + " \nmenu=[";
        for (Item item: menu) {
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

