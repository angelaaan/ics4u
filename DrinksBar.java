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
                            + "         ((|          |\n"
                            + "        .--\\          /--.\n"
                            + "      '._  '========'  _.'\n"
                            + "          `\"\"\"\"\"\"\"\"\"\"\"\"`",
                    "               )\n"
                            + "              (\n"
                            + "                  )\n"
                            + "          ,.----------.\n"
                            + "         ((|          |\n"
                            + "        .--\\          /--.\n"
                            + "      '._  '========'  _.'\n"
                            + "          `\"\"\"\"\"\"\"\"\"\"\"\"`",
                    "        .:.\n"
                            + "       _oOoOo\n"
                            + "      [_|||||\n"
                            + "        |||||\n"
                            + "        ~~~~~\n",
                    "" } };

    static int[] priceMenuArr = new int[6];

    public DrinksBar(int money) {
        super(menuArr);
        balance = money;
        priceMenu = makeMenu();
    }

    public int[] makeMenu() {
        int[] arr = new int[7];

        Random rand = new Random();

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = rand.nextInt(20) + 2;
        }

        return arr;
    }

    //
    public void printMenu() {
        System.out.println("•━━ DRINKS BAR ━━•\n");
        super.printMenu();
    }

    //the run method that adds onto the superclass's existing method
    public void run() {
        Scanner in = new Scanner(System.in);

        //refers to superclass run method
        super.run();

        //prints out introduction
        System.out.println("Howdy Stranger! Welcome to the FOODTRUCK"
                + "\nWhat can I get for you today?\nChoice :");
        
        //calls the user decision
        userDecision();
    }

}
