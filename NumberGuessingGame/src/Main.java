import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int actualNumber = rand.nextInt(1,101);
        int userGuess = 0;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        do{
            System.out.println("Enter your guess (between 1 and 100): ");
            userGuess = scanner.nextInt();
            attempts++;
            if(userGuess > actualNumber){
                System.out.println("Your guess is too high. Try again.");
            } else if(userGuess < actualNumber){
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Correct! You've guessed the number.");
            }
        }while (userGuess != actualNumber);
        scanner.close();
    }
}
