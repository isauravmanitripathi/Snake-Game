


// this final file

import java.util.ArrayList;

import javax.xml.crypto.Data;

public class ThreadsController {

    ArrayList<ArrayList<DataOfSquare>> Squares = new ArrayList<ArrayList<DataofSquare>>();
    Tuple headSnakePos;
    int sizeSnake = 3;
    long speed = 50;

    public static int directionSnake;

    ArrayList<Tuple> positions = new ArrayList<Tuple>();
    Tuple foodPosition;

    ThreadsController(Tuple positionDepart){
        Squares = Window.Grid;

        headSnakePos = new Tuple(positionDepart.x, positionDepart.y);
        directionSnake = 1;

        Tuple headPos = new Tuple(headSnakePos.getX(), headSnakePos.getY());

    }
    
}
