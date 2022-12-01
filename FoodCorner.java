import java.util.*;

public abstract class FoodCorner {

    int balance;

    String[][] menu = new String[7][2];
    int [] priceMenu = new int[7];

    public FoodCorner (String[][] newMenu) {
        menu = newMenu;
    }

    public int getBalance(){
        return balance;
    }

    //public abstract void printMenu();

    public void printMenu(){
        for (int i = 0 ; i<6; i++){
            System.out.print("[" + (i+1) +"] --" + menu[0][i] + " $" + priceMenu[i] + "\n");
        }
    }

    public abstract int[] makeMenu();

    public String run(){

        System.out.println("Greetings! Welcome To The FoodCorner!"
        + "\nSomeone will be with you very shortly :)"
        + "\nPlease settle in and take a look at our menu..."
        + "\nOur prices change with every visit so you are in for a treat :3");

        printMenu();
        return null;
    }
    
    public String userDecision(){

        Scanner in = new Scanner (System.in);

        int choice = in.nextInt();

        if (choice == 7){
            System.out.println("See you soon <3 goodbye now");
            return "";
        } else {
            System.out.println(menu[1][(choice-1)]);
            return menu[0][(choice-1)];
        }

    }
}
