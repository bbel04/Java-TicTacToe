package tictactoe;

public class Board {
    private char[][] board;

    public Board() {
        board = new char[][] {
            {' ', ' ', ' '}, 
            {' ', ' ', ' '}, 
            {' ', ' ', ' '}
        };
    }

    public void placeMove(String position, char playerIndicator) {
        //place indicator in corresponding array index
        switch (position) {
            case "1":
                board[0][0] = playerIndicator;
                break;
            case "2":
                board[0][1] = playerIndicator;
                break;
            case "3":
                board[0][2] = playerIndicator;
                break;
            case "4":
                board[1][0] = playerIndicator;
                break;
            case "5":
                board[1][1] = playerIndicator;
                break;
            case "6":
                board[1][2] = playerIndicator;
                break;
            case "7":
                board[2][0] = playerIndicator;
                break;
            case "8":
                board[2][1] = playerIndicator;
                break;
            case "9":
                board[2][2] = playerIndicator;
                break;
            default:
                System.out.print("Unable to place move");
                break;
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public void printBoard() {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}
