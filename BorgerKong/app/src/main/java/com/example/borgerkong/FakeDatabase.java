package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    public static Menu getMenuItemById(int menuID) {
        return menuItems.get(menuID);
    }
    public static Order getOrderItemById(int orderID) {
        return myOrder.get(orderID);
    }

    public static ArrayList<Menu> getAllMenuItems() {
        return new ArrayList<Menu>((List) Arrays.asList(menuItems.values().toArray()));
    }


    private static final HashMap<Integer, Menu> menuItems = new HashMap<>();

    static {
        menuItems.put(1, new Menu(1,"Beef Bopper",
                "The Beef Bopper is 100% hormone-free Aussie beef, flame-grilled that gives you the irresistible smoky, BBQ flavour. Loaded with fresh lettuce, tomatoes, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun.",
                5.99, R.drawable.beef_bopper));

        menuItems.put(2, new Menu(2,"Chicken Bopper",
                "Aussie crispy chicken breast and premium eye bacon, topped with creamy Caesar sauce, parmesan cheese, tomato and lettuce on a toasted sesame seed bun.",
                5.49, R.drawable.chicken_bopper));
        menuItems.put(3, new Menu(3,"Fries",
                "Our thick cut chips are deliciously seasoned, delivering a crispier crunch on the outside, fluffy and hot on the inside. Available in Small, Medium or Large.",
                2.99, R.drawable.fries));
        menuItems.put(4, new Menu(4,"Onion Rings",
                "A BurgerKong favourite, you'll be crying over if you miss them! Freshly battered, crispy onion rings available in Medium or Large.",
                2.99, R.drawable.ringoes));
        menuItems.put(5, new Menu(5,"Chicken Wrap",
                "Flame grilled Aussie chicken breast and double bacon, topped with a creamy sauce, parmesan cheese, tomato and lettuce wrapped on a light and soft tortilla.",
                4.99, R.drawable.chicken_wrap));
        menuItems.put(6, new Menu(6,"Hot Dog",
                "BorgorKing's famous 100% all beef hot dog. Contains chopped onions, pickles and yellow mustard.",
                3.99, R.drawable.hotdog));
        menuItems.put(7, new Menu(7,"Choc-Chip Cookies",
                "Delicious choc-chip cookies that are crispy on the outside and chewy in the middle. Go on and try them you wont regret it!",
                0.99, R.drawable.cookies));
        menuItems.put(8, new Menu(8,"Pita Pocket",
                "Grilled peri-peri chicken, lettuce, tomato & light mayo in a toasted pita",
                3.99, R.drawable.pita_pocket));
        menuItems.put(9, new Menu(9,"Salad",
                "Prepared fresh daily, enjoy the fresh taste of a warm chicken salad or the succulent zesty flavours of our greek salad. The choice is up to you. ",
                3.99, R.drawable.salads));
        menuItems.put(10, new Menu(10,"Fruit Salad",
                "Freshly cut seasonal fruits nad berries served in a cup. This dessert is light and refreshing, especially after our heavy dinner menu.",
                1.49, R.drawable.fruit_salad));
        menuItems.put(11, new Menu(11,"Waffles",
                "Feast on Belgian waffles topped with fresh fruit and vanilla ice cream, and drizzled with pure melted chocolate.",
                8.99, R.drawable.waffles));
        menuItems.put(12, new Menu(12,"Strawberry Cheesecake",
                "A creamy cheesecake with a graham cracker crust topped with glazed fresh strawberries.",
                4.49, R.drawable.strawberry_cheescake));
        menuItems.put(13, new Menu(13,"Sticky Chicken Wings",
                "These wings have the perfect crunch and are glazed with a finger-licking delicious sticky spicy sauce. Ranch dip included.",
                3.99, R.drawable.sticky_wings));
        menuItems.put(14, new Menu(14,"Milkshakes",
                "Made with creamy, fresh milk ingredients, it's so thick it barely makes it up the straw. Available in 3 flavours; Chocolate, Strawberry and Vanilla.",
                1.99, R.drawable.shakes));
        menuItems.put(15, new Menu(15,"Smoothies",
                "The perfect blend of fresh fruit and creamy vanilla icecream, our smoothie selection is a perfect summertime desert. Available in 3 flavours; Peach and mango, Berry Boost and Strawberry delight",
                1.99, R.drawable.smoothies));

    }

    public static ArrayList<Order> getAllOrderItems() {
        return new ArrayList<Order>((List) Arrays.asList(myOrder.toArray()));
    }

    private static final ArrayList<Order> myOrder = new ArrayList<>();


}
