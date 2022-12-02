import java.util.Scanner;

public class testr {
    public static void main(String[] args) {
       // FoodTruck f1 = new FoodTruck() ;
        //f1.printMenu();
        Scanner in = new Scanner(System.in);
        FoodCorner f = new DrinksBar(50);
        f.run();
        
    }
}
