import java.util.*;
 
public class Goat extends Games {
   
    public Goat(int m, int t) {        // sending everything over to the big class
        super(5, m, t, "\nThis goat seems heavy... whats its weight? Guess right and win!! ($5 to play, 25 tokens on a win)\n");
    }
 
    public void run() {              // run the game, this is going to be one of the methods ran
        System.out.println(instructions);
        System.out.println("                  _.-..");
        System.out.println("             ,'9 )\\)`-.,.--.");
        System.out.println("             `-.|           `.");
        System.out.println("                \\,      ,    \\)");   // da beautiful goat
        System.out.println("                 `.  )._\\   (\\");
        System.out.println("                   |//   `-,//");
        System.out.println("                   ]||    //\"");
        System.out.println("                   \"\"    \"\"\n");
        play();
    }
 
    public void play() {
        if (currentmoney < cost) {
            System.out.println("You're broke lol\n");   // guy's actually poor
        }
        else {
            int check;
            int buf = 0;
            Scanner scnnr = new Scanner(System.in);
            Random rndm = new Random();
            int weight = rndm.nextInt(30);
            weight += 90;
 
            check = 0;
            while (check == 0) {
                System.out.print("What's the goat's weight in kg? (only whole numbers, the goat isn't 65.4kg I promise): ");
                int inp = scnnr.nextInt();
                if (inp < 0) {
                    System.out.println("why is the goat's weight in the negatives??\n");
                }
                else if (inp < 50 || inp > 150) {
                    System.out.println("bro how much do you think goats weigh??\n");
                }
                else {
                    if (inp == weight) {
                        System.out.println("Correct!! The goat is in fact " + weight + "kg");
                        System.out.println("You win 25 tokens!\n");
                        tokens += 25;
                    }
                    else {
                        System.out.println("boooo... you are wrong :(");
                        System.out.println("The goat actually weighs " + weight + "kg\n");
                        check = 0;
                        while (check == 0) {
                            System.out.print("You wanna guess again? ill let you for free hehe ;) (1 for yes/0 for no) ");
                            int again = scnnr.nextInt();                                    
                            if (again == 1) {
                                check = 1;
                            }
                            else if (again == 0) {
                                System.out.println("Alright, see you later\n");     // goodbye
                                check = 1;
                                buf = 1;
                            }
                            else {
                                System.out.println("following instructions can't be that hard...\n");
                            }
                        }
                    }
                    check = 1;
                }
            }
 
            if (buf == 0) {
                check = 0;
                while (check == 0) {
                    System.out.print("What's the goat's weight in kg? (only whole numbers, the goat isn't 65.4kg I promise): ");
                    int inp = scnnr.nextInt();
                    if (inp < 0) {
                        System.out.println("why is the goat's weight in the negatives??\n");
                    }
                    else if (inp < 50 || inp > 150) {
                        System.out.println("bro how much do you think goats weigh??\n");
                    }
                    else {
                        if (inp == weight) {
                            int rig = rndm.nextInt(6);
                            if (rig == 4) {
                                System.out.println("Correct!! The goat is in fact " + weight + "kg");
                                System.out.println("You win 25 tokens!\n");
                                tokens += 25;
                            }
                            else {
                                System.out.println("lmao the goat just ate some grass its actually " + (weight+1) + "kg now\n");
                            }
                        }
                        else {
                            System.out.println("... I thought I just said the answer was " + weight + "kg..\n");
                        }
                        check = 1;
                    }
                }
            }
 
            currentmoney -= 5;
 
            check = 0;
            if (buf == 1) {
                check = 1;
            }
            while (check == 0) {
                System.out.print("Would you like to play again? That will be another $5 (1 for yes/0 for no) ");
                int rerun = scnnr.nextInt();                                    
                if (rerun == 1) {                      // if the user feels like playing again
                    play();
                    check = 1;
                }
                else if (rerun == 0) {
                    System.out.println("Alright, see you later\n");     // goodbye
                    check = 1;
                }
                else {
                    System.out.println("bro... read the thing...\n");   // if the user is an idiot
                }
            }
        }
    }
}
