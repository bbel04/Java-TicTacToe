package tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


public class TestBoard {
    private Board board;

    @BeforeEach
    void setup() {
        board = new Board();
    }

    @Test
    void testInitialBoardState() {
        char[][] expectedBoard = {
            {' ', ' ', ' '}, 
            {' ', ' ', ' '}, 
            {' ', ' ', ' '}
        };
        assertArrayEquals(expectedBoard, board.getBoard());
    }
}
