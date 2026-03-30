import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class BoggleBoard {
    private final char[][] board;

    public BoggleBoard(char[][] board) {
        this.board = board;
    }

    public BoggleBoard(String filename) {
        try {
            Scanner sc = new Scanner(new File(filename));
            int m = sc.nextInt();
            int n = sc.nextInt();
            this.board = new char[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    String s = sc.next();
                    if (s.equals("Qu")) {
                        this.board[i][j] = 'Q';
                    } else {
                        this.board[i][j] = s.charAt(0);
                    }
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Could not open file: " + filename);
        }
    }

    public BoggleBoard(int m, int n) {
        this.board = new char[m][n];
        Random rnd = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                this.board[i][j] = (char) ('A' + rnd.nextInt(26));
            }
        }
    }

    public BoggleBoard(int n) {
        this(n, n);
    }
    
    public int rows() { return board.length; }
    public int cols() { return board[0].length; }
    public char getLetter(int i, int j) { return board[i][j]; }
}