import java.util.Random;

public abstract class FoodCorner {

    int balance;

    String[] menu = new String[7];
    int [] priceMenu = new int[7];

    public FoodCorner (String[] newMenu) {
        menu = newMenu;
    }

    public int getBalance(){
        return balance;
    }

    //public abstract void printMenu();

    public void printMenu(){
        for (int i = 0 ; i<menu.length; i++){
            System.out.print("[" + (i+1) +"] --" + menu[i] + " $" + priceMenu[i] + "\n");
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
    
}
