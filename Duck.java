import java.util.*;
 
public class Duck extends Games {
 
    public Duck(int m, int t) {        // sending everything over to the big class
        super(2, m, t, "100 places, 20 ducks. Which one has a duck? Guess right and win!! ($2 to play, 10 tokens on a win)\n");
    }
 
    public void run() {              // run the game, this is going to be one of the methods ran
        System.out.println(instructions);
        play();
    }
 
    public void play() {
        if (currentmoney < cost) {
            System.out.println("You're broke lol\n");   // guy's actually poor
        }
        else {
            int check;
            int[] pond = new int[100];
            Scanner scnnr = new Scanner(System.in);
            Random rndm = new Random();
 
            for (int i = 1; i < 21; i++) {
                int d = rndm.nextInt(100);      // we throwing the ducks into the pond
                if (pond[d] == 1) {
                    i--;
                }
                else {
                    pond[d] = 1;
                }
            }
            check = 0;
            while (check == 0) {
                System.out.print("Pick a position in the pond (out of 100 spots): ");  // asking where to fish
                int inp = scnnr.nextInt();
                if (inp < 0 || inp > 101) {
                    System.out.println("if only that was in the pond... u gonna try and fish outside of the pond??\n");
                }
                else {
                    if (pond[(inp-1)] == 1) {
                        System.out.println("There's a duck here!!!");
                        System.out.println("You win 10 tokens\n");      // if duck then win
                        tokens += 10;
                    }
                    else {
                        System.out.println("No duck :(\n");    // haha L skill issue lol
                    }
                    check = 1;
                }
            }
 
            currentmoney -= 2;
 
            check = 0;
            while (check == 0) {
                System.out.print("Would you like to play again? That will be another $2 (1 for yes/0 for no) ");
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
