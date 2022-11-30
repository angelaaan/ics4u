import java.util.Random;

public abstract class FoodCorner {

    String[] menu = new String[6];
    int [] priceMenu = new int[6];

    public FoodCorner (String[] newMenu) {
        menu = newMenu;
    }

    public abstract void printMenu();

    public abstract int[] makeMenu();

    public abstract String run();
    
}
