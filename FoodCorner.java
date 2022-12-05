/* Name : Angela Nguyen
 * Class : ICS4U
 * Parent Class of the Food Corner of the
 */
import java.util.*;

public abstract class FoodCorner {

    // instance variables
    int balance;
    String name = "";
    String image = "";

    // declare the menu arrays
    // declare the 2D menu arrays that holds the name of the food and the image
    String[][] menu = new String[7][2];
    // declare the priceMenu that will have randomized prices
    int[] priceMenu = new int[7];

    // parent class constructor
    public FoodCorner(String[][] newMenu) {
        menu = newMenu;
    }

    // modifiers for user balance
    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    // accessors for user balance
    public int getBalance() {
        return balance;
    }

    // accessor to get name of the food they bought
    public String getPurchaseFoodName(){
        return name;
    }

    // abtract method
    public abstract int[] makeMenu();

    // public void printMenu();
    public void printMenu() {
        for (int i = 0; i < 7; i++) {
            System.out.print("[" + (i + 1) + "] --" + menu[0][i] 
            + " $" + priceMenu[i] + "\n");
        }
    }

    // Method that takes in userDecision and changes the name and image variables
    public void userDecision() {

        int choice = -1;

        Scanner in = new Scanner(System.in);

        // while loop ensures only valid answers
        while (choice == -1) {
            choice = in.nextInt();

            // in the scenario an invalid answer was typed in
            if (choice > 7 || choice < 1) {

                System.out.println("Looks like you made a typo, this isn't a choice :("
                        + "\nPlease try again . . .");

                // makes it so the while loop will continue looping
                choice = -1;

                // in the scenario that a valid answer was typed in

            } else {
                // checking if the given balance is enough to purchase
                if (priceMenu[choice - 1] <= balance) {

                    // checking if user chose to leave or not
                    if (choice == 7) {
                        System.out.println("See you soon <3 goodbye now");
                        name = "exit";

                        // checking to see what the user input and returning accordingly
                    } else {
                        System.out.println("Purchase of " + menu[0][(choice - 1)] + " Successful!");

                        // printing out image for the interactiveness
                        System.out.println("------------------------\n"
                                + menu[1][(choice - 1)]
                                + "------------------------"
                                + "\nEnjoy!");

                        // sets the name and image to the one that they chose
                        name = menu[0][(choice - 1)];
                        image = menu[1][(choice - 1)];

                        // takes their money
                        balance -= priceMenu[(choice - 1)];

                    }

                    // in the scenario the option they chose has a price higher than their balance
                } else {
                    System.out.println("You do not have enough funds :(\n"
                            + "Please pick a different option . . .");
                    choice = -1;
                }
            }

        }
    }

    // method in superclass that will run the program as 
    //if it was a game
    public void run() {

        Scanner in = new Scanner(System.in);

        // introductions
        System.out.println("\n-----------------------\n"
                + "[hit ENTER to continue])");
        in.nextLine();
        System.out.println("Please settle in and take" 
        + " a look at our menu...");
        in.nextLine();

        // calls on the printMenu
        printMenu();

    }

    // Overwritten toString method
    public String toString() {
        return name + "\n" + image;
    }
}
