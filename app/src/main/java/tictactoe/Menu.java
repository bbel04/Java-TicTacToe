package tictactoe;

import java.util.Scanner;

public class Menu {

    int mode;
    
    public void gameMode() {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe!");
        
        while (true) {  //infinite loop until valid mode selected
            System.out.println("\nPlease select a game mode:");
            System.out.println("\n\t(1) Human vs. Human\n\t(2) Human vs. Computer");  //two mode options
            if (scanner.hasNextInt()){
                int modeChoice = scanner.nextInt();
                if (modeChoice == 1) {  //valid game mode, break loop
                    System.out.println("You have selected Human vs. Human mode!");
                    mode = modeChoice;
                    break;
                }
                else if (modeChoice == 2) { //valid, break loop
                    System.out.println("You have selected Human vs. Computer mode!");  //invalid mode, prompt again
                    mode = modeChoice;
                    break;
                }
            }
            else {
                System.out.println("Oops, Invalid input. Try again.");
                scanner.nextLine();   //capture invalid input
            }
        }
    }

    public static boolean playAgain(Scanner scanner, Board board) {
        while (true) { 
            System.out.println("Would you like to play again? (Y)es or (N)o");
            scanner.nextLine(); //capture previous input
            String playAgain = scanner.nextLine();
            if (playAgain.equalsIgnoreCase("Y")) {   
                System.out.println("You selected play again!");
                board.reset(); //reset board
                return true;
            } else if (playAgain.equalsIgnoreCase("N")) {
                System.out.println("Goodbye, see you next time!");  //display exit confirmation
                return false;  //return false, break loop in main method
            } else {
                System.out.println("Invalid choice. Enter 'Y' for Yes, or 'N' for no.");  //invalid response, prompt again
            }
        }
    }
}
