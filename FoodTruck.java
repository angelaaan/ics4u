import java.util.Random;

public class FoodTruck extends FoodCorner {
    Random rand = new Random();

    static String[] menuArr = {"burger n fries", "pizza", "chocolate", "pickles", "cherries", "pretzel"};

    public FoodTruck(){
        super(menuArr);
        priceMenu = makeMenu();
    }

    public int[] makeMenu(){
        int[] arr = new int[6];

        Random rand = new Random();

        for (int i = 0 ;i <arr.length; i++){
            arr[i] = rand.nextInt(14)+5;
        }

        return arr;
    }

    public void printMenu(){
        System.out.println("•━━ FOOD TRUCK ━━•\n");
        for (int i = 0 ; i<menu.length; i++){
            System.out.println(menuArr[i] + " $" + priceMenu[i] + "\n");
        }

    }

    public String run(){
        
    }

    //getting foodies
    public String getBurger(){
        String burger = "                            |\\ /| /|_/|\n"
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
        + "        `'----------'`\n";
        return burger;
    }

    public String getPizza(){
        String pizza = "    __\n"
        + "  // \"\"--.._\n"
        + " ||  (_)  _ \"-._\n"
        + " ||    _ (_)    '-.\n"
        + " ||   (_)   __..-'\n"
        + "  \\__..--\"\"\n";
        return pizza;
    }

    public String getChocolate(){
        String choco = "     __ __ __ __ __\n"
        + "   /__/__/__/__/__/|\n"
        + "  /__/__/__/__/__/|/\n"
        + "  |__'__'__'__'__|/\n";
        return choco;
    }

    public String getPickles(){
        String pickleJar = "          ___________\n"
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
        + "         `\"\"\"\"\"``\"\"\"\"`\n";
        return pickleJar;
    }

    public String getCherries(){
        String cherrie = "   __.--~~.,-.__\n"
        + "   `~-._.-(`-.__`-.\n"
        + "           \\    `~~`\n"
        + "      .--./ \\\n"
        + "     /#   \\  \\.--.\n"
        + "     \\    /  /#   \\\n"
        + "      '--'   \\    /\n"
        + "              '--'\n";
        return cherrie;
    }

    public String getPretzel(){
        String pretzel = "    __       __\n"
        + "  .'  `'._.'`  '.\n"
        + " |  .--;   ;--.  |\n"
        + " |  (  /   \\  )  |\n"
        + "  \\  ;` /^\\ `;  /\n"
        + "   :` .'._.'. `;\n"
        + "   '-`'.___.'`-'\n";
        return pretzel;
    }

}

