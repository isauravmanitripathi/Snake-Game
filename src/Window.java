import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Window extends JFrame {

    private static final long serialVersionUID = -23453324543453422323; // need to remove this error 
    public static ArrayList<ArrayList<DataOfSquare>> Grid;
    public static int width = 20;
    public static int height = 20;
    public Window(){

        Grid = new ArrayList<ArrayList<DataOfSquare>>();
        ArrayList<DataOfSquare> data;


        for (int i = 0; i < width; i++) {
            data = new ArrayList<DataOfSquare>();
            for(int j = 0; j<height;j++) {
                DataOfSquare c = new DataOfSquare(2); // error will be gone once i edit DataOfSquare.java 
                data.add(c);
            }

            Grid.add(data);

        }

        getContentPanel().setLayout(new GridLayout(20,20,0,0)); // need to make a new control panel

        for(int i = 0; i < width ; i++) {
            for(int j = 0; j < height; j++) {
                getContentPane().add(Grid.get(i).get(j).square);
            }
        }

        Tuple position = new Tuple(10,10);

        ThreadsController c = new ThreadsController(position);

        c.start();

        this.addKeyListener((keyListener) new KeyboardListener());
    }

    
}
