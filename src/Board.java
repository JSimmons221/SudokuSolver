
public class Board {

    private Square[][] board;
    PuzzleParser p = new PuzzleParser();

    public Board(){
        createBoard();

    }

    private void createBoard(){
        int[][] iboard = p.readPuzzle("easy");
        for (int r = 0; r < iboard.length; r++) {
            for (int c = 0; c < iboard[0].length; c++) {
                board[r][c] = new Square(iboard[r][c],r,c);

            }
        }
    }

    private void solveBoard () { //loop through board and use fill possibles on each

    }

    //draw board?
}
