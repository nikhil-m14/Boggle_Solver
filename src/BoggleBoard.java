public class BoggleBoard {
    private final char[][] board;

    public BoggleBoard(char[][] board) {
        this.board = board;
    }

    public int rows() { return board.length; }
    public int cols() { return board[0].length; }
    public char getLetter(int i, int j) { return board[i][j]; }
}