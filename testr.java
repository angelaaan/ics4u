import java.util.Scanner;

public class testr {
    public static void main(String[] args) {
       // FoodTruck f1 = new FoodTruck() ;
        //f1.printMenu();
        Scanner in = new Scanner(System.in);
        FoodCorner f;

        System.out.println("Hiii nini <3\nwhat would u like to have a food or a drink? btw i gave u 40 dollars this time hehe");
        int pick = 0;
        int money = 50;
        while(pick == 0){
            System.out.println("PICK 1 IF U WANT FOOD PICK 2 IF U WANT DRINK");
            pick = in.nextInt();

            if(pick == 1){
                f = new FoodTruck(money);
            } else {
                f = new DrinksBar(money);
            }
            f.run();

            System.out.println("do u wanna get more foodies? (1 = yes / 2=no)");
            pick = in.nextInt();
            if (pick == 2){
                System.out.println("baiii");
            } else {
                System.out.println("loading////...\n\n\n\n");
                pick =0;
            }

        }
        


        // FoodCorner f2 = new DrinksBar(money);
        // f2.run();
        // f2.getBalance();
        
    }
}
