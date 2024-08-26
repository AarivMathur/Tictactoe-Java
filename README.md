# Tic-Tac-Toe Project - README

## Project Overview

This project implements a simple two-player Tic-Tac-Toe game in Java. The game consists of two classes: `TicTacToe` and `TicTacToeTester`. The `TicTacToe` class manages the game logic, while the `TicTacToeTester` class allows players to interact with the game.

### Classes:
1. **TicTacToe**
   - This class handles the Tic-Tac-Toe game board, player turns, and win conditions.

2. **TicTacToeTester**
   - This class runs the game loop and facilitates player input and moves.

## Class: `TicTacToe`

### Attributes:
- `char[][] board`:
  - A 3x3 grid that represents the Tic-Tac-Toe board. Initially filled with `'-'` to indicate empty spaces.
  
- `char currentPlayer`:
  - Stores the current player, either `'X'` or `'O'`.

### Methods:

1. **`TicTacToe()`**:
   - Constructor that initializes the game board and sets the current player to `'X'`.
   
2. **`initializeBoard()`**:
   - Fills the board with `'-'` to signify empty spaces.
   
3. **`isBoardFull()`**:
   - Checks if all spaces on the board are filled.
   - Returns `true` if the board is full; `false` otherwise.

4. **`checkForWin()`**:
   - Checks if there is a winning condition (3 marks in a row, column, or diagonal).
   - Returns `true` if a player has won; `false` otherwise.
   
5. **`placeMark(int row, int col)`**:
   - Attempts to place the current player's mark at the specified row and column.
   - Returns `true` if the mark was successfully placed; `false` if the space is invalid or already occupied.
   
6. **`changePlayer()`**:
   - Switches the current player between `'X'` and `'O'`.
   
7. **`printBoard()`**:
   - Prints the current state of the board to the console.
   
8. **`getCurrentPlayer()`**:
   - Returns the current player (`'X'` or `'O'`).

### Private Methods:
- **`checkRowCol(char c1, char c2, char c3)`**:
   - Helper method that checks if three consecutive spots on the board contain the same player's mark.

- **`checkRowsForWin()`**:
   - Checks all rows for a winning condition.

- **`checkColumnsForWin()`**:
   - Checks all columns for a winning condition.

- **`checkDiagonalsForWin()`**:
   - Checks both diagonals for a winning condition.

## Class: `TicTacToeTester`

### `main(String[] args)`:
- Sets up the game loop where two players take turns placing their marks on the Tic-Tac-Toe board.
- Players are prompted to enter their move (row and column). The game will continue until there is a winner or the board is full (tie).
  
### How the Game Works:
1. The current state of the board is printed after every move.
2. Players are prompted to enter their move in the format: `row [1-3] and column [1-3]`.
3. If the move is valid, the player's mark is placed on the board.
4. After every move, the game checks for a win or if the board is full.
5. If a player wins, a message is displayed, and the game ends.
6. If the board is full and there is no winner, the game ends in a tie.

### Example of a Game:
```java
Player X, enter your move (row [1-3] and column [1-3]): 1 1
Current board layout:
X - -
- - -
- - -

Player O, enter your move (row [1-3] and column [1-3]): 1 2
Current board layout:
X O -
- - -
- - -
