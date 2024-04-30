package g;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

  public  void playGame() {
    Random random = new Random();
    int correctNumber = random.nextInt(3); // Generate random number between 0 and 2

    Scanner userInput = new Scanner(System.in);
    int attempts = 0; // Keep track of attempts
    final int maxAttempts = 4; // Set maximum attempts

    System.out.println("Welcome to the Guessing Game!");
    System.out.println("I'm thinking of a number between 0 and 2. Guess what it is!");

    while (attempts < maxAttempts) {
      attempts++;

      System.out.print("Enter your guess (" + attempts + "/" + maxAttempts + "): ");
      int guess;

      // Input Validation (check for valid integer)
      try {
        guess = Integer.parseInt(userInput.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a number between 0 and 2.");
        continue; // Skip to the next iteration of the loop if input is invalid
      }

      if (guess == correctNumber) {
        System.out.println("Congratulations! You guessed the number in " + attempts + " tries.");
        break; // Exit the loop if guess is correct
      } else {
        System.out.println("Sorry, that's not the correct number.");
        if (guess < correctNumber) {
          System.out.println("Try a higher number.");
        } else {
          System.out.println("Try a lower number.");
        }
      }
    }

    if (attempts == maxAttempts) {
      System.out.println("Game over! The number was " + correctNumber + ".");
    }
  }
}
