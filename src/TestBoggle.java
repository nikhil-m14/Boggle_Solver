import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBoggle {
    public static void main(String[] args) {
        String dictPath = "dictionary/dictionary-yawl.txt";
        String boardPath = "boards/board4x4.txt";
        
        if (args.length >= 2) {
            dictPath = args[0];
            boardPath = args[1];
        }

        List<String> dictList = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(dictPath))) {
            while (sc.hasNext()) {
                dictList.add(sc.next());
            }
        } catch (Exception e) {
            System.err.println("Error reading dictionary: " + e.getMessage());
            return;
        }
        String[] dictionary = dictList.toArray(new String[0]);

        BoggleBoard board = new BoggleBoard(boardPath);
        BoggleSolver solver = new BoggleSolver(dictionary);

        int score = 0;
        int wordCount = 0;
        for (String word : solver.getAllValidWords(board)) {
            System.out.println(word);
            score += solver.scoreOf(word); // Accumulate each word's score
            wordCount++;
        }
        System.out.println("Found " + wordCount + " valid words.");
        System.out.println("Score = " + score); // Print total score at the end
    }
}
