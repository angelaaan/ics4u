import java.util.*;

public class DrinksBar extends FoodCorner {
    Random rand = new Random();

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

    public DrinksBar(int money) {
        super(menuArr);
        balance = money;
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

    public void printMenu() {
        System.out.println("\u001B[45mDRINKS BAR \u001b[0m\n");
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
