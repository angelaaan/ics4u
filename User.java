import java.text.NumberFormat;

public class User {
    
    private int tokens, balance;
    private FoodCorner[] food = new FoodCorner[0];
    private Prize[] prizes = new Prize[0];
    private NumberFormat f = NumberFormat.getCurrencyInstance();

    public User(int newTokens, int newBalance){
        tokens = newTokens;
        balance = newBalance;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int newBalance){
        balance = newBalance;
    }

    public void addBalance(int add){
        balance += add;
    }

    public void subtractBalance(int sub){
        balance -= sub;
    }

    public void setTokens(int newTokens){
        tokens = newTokens;
    }

    public void addTokens(int add){
        tokens += add;
    }

    public void subtractTokens(int sub){
        tokens -= sub;
    }

    public int getTokens(){
        return tokens;
    }
    
    public void setFood(FoodCorner[] newFood){
        food = newFood;
    }

    public void addFood(FoodCorner add){
        food = extendFood(food);
        food[food.length-1] = add;
    }

    public void setPrize(Prize[] newPrizes){
        prizes = newPrizes;
    }

    public void addPrize(Prize add){
        prizes = extendPrize(prizes);
        prizes[prizes.length-1] = add;
    }

    private FoodCorner[] extendFood(FoodCorner[] foodArr){
        FoodCorner[] newFood = new FoodCorner[foodArr.length+1];

        for (int i = 0; i < foodArr.length; i++){
            newFood[i] = foodArr[i];
        }
        return newFood;
    }

    private Prize[] extendPrize(Prize[] prizeArr){
        Prize[] newPrize = new Prize[prizeArr.length+1];
        for (int i = 0; i < prizeArr.length; i++){
            newPrize[i] = prizeArr[i];
        }
        return newPrize;
    }

    public void inventory(){

        System.out.println("\033[1mBalance: " + f.format(balance));
        System.out.println("Tokens: " + tokens+"\033[0m\n");

        if (food.length > 0){
            System.out.println("\033[1mFood & Drinks\033[0m");
            for (int i = 0; i < food.length; i++){
                System.out.println(food[i]);
                System.out.println();
            }
        }

        if (prizes.length > 0){
            System.out.println("\033[1mPrizes\033[0m");
            for (int i = 0; i < prizes.length; i++){
                System.out.println(prizes[i]);
                System.out.println();
            }
        }
    }
}