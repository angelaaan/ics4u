package Carnival;

import java.util.Random;

public class FoodTruck extends FoodCorner {
    Random rand = new Random();
    int forkCount = rand.nextInt(20);

    static String[] menuArr = {"burger n fries", "pizza", "banana", "pie", "cherries", "pretzel", "aspirin"};
    static int[] priceMenuArr = new int[7];

    public FoodTruck(){
        super(menuArr, priceMenuArr);

    }

    public void printMenu(){

        for (int i = 0 ; i<menu.length; i++){
            System.out.println(menu[i] + " " + priceMenu[i] + "\n");
        }

    }

    public void makePriceMenu(){
        Random rand = new Random();

        for (int i = 0 ;i <priceMenuArr.length; i++){
            priceMenuArr[i] = rand.nextInt(11)+1;
        }
    }


}
