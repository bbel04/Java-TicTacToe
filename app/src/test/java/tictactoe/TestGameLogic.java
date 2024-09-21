package tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class TestGameLogic {
    private Board board;
    private GameLogic gameLogic;

    @BeforeEach
    void setup() {
        board = new Board();
        gameLogic = new GameLogic();
    }

    @Test
    void testPlayer1WinsRow() {
        // Simulate player 1 ('X') win by filling first row
        board.placeMove(1, 'X');
        board.placeMove(2, 'X');
        board.placeMove(3, 'X');
        
        assertTrue(gameLogic.isGameFinished(board));  // Player 1 should win
    }

    @Test
    void testPlayer1WinsDiagonal() {
    // Simulate player 1 ('X') winning by filling the diagonal
    board.placeMove(1, 'X');
    board.placeMove(5, 'X');
    board.placeMove(9, 'X');

    assertTrue(gameLogic.isGameFinished(board));  // Player 1 should win
}

    @Test
    void testPlayer2WinsRow() {
    // Simulate player 2 ('O') winning by filling the second row
    board.placeMove(4, 'O');
    board.placeMove(5, 'O');
    board.placeMove(6, 'O');
    
    assertTrue(gameLogic.isGameFinished(board));  // Player 2 should win
}

    @Test
    void testPlayer2WinsColumn() {
    // Simulate player 2 ('O') winning by filling the first column
    board.placeMove(1, 'O');
    board.placeMove(4, 'O');
    board.placeMove(7, 'O');

    assertTrue(gameLogic.isGameFinished(board));  // Player 2 should win
}
}
