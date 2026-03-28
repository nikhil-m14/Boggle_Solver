import java.util.*;

public class BoggleSolver {
    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord;
    }

    private final TrieNode root;

    public BoggleSolver(String[] dictionary) {
        root = new TrieNode();
        for (String word : dictionary)
            insert(word);
    }

    private void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'A';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isWord = true;
    }

    public Set<String> getAllValidWords(BoggleBoard board) {
        Set<String> result = new HashSet<>();
        boolean[][] visited = new boolean[board.rows()][board.cols()];

        for (int i = 0; i < board.rows(); i++) {
            for (int j = 0; j < board.cols(); j++) {
                dfs(board, i, j, root, "", visited, result);
            }
        }
        return result;
    }

    private void dfs(BoggleBoard board, int row, int col,
            TrieNode node, String word,
            boolean[][] visited, Set<String> result) {

        if (row < 0 || col < 0 || row >= board.rows() || col >= board.cols()) {
            return;
        }

        if (visited[row][col]) {
            return;
        }

        char letter = board.getLetter(row, col);
        TrieNode nextNode = node.children[letter - 'A'];

        if (nextNode == null) {
            return;
        }

        String nextWord = word + letter;
        if (letter == 'Q') {
            nextNode = nextNode.children['U' - 'A'];
            if (nextNode == null) {
                return;
            }
            nextWord += 'U';
        }
        visited[row][col] = true;

        if (nextWord.length() >= 3 && nextNode.isWord) {
            result.add(nextWord);
        }

        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr != 0 || dc != 0) {
                    dfs(board, row + dr, col + dc, nextNode, nextWord, visited, result);
                }
            }
        }

        visited[row][col] = false;
    }
}
