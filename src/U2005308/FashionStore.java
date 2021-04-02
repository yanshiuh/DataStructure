package U2005308;

public class FashionStore extends ShopLot{
    private Item<String, Integer>[] clothes;

    public FashionStore( String shopName, Person contactPerson, Item<String, Integer>[] clothes, Person[] employees){
        this.shopName = shopName;
        this.contactPerson = contactPerson;
        this.clothes = clothes;
        this.employees = employees;
    }
}
