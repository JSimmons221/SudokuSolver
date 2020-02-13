import java.awt.*;

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

    //loop through board and use fill possibles on each
    private void solveBoard () {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c].fillPossibles(board);
            }

        }

    }

    //draw board?
    public void paintComponent(Graphics2D g2d){
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                g2d.drawRect();
            }

        }
    }
}
