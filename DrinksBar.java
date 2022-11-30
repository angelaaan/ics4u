import java.util.Random;

public class DrinksBar extends FoodCorner {
    Random rand = new Random();

    static String[] menuArr = {"grape juice", "milk", "Pepsi", "coffee", "tea", "root beer"};
    static int[] priceMenuArr = new int[6];

    public DrinksBar(){
        super(menuArr);
        priceMenu = makeMenu();
    }

    public int[] makeMenu(){
        int[] arr = new int[6];

        Random rand = new Random();

        for (int i = 0 ;i <arr.length; i++){
            arr[i] = rand.nextInt(20)+2;
        }

        return arr;
    }

    public void printMenu(){
        System.out.println("•━━ DRINKS BAR ━━•\n");
        for (int i = 0 ; i<menu.length; i++){
            System.out.println(menuArr[i] + " $" + priceMenu[i] + "\n");
        }

    }

    public String getGrapeJuice(){
        String juice = "                  __\n"
        + "                 /.-\n"
        + "         ______ //\n"
        + "        /______'/|\n"
        + "        [       ]|\n"
        + "        [ Grape ]|\n"
        + "        [ Juice ]|\n"
        + "        [  _\\_  ]|\n"
        + "        [  :::  ]|\n"
        + "        [   :'  ]/\n"
        + "        '-------'\n";
        return juice;
    }

    public String getPepsi(){
        String pepsi = "       .=.\n"
        + "       } {\n"
        + "      .' '.\n"
        + "     /     \\\n"
        + "     ;'---';\n"
        + "     |PEPSI|\n"
        + "     | .-. |\n"
        + "     | '-' |\n"
        + "     |'---'|\n"
        + "     '._._.'\n";
        return pepsi;
    }

    public String getCoffee(){
        String coffee = "               )\n"
        + "              (\n"
        + "                  )\n"
        + "          ,.----------.\n"
        + "         ((|          |\n"
        + "        .--\\          /--.\n"
        + "      '._  '========'  _.'\n"
        + "          `\"\"\"\"\"\"\"\"\"\"\"\"`";
        return coffee;
    }

    public String getTea(){
        String tea = "         _..,----,.._\n"
        + "      .-;'-.,____,.-';\n"
        + "     (( |            |\n"
        + "      `))            ;\n"
        + "       ` \\          /\n"
        + "      .-' `,.____.,' '-.\n"
        + "     (     '------'     )\n"
        + "      `-=..________..--'";
        return tea;
    }

    public String getRootBeer(){
        String root = "        .:.\n"
        + "       _oOoOo\n"
        + "      [_|||||\n"
        + "        |||||\n"
        + "        ~~~~~\n";
        return root;
    }
    
}