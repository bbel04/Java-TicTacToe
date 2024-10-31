package tictactoe;

import java.util.Scanner;

public class Menu {

    int mode;
    
    public void gameMode() {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe!");
        
        while (true) {
            System.out.println("\nPlease select a game mode:");
            System.out.println("\n\t(1) Human vs. Human\n\t(2) Human vs. Computer");  //two mode options
            if (scanner.hasNextInt()){
                int modeChoice = scanner.nextInt();
                if (modeChoice == 1) {  //valid game mode, break loop
                    System.out.println("You have selected Human vs. Human mode!");
                    mode = modeChoice;
                    break;
                }
                else if (modeChoice == 2) {
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
}
