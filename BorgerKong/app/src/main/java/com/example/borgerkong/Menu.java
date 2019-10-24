package com.example.borgerkong;

public class Menu {

    int menuID;
    String menuHeading;
    String menuDescription;
    double menuCost;
    int menuImage;

    public Menu(int menuID, String menuHeading, String menuDescription, double menuCost, int menuImage) {
        this.menuID = menuID;
        this.menuHeading = menuHeading;
        this.menuDescription = menuDescription;
        this.menuCost = menuCost;
        this.menuImage = menuImage;
    }

    public int getMenuID() {
        return menuID;
    }

    public String getMenuHeading() {
        return menuHeading;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public double getMenuCost() {
        return menuCost;
    }

    public int getMenuImage() {
        return menuImage;
    }

}
