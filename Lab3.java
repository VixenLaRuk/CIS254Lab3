/**
 * This program consist of a guessing game and a rock-paper-scissor game.
 * @author Vixen La Ruk
 * @author Edisson Ajciginac
 * @since 10/15/2025
 */
import java.util.Random;
import java.util.Scanner;
public class Lab3 {

    /**
     * Main method that executes the game collection program.
     * Displays a main menu and allows users to select
     * different games or exit.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("MAIN MENU");
            System.out.println("1. Guessing Game");
            System.out.println("2. Rock-Paper-Scissors");
            System.out.println("3. Exit");
            System.out.print("Choice (1-3): ");

            int choice = sc.nextInt();
            sc.nextLine(); //newline

            if (choice == 1) {
                boolean keepPlaying = true;
                while (keepPlaying) {
                    System.out.println("-> Entering Guessing Game");
                    playGuessingGame(sc);
                    int postChoice = postGameMenu(sc, "Guessing Game");
                    if (postChoice == 1) {
                        keepPlaying = true;
                    } else if (postChoice == 2) {
                        keepPlaying = false;
                    } else if (postChoice == 3) {
                        sc.close();
                        return;
                    }
                }
            } else if (choice == 2) {
                boolean keepPlaying = true;
                while (keepPlaying) {
                    System.out.println("-> Entering Rock-Paper-Scissors");
                    rockPaperScissorsPlaceholder(sc);
                    int postChoice = postGameMenu(sc, "Rock-Paper-Scissors");
                    if (postChoice == 1) {
                        keepPlaying = true;
                    } else if (postChoice == 2) {
                        keepPlaying = false;
                    } else if (postChoice == 3) {
                        sc.close();
                        return;
                    }
                }
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }

    /**
     * Displays a post-game menu after completing a game.
     * Provides options to play the same game again, return
     * to main menu, or exit. Validates user input and ensures
     * only valid choices (1-3) are accepted.
     * @param sc The Scanner object for reading user input
     * @param gameName The name of the game that was just played
     * @return An integer representing the user's choice.
     */
    public static int postGameMenu(java.util.Scanner sc, String gameName) {
        while (true) {
            System.out.println();
            System.out.println("=== End of " + gameName + " ===");
            System.out.println("1. Play again");
            System.out.println("2. Return to main menu");
            System.out.println("3. Exit program");
            System.out.print("Choice (1-3): ");

            int p = sc.nextInt();
            sc.nextLine();

            if (p == 1 || p == 2 || p == 3) {
                return p;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
    
    /**
     * Runs the Guessing Game where the player tries to guess
     * a random number. The computer genrates a random number between
     * 1 and 100. The player has 5 attempts to guess it correctly.
     * After each gues, the program provides feedback indicating whether
     * the guess was too high or too low.
     * 
     * Game Rules:
     * -Random number is between 1 and 100 (inclusive)
     * -Player has exactly 5 attempts
     * -Feedback is provided after each guess (too high/too low)
     * -Game ends when player guesses correctly or runs out of
     * attempts
     * 
     * @param sc The Scanner object for reading user input
     */
    public static void playGuessingGame(java.util.Scanner sc) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int attempts = 0;
        boolean hasWon = false;

        System.out.println("\n== Welcome to the Guessing Game!===");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.\n");

        while (attempts < maxAttempts && !hasWon) {
            attempts++;
            System.out.print("Attempt " + attempts + "/" + maxAttempts + " - Enter your guess: ");

            int guess = sc.nextInt();
            sc.nextLine();

            if (guess == numberToGuess) {
                hasWon = true;
                System.out.println("\nCongratulations! You guessed the number " + numberToGuess + " correctly!");
                System.out.println("It took you " + attempts + " attempt(s).");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (!hasWon) {
            System.out.println("\nSorry, you've run out of attempts!");
            System.out.println("The correct number was: " + numberToGuess);
        }
    }


    public static void rockPaperScissorsPlaceholder(java.util.Scanner sc) {
        java.util.Random rand = new java.util.Random();

        System.out.println();
        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter your choice: 1. paper, 2. scissors, 3. rock");

        int userChoice;
        while (true) {
            System.out.print("Choices 1-3: ");
            try {
                userChoice = sc.nextInt();
                sc.nextLine(); // consume newline
            } catch (java.util.InputMismatchException e) {
                sc.nextLine(); // clear invalid input
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                continue;
            }
            if (userChoice >= 1 && userChoice <= 3) {
                break;
            } else {
                System.out.println("Enter a number between 1 and 3.");
            }
        }

        int compChoice = rand.nextInt(3) + 1; 

        String userStr = (userChoice == 1) ? "paper" : (userChoice == 2) ? "scissors" : "rock";
        String compStr = (compChoice == 1) ? "paper" : (compChoice == 2) ? "scissors" : "rock";

        System.out.println("You chose: " + userStr);
        System.out.println("Computer chose: " + compStr);

        if (userChoice == compChoice) {
            System.out.println("Draw");
        } else if ((userChoice == 1 && compChoice == 3) || // paper beats rock
                   (userChoice == 2 && compChoice == 1) || // scissors beats paper
                   (userChoice == 3 && compChoice == 2)) { // rock beats scissors

      for (int i = 0; i < 3; i++) {
            System.out.println("Win!");
        }
     } else {
            System.out.println("You lost!");
        }
    }
    
}
