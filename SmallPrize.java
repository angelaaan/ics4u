public class SmallPrize extends Prize{

    private String[][] colourArr = {{"Black", "\u001B[30m"}, {"Red","\u001B[31m"},{"Green", "\u001B[30m"}};

    public SmallPrize(int balance){
        super(balance, 5, "Small");
        super.setColour(colourArr);
    }
}