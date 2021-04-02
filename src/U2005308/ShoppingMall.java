package U2005308;

import java.util.ArrayList;

public class ShoppingMall {

    public static void main(String[] args) {
        Person contactPerson = null;
        Item<String, Integer>[] items = null;
        Person[] employees = null;

        // foodStores
        ArrayList<ShopLot> foodStores = new ArrayList<>();

        //  McDonalds shops
        contactPerson = new Person( "Mike", "0101122334");
        items         = new Item[] { new Item("Burger", 10), new Item("Fried Chicken", 12)};
        employees     = new Person[] { new Person("Jack") , new Person("Jane")};
        foodStores.add( new FoodStore("McDonalds" ,contactPerson, items, employees) );

        //  Sushi Mentai shops
        contactPerson = new Person( "Max", "0112233445");
        items         = new Item[] { new Item("Chicken Katsu Don", 15), new Item("Ramen", 12)};
        employees     = new Person[] { new Person("Adam") , new Person("Alex"), new Person("Andrew")};
        foodStores.add( new FoodStore("Sushi Mentai", contactPerson, items, employees) );

        // Waroeng Penyet
        contactPerson = new Person( "Mike", "0101122334");
        items         = new Item[] { new Item("Ayam Penyet", 10) };
        employees     = new Person[] { new Person("Lex") , new Person("Leon")};
        foodStores.add( new FoodStore("Waroeng Penyet", contactPerson, items, employees) );

        // fashionStores
        ArrayList<ShopLot> fashionStores = new ArrayList<>();

        // Uniqlo
        contactPerson    = new Person( "Nate", "0199988776S");
        items            = new Item[] { new Item("Shirt", 80), new Item("T-shirt", 60) };
        employees        = new Person[] { new Person("Kate") , new Person("Ken"), new Person("Kurt") };
        fashionStores.add(new FashionStore( "Uniqlo", contactPerson, items, employees));

        // Padini
        contactPerson    = new Person( "Nick", "0195544332");
        items            = new Item[] { new Item("Blouse", 100), new Item("Skirt", 80) };
        employees        = new Person[] { new Person("Frank") , new Person("Felix") };
        fashionStores.add( new FashionStore("Padini",contactPerson, items, employees) );

        // Mango
        contactPerson    = new Person( "Nicole", "0194433221");
        items            = new Item[] { new Item("Dress", 120) };
        employees        = new Person[] { new Person("Ron") , new Person("John") };
        fashionStores.add( new FashionStore("Mango",contactPerson, items, employees) );

        System.out.println( maxNumberOfEmployees(foodStores).shopName );
        System.out.println( maxNumberOfEmployees(fashionStores).shopName );
    }
    public static ShopLot maxNumberOfEmployees(ArrayList<? extends ShopLot> shops){
        ShopLot max = shops.get(0);

        for (int i = 1; i < shops.size(); i++)
            if (shops.get(i).compareTo(max) > 0)
                max = shops.get(i);

        return max;
    }



}
