package Carnival;

import java.util.Random;

public abstract class FoodCorner {

    String[] menu = new String[7];
    int [] priceMenu = new int[7];

    public FoodCorner (String[] newMenu) {
        menu = newMenu;
    }

    public abstract void printMenu();

    public abstract int[] makeMenu();
    
}
