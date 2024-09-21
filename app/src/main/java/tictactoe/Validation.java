package tictactoe;

public class Validation {
    public static boolean isValidMove(char[][] board, int position) {
        //valid move if space is unoccupied
        if (position < 1) {
            System.out.println("Your input is less than 1. Choose a space 1-9");
            return false;
        }
        if (position > 9) {
            System.out.println("Your input is greater than 9. Choose a space 1-9");
        }
        
        switch (position) {
            case 1:
                return (board[0][0] == ' ');
            case 2:
                return (board[0][1] == ' ');
            case 3:
                return (board[0][2] == ' ');
            case 4:
                return (board[1][0] == ' ');
            case 5:
                return (board[1][1] == ' ');
            case 6:
                return (board[1][2] == ' ');
            case 7:
                return (board[2][0] == ' ');
            case 8:
                return (board[2][1] == ' ');
            case 9:
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }
}
