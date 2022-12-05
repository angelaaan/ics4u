public class MediumPrize extends Prize{

    private String[][] colourArr = {{"Yellow", "\u001B[33m"}, {"Blue","\u001B[34m"},{"Purple", "\u001B[35m"}};

    public MediumPrize(int balance){
        super(balance, 10, "Medium");
        super.setColour(colourArr);
    }
}