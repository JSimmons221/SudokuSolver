
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
                board[r][c] = new Square(iboard[r][c]);

            }
        }
    }

    private void determinePossibles{

    }
}
