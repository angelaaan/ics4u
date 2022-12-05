// Parantap
// Dec 4, 2022
// Game parent class
 
public abstract class Games {
    int cost;
    int currentmoney;         // the instance
    int tokens;
    String instructions;
 
    public Games(int c, int m, int t, String i) {
        cost = c;
        currentmoney = m;       // we make
        tokens = t;
        instructions = i;
    }
 
    public int getbalance() {
        return currentmoney;      // returning the post-game information values here
    }
    public int gettokens() {
        return tokens;
    }
 
    public abstract void run();    // running the game
}
