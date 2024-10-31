package tictactoe;
/*
 * This source file was generated by the Gradle 'init' task
 */


//import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        GameLogic gameLogic = new GameLogic();
        Menu menu = new Menu();

        Player player1 = new Player('X', "Player 1");
        Player player2 = new Player('O', "Player 2");
        Player computerPlayer = new Player('O', "Computer Player");

        menu.gameMode();   // Game Menu
        
        System.out.println("1|2|3\n-+-+-\n4|5|6\n-+-+-\n7|8|9");

        if (menu.mode == 1) {
            while (true) {   //continue until game outcome is reached
                player1.makeMove(board, scanner);
                if (gameLogic.isGameFinished(board, menu.mode)) {
                    break;
                }
                board.printBoard();

                player2.makeMove(board, scanner);
                if (gameLogic.isGameFinished(board, menu.mode)) {
                    break;
                }
                board.printBoard();
            }
        }
        else {
            while (true) {   //continue until game outcome is reached
                player1.makeMove(board, scanner);
                if (gameLogic.isGameFinished(board, menu.mode)) {
                    break;
                }
                board.printBoard();

                computerPlayer.computerTurn(board);
                if (gameLogic.isGameFinished(board, menu.mode)) {
                    break;
                }
                board.printBoard();
            }
        }

        scanner.close();
    }
}