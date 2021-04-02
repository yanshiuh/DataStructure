package Lab_Test_1;

// I for item, P for price
public class Item<I, P extends Comparable<P>> {
    I item;
    P price;

    public Item(I item, P price) {
        this.item = item;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{item=" + item + ", price=" + price + "}";
    }
}
