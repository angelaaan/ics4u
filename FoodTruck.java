import java.util.*;

public class FoodTruck extends FoodCorner {
    Random rand = new Random();

    //menu array that is used to fill the constructor
    static String[][] menuArr = { { "burger n fries", "pizza", "chocolate", "pickles", "cherries", "pretzel", "EXIT" },
            { "                            |\\ /| /|_/|\n"
                    + "                          |\\||-|\\||-/|/|\n"
                    + "                           \\\\|\\|//||///\n"
                    + "          _..----.._       |\\/\\||//||||\n"
                    + "        .'     o    '.     |||\\\\|/\\\\ ||\n"
                    + "       /   o       o  \\    | './\\_/.' |\n"
                    + "      |o        o     o|   |          |\n"
                    + "      /'-.._o     __.-'\\   |          |\n"
                    + "      \\      `````     /   |          |\n"
                    + "      |``--........--'`|    '.______.'\n"
                    + "       \\              /\n"
                    + "        `'----------'`\n",
                    "    __\n"
                            + "  // \"\"--.._\n"
                            + " ||  (_)  _ \"-._\n"
                            + " ||    _ (_)    '-.\n"
                            + " ||   (_)   __..-'\n"
                            + "  \\__..--\"\"\n",
                    "     __ __ __ __ __\n"
                            + "   /__/__/__/__/__/|\n"
                            + "  /__/__/__/__/__/|/\n"
                            + "  |__'__'__'__'__|/\n",

                    "          ___________\n"
                            + "         [___________]\n"
                            + "         /           \\\n"
                            + "        /~~^~^~^~^~^~^\\\n"
                            + "       |===============|\n"
                            + "       | P I C K L E S |\n"
                            + "       | ,-.   __      |\n"
                            + "       | \\ ,'-'. )     |\n"
                            + "       |  '._'_;'      |\n"
                            + "       ;===============;\n"
                            + "        \\             /\n"
                            + "         `\"\"\"\"\"``\"\"\"\"`\n",

                    "   __.--~~.,-.__\n"
                            + "   `~-._.-(`-.__`-.\n"
                            + "           \\    `~~`\n"
                            + "      .--./ \\\n"
                            + "     /#   \\  \\.--.\n"
                            + "     \\    /  /#   \\\n"
                            + "      '--'   \\    /\n"
                            + "              '--'\n",

                    "    __       __\n"
                            + "  .'  `'._.'`  '.\n"
                            + " |  .--;   ;--.  |\n"
                            + " |  (  /   \\  )  |\n"
                            + "  \\  ;` /^\\ `;  /\n"
                            + "   :` .'._.'. `;\n"
                            + "   '-`'.___.'`-'\n",
                    "" } };

    //fills the constructor
    public FoodTruck(int money) {

        //fills with the super 
        super(menuArr);
        balance = money;
        priceMenu = makeMenu();
    }

    //randomizes the menu with prices ranging from 5-20
    public int[] makeMenu() {
        int[] arr = new int[7];

        Random rand = new Random();

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = rand.nextInt(15) + 5;
        }

        return arr;
    }

    //prints the menu with the FoodTruck Title first and then runs the superClass's printMenu
    public void printMenu() {
        System.out.println("•━━ FOOD TRUCK ━━•\n");
        super.printMenu();
    }

    //the run method that adds onto the superclass's existing method
    public void run() {
        Scanner in = new Scanner(System.in);

        //refers to superclass run method
        super.run();

        //prints out introduction
        System.out.println("Hiya sweetcheeks! Welcome to the FOODTRUCK"
                + "\nIs there anything I can get for ya?\nChoice :");
        
        //calls the user decision
        userDecision();
    }
}