
import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;

public class carnivalMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        User u = new User(20, r.nextInt(100)+100);
        NumberFormat f = NumberFormat.getCurrencyInstance();

        // Intro dialogue
        System.out.println("Welcome to the carnival\nwhere all your wildest dreams come true...");
        s.nextLine();
        System.out.println("Except for the liberation of Hong Kong");
        s.nextLine();
        System.out.println("Have fun!\n");

        // Main loop
        String option = "";
        while (!(option.startsWith("6") || option.startsWith("ex"))){
            try{
                System.out.println("\033[1mYou have " + f.format(u.getBalance()) + " left\033[0m");
                System.out.println("You have " + u.getTokens() + " tokens\n");
                System.out.println("\033[4mWhat would you like to do\033[0m\n1. Games\n2. Food & Drinks\n3. Washroom\n4. Prizes\n5. Inventory\n6. Exit");
                option = s.nextLine().toLowerCase();
                System.out.println();

                // Games
                if (option.startsWith("1") || option.startsWith("g")){
                    String game = "";
                    Games g;

                    while (!(game.startsWith("ex") || game.startsWith("5"))){
                        System.out.println("\033[4mSelect Game\033[0m");
                        System.out.println("1. Guess the Goat\n2. Pick a Duck\n3. Shooting Range\n4. Tic Tac Toe\n5. Exit");
                        game = s.nextLine().toLowerCase();

                        // Goat game
                        if (game.equals("1") || game.equals("gues")){
                            g = new Goat(u.getBalance(), u.getTokens());
                            g.run();
                            u.setBalance(g.getbalance());
                            u.setTokens(g.gettokens());

                        // Duck game
                        }else if (game.equals("2") || game.equals("pick")){
                            g = new Duck(u.getBalance(), u.getTokens());
                            g.run();
                            u.setBalance(g.getbalance());
                            u.setTokens(g.gettokens());
                        }else{
                            System.out.println();
                        }

                    }

                // Food and drinks 
                }else if (option.startsWith("2") || option.startsWith("f")){

                    FoodCorner F1 = new FoodTruck(u.getBalance());
                    FoodCorner F2 = new DrinksBar(u.getBalance());
                    String foodOrDrink = "";
                    
                    while (!(F1.getPurchaseFoodName().equals("exit") || F2.getPurchaseFoodName().equals("exit") || foodOrDrink.startsWith("ex") || foodOrDrink.startsWith("3"))){
                        System.out.println("\033[4mSelect Option\033[0m\n1. Food\n2. Drink\n3. Exit");
                        foodOrDrink = s.nextLine().toLowerCase();

                        // Picked food
                        if (foodOrDrink.startsWith("f") || foodOrDrink.startsWith("1")){
                            F1.run();
                            if (!F1.getPurchaseFoodName().equals("exit")){
                                u.addFood(F1);
                                u.setBalance(F1.getBalance());
                                F2.setBalance(u.getBalance());
                            }
                        
                        // Picked drink
                        }else if (foodOrDrink.startsWith("2") || foodOrDrink.startsWith("d")){
                            F2.run();
                            if (!F2.getPurchaseFoodName().equals("exit")){
                                u.addFood(F2);;
                                u.setBalance(F2.getBalance());
                                F1.setBalance(u.getBalance());
                            }
                        }
                    }

                // Washroom
                } else if (option.startsWith("3") || option.startsWith("w")){
                    
                    int washroom = r.nextInt(3);

                    System.out.println(".----------------.\n;----------------;\n| ~~ .------.    |\n|   /        \\   |"+
                    "\n|  /          \\  |\n|  |          |  |  ,----. \n|   \\ ,    , /   | =|____|= \n'---,########,---'  (---(\n"
                    +"   /##'    '##\\      )---)\n   |##,    ,##|     (---(\n    \\'######'/       '---`\n     \\`\"\"\"\"`/\n"+
                    "      |`\"\"`|\n    .-|    |-.\n   /  '    '  \\\n   '----------'");

                    // Poop
                    if (washroom == 0){
                        
                        if (u.getBalance() - 5 < 0){
                            System.out.println("You don't have enough money to poop");
                        }
                        else{
                            System.out.println("You poop");
                            u.subtractBalance(5);
                        }
                    
                    // Pee
                    }else if (washroom == 1){

                        if (u.getBalance() - 3 < 0){
                            System.out.println("You dont have enough money to pee");
                        }else{
                            System.out.println("You pee");
                            u.subtractBalance(3);
                        }
                        
                    // Both
                    }else {
                        if (u.getBalance() - 8 < 0){
                            System.out.println("You don't have enough money to pee and poop");
                        }else{
                            System.out.println("You pee and poop");
                            u.subtractBalance(8);
                        } 
                    }System.out.println();

                // Prize selection
                } else if (option.startsWith("4") || option.startsWith("p")){
                    String prizeOption = "";

                    while (!(prizeOption.startsWith("4") || prizeOption.startsWith("ex"))){
                        System.out.println("\033[4mPick Prize Size\033[0m\n1. Small  - 20 Tokens\n2. Medium - 30 Tokens\n3. Large  - 40 Tokens\n4. Exit");
                        prizeOption = s.nextLine().toLowerCase();
                        System.out.println();

                        // Small prize
                        if (prizeOption.startsWith("1") || prizeOption.startsWith("s")){
                            
                            if (u.getTokens() - 20 < 0){
                                System.out.println("You don't have enough money for a small prize\n");
                            }else{
                                u.addPrize(new SmallPrize(u.getTokens()));
                                u.subtractTokens(20);
                                System.out.println("Small prize added to inventory");
                                System.out.println("\033[1mYou have " + u.getTokens() + " tokens left\033[1m\n");
                            }
                            
                        // Medium prize
                        }else if (prizeOption.startsWith("2") || prizeOption.startsWith("m")){

                            if (u.getTokens() - 30 < 0){
                                System.out.println("You don't have enough money for a medium prize\n");
                            }else{
                                u.addPrize(new MediumPrize(u.getTokens()));
                                u.subtractTokens(30);
                                System.out.println("Medium prize added to inventory");
                                System.out.println("\033[1mYou have " + u.getTokens() + " tokens left\033[1m\n");
                            }
                        
                        // Large prize
                        }else if (prizeOption.startsWith("3") || prizeOption.startsWith("l")){

                            if (u.getTokens() - 40 < 0){
                                System.out.println("You don't have enough money for a large prize\n");
                            }else{
                                u.addPrize(new LargePrize(u.getTokens()));
                                u.subtractTokens(40);
                                System.out.println("Large prize added to inventory");
                                System.out.println("\033[1mYou have " + u.getTokens() + " tokens left\033[1m\n");
                            }
                        }
                    }

                // Check inventory
                }else if (option.startsWith("5") || option.startsWith("i")){
                    
                    u.inventory();

                // Exit message
                }else if (option.startsWith("6") || option.startsWith("ex")){
                    System.out.println("Hope you had fun! \nMake sure next time you bring more money to spend");
                }
            }catch(Exception e){
                System.out.println("\nLooks like that input isn't allowed...");
                System.out.println("Returning to main area\n");
            }
        }s.close();
    }
}