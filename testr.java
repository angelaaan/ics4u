public class testr {
    public static void main(String[] args) {
       // FoodTruck f1 = new FoodTruck() ;
        //f1.printMenu();

        int money = 50;
        FoodCorner f1 = new FoodTruck(money);
        String item = f1.run();
        System.out.println(item);
        f1.getBalance();

        // FoodCorner f2 = new DrinksBar(money);
        // f2.run();
        // f2.getBalance();
        
    }
}
