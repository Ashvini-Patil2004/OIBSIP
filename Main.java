import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int round = 1;
        int totalRounds = 0;
        int totalAttempts = 0;

        System.out.println("=================================");
        System.out.println("     NUMBER GUESSING GAME");
        System.out.println("=================================");

        boolean playAgain = true;

        while (playAgain) {

            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + round);
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid number!");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();
                attempts++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                if (guess < secretNumber) {
                    System.out.println("Too Low!");

                } else if (guess > secretNumber) {
                    System.out.println("Too High!");

                } else {
                    System.out.println("Correct!");
                    System.out.println("You guessed the number in "
                            + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                }

                System.out.println("Attempts remaining: "
                        + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("\nYou Lost!");
                System.out.println("The correct number was: " + secretNumber);
            }

            totalRounds++;
            totalAttempts += attempts;

            System.out.println("\n---------------------------------");
            System.out.println("Round " + round + " completed.");
            System.out.println("Attempts used: " + attempts);
            System.out.println("---------------------------------");

            System.out.print("\nDo you want to play again? (Y/N): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("Y")) {
                round++;
            } else {
                playAgain = false;
            }
        }

        System.out.println("\n=================================");
        System.out.println("          GAME SUMMARY");
        System.out.println("=================================");
        System.out.println("Total Rounds: " + totalRounds);
        System.out.println("Total Attempts: " + totalAttempts);
        System.out.println("Thank you for playing!");
        System.out.println("=================================");

        scanner.close();
    }
}