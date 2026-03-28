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

        int score = 0;
        for (String word : solver.getAllValidWords(board)) {
            System.out.println(word);
            score += solver.scoreOf(word); // Accumulate each word's score
        }
        System.out.println("Score = " + score); // Print total score at the end
    }
}
