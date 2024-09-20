package tictactoe;

import java.util.Scanner;

public class Player {
    private char playerSymbol;
    private String playerName;

    public Player(char playerSymbol, String playerName) {
        this.playerSymbol = playerSymbol;
        this.playerName = playerName;
    }

    public void makeMove(Board board, Scanner in) {
        System.out.println(playerName + ", which space would you like to choose? (1-9): ");
        String playerInput = in.nextLine();

        while (!Validation.isValidMove(board.getBoard(), playerInput)) {
            System.out.println("Oops, try again. Choose an open space: ");
            playerInput = in.nextLine();
        }

        board.placeMove(playerInput, playerSymbol);
    }
}