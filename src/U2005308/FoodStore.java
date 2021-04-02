package U2005308;

public class FoodStore extends ShopLot{
    private Item<String, Integer>[] menu;

    public FoodStore(String shopName, Person contactPerson, Item<String, Integer>[] menu, Person[] employees){
        this.shopName = shopName;
        this.contactPerson = contactPerson;
        this.menu = menu;
        this.employees = employees;
    }
}