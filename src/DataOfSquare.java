

// Let's fix all the errors in different files 

import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {

    ArrayList<Color> C = new ArrayList<Color>();
    int color; // 2: snake, 1: food, 0: empty
    SquarePanel square;
    public DataOfSquare(int col) {

        C.add(Color.darkGray);
        C.add(Color.BLUE);
        C.add(Color.white);
        color = col;
        square = new SquarePanel(C.get(color)); // need to fix the square panel
    }

    public void lightMeUp(int c) {
        square.ChangeColor(C.get(c));
    }


    
}
