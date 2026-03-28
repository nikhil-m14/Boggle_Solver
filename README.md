# Boggle Game Solver

A Java-based implementation of a Boggle game solver using object-oriented programming principles.

## Project Structure

- `src/`: Contains the main Java source files
  - `BoggleBoard.java`: Represents the Boggle game board with methods to access dimensions and letters
  - `BoggleSolver.java`: Implements the solver logic using a Trie data structure for efficient dictionary lookups
- `boards/`: Directory for storing Boggle board configurations
- `dictionary/`: Directory for dictionary files
- `docs/`: Documentation and project notes

## Current Implementation

- **BoggleBoard**: A class to encapsulate the game board, providing methods for rows, columns, and letter access
- **BoggleSolver**: Initialized with dictionary loading functionality using a Trie structure for fast word validation

## Development

Development proceeds using feature branches. The current branch `feature-board-and-tests` introduces the board representation and sets up the foundation for testing.
