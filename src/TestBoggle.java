public class TestBoggle {
    public static void main(String[] args) {
        String[] dictionary = {
                "TEST", "TEAM", "QUIZ", "QUIT", "TEA"
        };

        char[][] grid = {
                { 'T', 'E', 'S', 'T' },
                { 'Q', 'I', 'Z', 'A' },
                { 'T', 'E', 'A', 'M' },
                { 'U', 'I', 'T', 'X' }
        };

        BoggleBoard board = new BoggleBoard(grid);
        BoggleSolver solver = new BoggleSolver(dictionary);

        for (String word : solver.getAllValidWords(board)) {
            System.out.println(word + " -> Score: " + solver.scoreOf(word));
        }
    }
}