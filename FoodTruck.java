package Carnival;

import java.util.Random;

public class FoodTruck extends FoodCorner {
    Random rand = new Random();

    static String[] menuArr = {"burger n fries", "pizza", "banana", "pie", "cherries", "pretzel", "aspirin"};

    public FoodTruck(){
        super(menuArr);
        priceMenu = makeMenu();
    }

    public int[] makeMenu(){
        int[] arr = new int[7];

        Random rand = new Random();

        for (int i = 0 ;i <arr.length; i++){
            arr[i] = rand.nextInt(14)+5;
        }

        return arr;
    }

    public void printMenu(){
        System.out.println("•━━ FOOD TRUCK ━━•\n");
        for (int i = 0 ; i<menu.length; i++){
            System.out.println(menuArr[i] + " $" + priceMenu[i] + "\n");
        }

    }

    //getting foodies
    public String 

}

