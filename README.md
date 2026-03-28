# Boggle Solver

A high-performance Java implementation designed to find all valid words on a simulated Boggle board. The objective of this project is to use advanced data structures and algorithms to solve Boggle boards quickly and accurately according to official rules.

## Core Implementation Details

* **Trie Data Structure**: The dictionary is stored in a custom 26-ary Trie (prefix tree). This ensures that the algorithm can perform highly efficient $O(L)$ prefix lookups to immediately abandon dead-end search paths.
* **Graph Traversal (DFS)**: Finding words on the 4x4 dice grid is handled using a recursive Depth-First Search. The algorithm explores adjacent horizontal, vertical, and diagonal paths without reusing dice.
* **Special Case Logic**: Custom logic is implemented to handle the unique Boggle 'Qu' tile, advancing the search string by two characters while only moving one die position on the board.
* **Automatic Scoring**: Words are validated against the dictionary and automatically scored based on the classic Hasbro Boggle length rules.

## Project Structure

* **src/**: Contains the main Java source code files.
  * **BoggleBoard.java**: Represents the 4x4 game grid.
  * **BoggleSolver.java**: Implements the Trie dictionary and DFS traversal algorithms.
  * **TestBoggle.java**: A standalone test wrapper to load the board, run the solver, and display results.
* **boards/**: Configuration text files representing different Boggle board setups.
* **dictionary/**: Standard English lexicon files used to validate words.
* **docs/**: Project notes and documentation, including AI interaction logs.

## How to Run the Solver

To compile and launch the application from the command line, follow these steps:

1. Navigate to the source directory:
   ```bash
   cd src
   ```

2. Compile all Java program files:
   ```bash
   javac *.java
   ```

3. Execute the test client:
   ```bash
   java TestBoggle
   ```

The script will search the board, print each valid word discovered, and output the total calculated score.
