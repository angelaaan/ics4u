public class DrinksBar extends FoodCorner {
    Random rand = new Random();

    static String[] menuArr = {"martini", "milk", "cola", "coffee", "tea", "Pepsi", "tomato soup"};
    static int[] priceMenuArr = new int[7];

    public DrinksBar(){
        super(menuArr);
        priceMenu = makeMenu();
    }

    public int[] makeMenu(){
        int[] arr = new int[7];

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
    
}
