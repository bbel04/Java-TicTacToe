package tictactoe;

import java.util.InputMismatchException;
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
}
