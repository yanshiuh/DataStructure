package U2005308;

public class Item <A, B extends Comparable<B>> implements Comparable<Item>{
    private A name;
    private B price;

    public Item(A name, B price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Item other) {
        return price.compareTo((B) other.price);
    }
    public B getPrice(){
        return price;
    }
}
