package tictactoe;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private char playerSymbol;
    private String playerName;

    public Player(char playerSymbol, String playerName) {
        this.playerSymbol = playerSymbol;
        this.playerName = playerName;
    }

    public void makeMove(Board board, Scanner in) {
        int playerInput;
        boolean validInput = false;

        while (!validInput) {
            System.out.println(playerName + ", which space would you like to choose? (1-9): ");
            try {
                playerInput = in.nextInt();
                if (Validation.isValidMove(board.getBoard(), playerInput)) {
                    validInput = true;
                    board.placeMove(playerInput, playerSymbol);
                } 
                else {
                    System.out.println("Oops, try again. Choose an open space: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number 1-9.");
                in.next();
            }
        }
    }

    public void computerTurn(Board board) {
        Random rand = new Random();
        int computerMove;
        while (true) {
            computerMove = rand.nextInt(9) + 1;
            if (Validation.isValidMove(board.getBoard(), computerMove)) {
                break;
            }
        }
        System.out.println("Computer chose space " + computerMove);
        board.placeMove(computerMove, 'O');
    }
}
