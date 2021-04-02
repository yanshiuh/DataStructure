package Lab_Test_1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingMall {

    public static void main(String[] args) {
        String shopName = "";
        Person person = null;
        Person[] employees = null;
        Item<String, Integer>[] items = null;

        // Food Store
        List<FoodStore> foodStores = new ArrayList<>();

        // mcd
        shopName      = "McDonalds";
        person        = new Person("Mike", "0101122334");
        employees     = new Person[]{new Person("Jack", null), new Person("Jane", null)};
        items         = new Item[]{new Item<>("Burger", 10), new Item<>("Fried Chicken", 12)};
        FoodStore mcd = new FoodStore(shopName, person, employees, items);
        foodStores.add(mcd);

        // Sushi Mentai
        shopName              = "Sushi Mentai";
        person                = new Person("Max", "0112233445");
        employees             = new Person[]{new Person("Adam", null), new Person("Alex", null), new Person("Andrew", null)};
        items                 = new Item[]{new Item<>("Chicken Katsu Don", 15), new Item<>("Ramen", 12)};
        FoodStore sushiMentai = new FoodStore(shopName, person, employees, items);
        foodStores.add(sushiMentai);

        // Waroeng Penyet
        shopName                = "Waroeng Penyet";
        person                  = new Person("Mike", "0101122334");
        employees               = new Person[]{new Person("Lex", null), new Person("Leon", null)};
        items                   = new Item[]{new Item<>("Ayam Penyet", 10)};
        FoodStore waroengPenyet = new FoodStore(shopName, person, employees, items);
        foodStores.add(waroengPenyet);


        // Fashion Store
        List<FashionStore> fashionStores = new ArrayList<>();

        // Uniqlo
        shopName            = "Uniqlo";
        person              = new Person("Nate", "0199988776S");
        employees           = new Person[]{new Person("Kate", null), new Person("Ken", null), new Person("Kurt", null)};
        items               = new Item[]{new Item<>("Shirt", 80), new Item<>("T-shirt", 60)};
        FashionStore uniqlo = new FashionStore(shopName, person, employees, items);
        fashionStores.add(uniqlo);

        // Padini
        shopName            = "Padini";
        person              = new Person("Nick", "0195544332");
        employees           = new Person[]{new Person("Frank", null), new Person("Felix", null)};
        items               = new Item[]{new Item<>("Blouse", 100), new Item<>("Skirt", 80)};
        FashionStore padini = new FashionStore(shopName, person, employees, items);
        fashionStores.add(padini);

        // Mango
        shopName           = "Mango";
        person             = new Person("Nicole", "0194433221");
        employees          = new Person[]{new Person("Ron", null), new Person("John", null)};
        items              = new Item[]{new Item<>("Dress", 120)};
        FashionStore mango = new FashionStore(shopName, person, employees, items);
        fashionStores.add(mango);

        //  Print the details for Sushi Mentai and Mango.
        System.out.println(foodStores.get(1));
        System.out.println(fashionStores.get(2));

        //  Print the shop name that have the highest number of employees for each “foodStore”
        //  and “fashionStore”
        System.out.println("Food store with highest number of employees: " + highestNumberEmployees(foodStores));
        System.out.println("Fashion store with highest number of employees: " + highestNumberEmployees(fashionStores));

        //  Print if any of the food store is having the same or different contact person
        if (mcd.equals(sushiMentai))
            System.out.println("\nThe contact person for McDonalds and Sushi Mentai is same");
        else
            System.out.println("\nThe contact person for McDonalds and Sushi Mentai is different");

        if (mcd.equals(waroengPenyet))
            System.out.println("The contact person for McDonalds and Waroeng Penyet is the same");
        else
            System.out.println("The contact person for McDonalds and Waroeng Penyet is the different");

        if (sushiMentai.equals(waroengPenyet))
            System.out.println("The contact person for Sushi Mentai and Waroeng Penyet is same");
        else
            System.out.println("The contact person for Sushi Mentai and Waroeng Penyet is different");

        //  Print which food store is having more employees, between Sushi Mentai and Waroeng
        //  Penyet.
        if (sushiMentai.compareTo(waroengPenyet) > 0)
            System.out.println("\nSushi Mentai have more employees than Waroeng Penyet");
        else
            System.out.println("\nWaroeng Penyet have more employees than Sushi Mentai");

        //  Print the most expensive item for McDonalds and Padini.
        System.out.println("\nThe most expensive item in McDonalds is " + expensiveItem(mcd.menu));
        System.out.println("The most expensive item in Padini is " + expensiveItem(padini.clothes));
    }

    public static <T extends Comparable<T>> String highestNumberEmployees(List<? extends ShopLot> list) {
        ShopLot max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0)
                max = list.get(i);
        }
        return max.shopName;
    }

    public static <I, P extends Comparable<P>> I expensiveItem(Item<I, P>[] items) {
        Item<I, P> expensive = items[0];

        for (int i = 1; i < items.length; i++) {
            if (items[i].price.compareTo(expensive.price) > 0)
                expensive = items[i];
        }

        return expensive.item;
    }
}
