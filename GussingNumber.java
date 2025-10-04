import java.util.Scanner;
import java.util.Random;

public class GussingNumber {

    public static void main(String[] args) {

        Scanner bin = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = bin.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Please guess a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " );
                break;
            }

        }

        bin.close();

    }


    
}
