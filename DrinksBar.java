import java.util.*;

public class DrinksBar extends FoodCorner {
    Random rand = new Random();

    //menu array that is used to fill the constructor from the parent class
    static String[][] menuArr = { { "grape juice", "milk", "Pepsi", "coffee", "tea", "root beer", "EXIT" },
            { "                  __\n"
                    + "                 /.-\n"
                    + "         ______ //\n"
                    + "        /______'/|\n"
                    + "        [       ]|\n"
                    + "        [ Grape ]|\n"
                    + "        [ Juice ]|\n"
                    + "        [  _\\_  ]|\n"
                    + "        [  :::  ]|\n"
                    + "        [   :'  ]/\n"
                    + "        '-------'\n",
                    "       .=.\n"
                            + "       } {\n"
                            + "      .' '.\n"
                            + "     /     \\\n"
                            + "     ;'---';\n"
                            + "     |MILK!|\n"
                            + "     | .-. |\n"
                            + "     | '-' |\n"
                            + "     |'---'|\n"
                            + "     '._._.'\n",
                    "       .=.\n"
                            + "       } {\n"
                            + "      .' '.\n"
                            + "     /     \\\n"
                            + "     ;'---';\n"
                            + "     |PEPSI|\n"
                            + "     | .-. |\n"
                            + "     | '-' |\n"
                            + "     |'---'|\n"
                            + "     '._._.'\n",
                    "               )\n"
                            + "              (\n"
                            + "                  )\n"
                            + "          ,.----------.\n"
                            + "         ((|  coffee  |\n"
                            + "        .--\\          /--.\n"
                            + "      '._  '========'  _.'\n"
                            + "          `\"\"\"\"\"\"\"\"\"\"\"\"`\n",
                    "               )\n"
                            + "              (\n"
                            + "                  )\n"
                            + "          ,.----------.\n"
                            + "         ((|   tea    |\n"

                            
                            + "        .--\\          /--.\n"
                            + "      '._  '========'  _.'\n"
                            + "          `\"\"\"\"\"\"\"\"\"\"\"\"`\n",
                    "        .:.\n"
                            + "       _oOoOo\n"
                            + "      [_|||||\n"
                            + "        |||||\n"
                            + "        ~~~~~\n",
                    "" } };

    //sets up the child class Drinks Bar constructor                
    public DrinksBar(int money) {

        //uses the super method to fill parent class
        super(menuArr);

        //fills in the instance variable
        balance = money;

        // changes the priceMenu to be the same as the array that
        // the makeMenu() method returns
        priceMenu = makeMenu();
    }

    //The randomizes an array with 7 spaces with randomized numbers
    public int[] makeMenu() {
        int[] arr = new int[7];

        Random rand = new Random();

        //For loop that randomizes the array with numbers from 2 - 22
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = rand.nextInt(20) + 2;
        }

        return arr;
    }

    //method that prints out the header of the menu
    public void printMenu() {
        System.out.println("\u001B[45mDRINKS BAR \u001b[0m\n");
        
        //command that runs the parent class printMenu() 
        super.printMenu();
    }

    //the run method that adds onto the superclass's existing method
    public void run() {
        Scanner in = new Scanner(System.in);

        //refers to superclass run method
        super.run();

        //prints out introduction
        System.out.println("Howdy Stranger! Welcome to the DRINKS BAR"
                + "\nWhat can I get for you today?\nChoice :");
        
        //calls the user decision
        userDecision();
    }

}
