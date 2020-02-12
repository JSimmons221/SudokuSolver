import java.awt.*;

public class Square {

    private Boolean[] possible;
    private int correctNumber;
    private Boolean startFilled;
    private Point location;

    public Square(int i, int r, int c){
        correctNumber = i;
        startFilled = (correctNumber != 0);
        possible = new Boolean[9];
        for (int j = 0; j < possible.length; j++) {
            possible[j] = true;
        }
        location = new Point(r,c);

    }

    private void fillPossibles(Square[][] s){

    }


}
