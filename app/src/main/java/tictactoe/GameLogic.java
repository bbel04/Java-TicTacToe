package tictactoe;

public class GameLogic {

    public boolean isGameFinished(Board board, int menuMode) {
        char[][] b = board.getBoard();
        //check if player1 wins
        if (playerWon(b, 'X')) {
            board.printBoard();
            System.out.println("Player One wins!");
            return true;
        }
        //check if player2 wins
        if (playerWon(b, 'O')) {
            board.printBoard();
            if (menuMode == 1) { //human vs human, player win
                System.out.println("Player Two wins!");
            }
            else {  //human vs computer, computer win
                System.out.println("Computer wins!");
            }            
            return true;
        }
        
        //check for draw
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] == ' ') {
                    return false;
                }
            }
        }
        board.printBoard();
        System.out.println("The game ended in a draw!");
        return true;
    }

    private boolean playerWon(char[][] board, char playerIndicator) {
        if (//check row win
            (board[0][0] == playerIndicator && board[0][1] == playerIndicator && board[0][2] == playerIndicator) || 
            (board[1][0] == playerIndicator && board[1][1] == playerIndicator && board[1][2] == playerIndicator) ||
            (board[2][0] == playerIndicator && board[2][1] == playerIndicator && board[2][2] == playerIndicator) ||
            //check column win
            (board[0][0] == playerIndicator && board[1][0] == playerIndicator && board[2][0] == playerIndicator) || 
            (board[0][1] == playerIndicator && board[1][1] == playerIndicator && board[2][1] == playerIndicator) ||
            (board[0][2] == playerIndicator && board[1][2] == playerIndicator && board[2][2] == playerIndicator) ||
            //check diagonal win
            (board[0][0] == playerIndicator && board[1][1] == playerIndicator && board[2][2] == playerIndicator) || 
            (board[0][2] == playerIndicator && board[1][1] == playerIndicator && board[2][0] == playerIndicator)) {
            return true;
        }
        return false;
    }
}
