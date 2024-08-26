import java.util.Scanner;

public class TicTacToeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();

        do {
            System.out.println("Current board layout:");
            game.printBoard();
            int row;
            int col;
            do {
                System.out.println("Player " + game.getCurrentPlayer() + ", enter your move (row [1-3] and column [1-3]): ");
                row = scanner.nextInt() - 1; // Adjust for 0-indexed array
                col = scanner.nextInt() - 1;
            } while (!game.placeMark(row, col));

            game.changePlayer();
        } while (!game.checkForWin() && !game.isBoardFull());

        if (game.isBoardFull() && !game.checkForWin()) {
            System.out.println("The game was a tie!");
        } else {
            game.changePlayer(); // Change back to the winning player
            System.out.println("Current board
