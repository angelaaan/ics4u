import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;

public class carnivalMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        User u = new User(20, 500);
        NumberFormat f = NumberFormat.getCurrencyInstance();

        int balanceLimit = r.nextInt(50)+50;

        while (u.getBalance() > balanceLimit){
            System.out.print("Balance limit is " + balanceLimit + "\nEnter how much money you have: ");
            u.setBalance(s.nextInt());
            if (u.getBalance() > balanceLimit){
                System.out.println("That is too much money");
            }System.out.println();
        }s.nextLine();

        String option = "";
        while (!(option.startsWith("6") || option.startsWith("ex"))){
            System.out.println("\033[1mYou have " + f.format(u.getBalance()) + " left\033[0m");
            System.out.println("You have " + u.getTokens() + " tokens\n");
            System.out.println("\033[4mWhat would you like to do\033[0m\n1. Games\n2. Food & Drinks\n3. Washroom\n4. Prizes\n5. Inventory\n6. Exit");
            option = s.nextLine().toLowerCase();
            System.out.println();
            if (option.startsWith("1") || option.startsWith("g")){
                String game = "";
                Games g;

                while (!(game.startsWith("ex") || game.startsWith("5"))){
                    System.out.println("\033[4mSelect Game\033[0m");
                    System.out.println("1. Guess the Goat\n2. Pick a Duck\n3. Shooting Range\n4. Tic Tac Toe\n5. Exit");
                    game = s.nextLine().toLowerCase();
                    if (game.equals("1") || game.equals("gues")){
                        g = new Goat(u.getBalance(), u.getTokens());
                        g.run();
                        u.setBalance(g.getbalance());
                        u.setTokens(g.gettokens());
                    }if (game.equals("2") || game.equals("pick")){
                        g = new Duck(u.getBalance(), u.getTokens());
                        g.run();
                        u.setBalance(g.getbalance());
                        u.setTokens(g.gettokens());
                    }

                }

            }else if (option.startsWith("2") || option.startsWith("f")){

                FoodCorner F1 = new FoodTruck(u.getBalance());
                FoodCorner F2 = new DrinksBar(u.getBalance());
                String foodOrDrink = "";
                
                while (!(F1.getPurchaseFoodName().equals("exit") || F2.getPurchaseFoodName().equals("exit") || foodOrDrink.startsWith("ex") || foodOrDrink.startsWith("3"))){
                    System.out.println("\033[4mSelect Option\033[0m1. Food\n2. Drink\n3. Exit");
                    foodOrDrink = s.nextLine().toLowerCase();
                    if (foodOrDrink.startsWith("f") || foodOrDrink.startsWith("1")){
                        F1.run();
                        if (!F1.getPurchaseFoodName().equals("exit")){
                            u.addFood(F1);
                            u.setBalance(F1.getBalance());
                            F2.setBalance(u.getBalance());
                        }
                    }else if (foodOrDrink.startsWith("2") || foodOrDrink.startsWith("d")){
                        F2.run();
                        if (!F2.getPurchaseFoodName().equals("exit")){
                            u.addFood(F2);;
                            u.setBalance(F2.getBalance());
                            F1.setBalance(u.getBalance());
                        }
                    }
                }

            } else if (option.startsWith("3") || option.startsWith("w")){
                
                int washroom = r.nextInt(3);

                System.out.println(".----------------.\n;----------------;\n| ~~ .------.    |\n|   /        \\   |"+
                "\n|  /          \\  |\n|  |          |  |  ,----. \n|   \\ ,    , /   | =|____|= \n'---,########,---'  (---(\n"
                +"   /##'    '##\\      )---)\n   |##,    ,##|     (---(\n    \\'######'/       '---`\n     \\`\"\"\"\"`/\n"+
                "      |`\"\"`|\n    .-|    |-.\n   /  '    '  \\\n   '----------'");

                if (washroom == 0){
                    
                    if (u.getBalance() - 5 < 0){
                        System.out.println("You don't have enough money to poop");
                    }
                    else{
                        System.out.println("You poop");
                        u.subtractBalance(5);
                    }
                }else if (washroom == 1){
                    if (u.getBalance() - 3 < 0){
                        System.out.println("You dont have enough money to pee");
                    }else{
                        System.out.println("You pee");
                        u.subtractBalance(3);
                    }
                    
                }else {
                    if (u.getBalance() - 8 < 0){
                        System.out.println("You don't have enough money to pee and poop");
                    }else{
                        System.out.println("You pee and poop");
                        u.subtractBalance(8);
                    } 
                }

            } else if (option.startsWith("4") || option.startsWith("p")){
                System.out.println();
                String prizeOption = "";

                while (!(prizeOption.startsWith("4") || prizeOption.startsWith("ex"))){
                    System.out.println("Pick Prize Size\n1. Small - 5 Tokens\n2. Medium - 10 Tokens\n3. Large - 15 Tokens\n4. Exit");
                    prizeOption = s.nextLine().toLowerCase();
                    System.out.println();
                    if (prizeOption.startsWith("1") || prizeOption.startsWith("s")){
                        
                        if (u.getTokens() - 5 < 0){
                            System.out.println("You don't have enough money for a small prize\n");
                        }else{
                            u.addPrize(new SmallPrize(u.getTokens()));
                            u.subtractTokens(5);
                            System.out.println("Small prize added to inventory\n");
                        }
                        
                    } else if (prizeOption.startsWith("2") || prizeOption.startsWith("m")){

                        if (u.getTokens() - 10 < 0){
                            System.out.println("You don't have enough money for a medium prize\n");
                        }else{
                            u.addPrize(new MediumPrize(u.getTokens()));
                            u.subtractTokens(10);
                            System.out.println("Medium prize added to inventory\n");
                        }
                        
                    } else if (prizeOption.startsWith("3") || prizeOption.startsWith("l")){

                        if (u.getTokens() - 15 < 0){
                            System.out.println("You don't have enough money for a large prize\n");
                        }else{
                            u.addPrize(new LargePrize(u.getTokens()));
                            u.subtractTokens(15);
                            System.out.println("Large prize added to inventory\n");
                        }
                    }
                }

            }else if (option.startsWith("5") || option.startsWith("i")){
                System.out.println();
                u.inventory();
            }else if (option.startsWith("6") || option.startsWith("e")){
                System.out.println("Goodbye");
            }
        }s.close();
    }
}