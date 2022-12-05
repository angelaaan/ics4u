
import java.util.Random;

// pink, green, purple
// blue, yellow, brown
// orange, red, white

public class Prize {
private int cost, newBalance, colourInt;
private String size, colour, colourCode;
private Random r = new Random();

public Prize(int balance, int newCost, String newSize){
    cost = newCost;
    newBalance = balance - cost;
    size = newSize;
}

public void setSize(String newSize){
    size = newSize;
}

public int balance(){
    return newBalance;
}

public String getSize(){
    return size;
}

public void setColour(String[][] newColours){
    colourInt = r.nextInt(newColours.length);

    colour = newColours[colourInt][0];
    colourCode = newColours[colourInt][1];
}

public String getColour(){
    return colour;
}

public String toString(){
    return colourCode+"       (`-\"-`)\n"+
                      "        /'Y'\\\n"+
                      "      __\\_^_/__\n"+
                      "     ()_ >o< _()\n"+
                      "        ) : (\n"+
                      "       / /-\\ \\\n"+
                      "      ()/   \\()\u001B[0m\n"
    +"Size: " + size + "\nColour: " + colour;
}
}