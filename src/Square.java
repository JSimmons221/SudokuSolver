import java.awt.*;

public class Square {

    private Boolean[] possible;
    private int correctNumber;
    private Boolean startFilled;
    private Point location;  //(x, y) -> (r, c)
    int pLeft;

    public Square(int i, int r, int c){
        correctNumber = i;
        startFilled = (correctNumber != 0);
        possible = new Boolean[9];
        for (int j = 0; j < possible.length; j++) {
            possible[j] = true;
        }
        location = new Point(r,c);
        pLeft=9;

    }

    public void fillPossibles(Square[][] s){ //Changes numbers that don't work to false in possible, if only one possible, fill correct number.
        for (int i = 0; i < 9; i++) {

            if (s[i][location.x].getCorrectNumber() != 0 & possible[s[i][location.x].getCorrectNumber()-1]){ //Check Columns
                possible[s[i][location.x].getCorrectNumber()-1] = false;
                pLeft--;

            }
            if (s[location.y][i].getCorrectNumber() != 0 & possible[s[location.y][i].getCorrectNumber()-1]){ //Check Rows
                possible[s[location.y][i].getCorrectNumber()-1] = false;
                pLeft--;

            }

        }
        if (pLeft == 1);
        for (int j = 0; j < possible.length; j++) {
            if (possible[j]){
                correctNumber = j + 1;
            }
        }
    }

    public int getCorrectNumber() {
        return correctNumber;
    }
}
