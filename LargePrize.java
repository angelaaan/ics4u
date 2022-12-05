public class LargePrize extends Prize{

    private String[][] colourArr = {{"Cyan", "\u001B[36m"}, {"White","\u001B[37m"}};

    public LargePrize(int balance){
        super(balance, 15, "Large");
        super.setColour(colourArr);
    }
}