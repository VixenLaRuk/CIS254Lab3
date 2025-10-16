/**
 * This program consist of a guessing game and a rock-paper-scissor game.
 * @author Vixen La Ruk
 * @author Edisson Ajciginac
 * @since 10/15/2025
 */
public class Lab3 {

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
                System.out.println("-> Entering Guessing Game");
                // 
                // 
                if (postGameMenu(sc, "Guessing Game")) break;
            } else if (choice == 2) {
                System.out.println("-> Entering Rock-Paper-Scissors");
                //

                rockPaperScissorsPlaceholder(sc);
                if (postGameMenu(sc, "Rock-Paper-Scissors")) break;
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }

    // Menu
    public static boolean postGameMenu(java.util.Scanner sc, String gameName) {
        while (true) {
            System.out.println();
            System.out.println("=== " + gameName + " - Post Game ===");
            System.out.println("1. Play the same game again");
            System.out.println("2. Return to Main Menu");
            System.out.println("3. Exit program");
            System.out.print("Choice (1-3): ");

            int p = sc.nextInt();
            sc.nextLine();

            if (p == 1) {
                System.out.println("Playing another round of " + gameName + " (SIMULATION)...");
                return false; //simulated one more round
            } else if (p == 2) {
                System.out.println("Returning to Main Menu...");
                return false; // back to main menu
            } else if (p == 3) {
                System.out.println("Exiting program. Bye!");
                return true; //exit program
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // 
    // Vixen
    // 

    //
    public static void rockPaperScissorsPlaceholder(java.util.Scanner sc) {
        
    }

}
