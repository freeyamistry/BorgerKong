package com.example.borgerkong;

import java.util.ArrayList;

public class Order {

    int orderID;
    String itemName;
    double price;



    int quantity;
    int image;

    public static ArrayList<Order> myOrder = new ArrayList<Order>();


    public Order(String itemName, double price, int quantity, int image) {
        this.orderID = orderID;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public static ArrayList<Order> getMyOrder() {
        return myOrder;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


}
