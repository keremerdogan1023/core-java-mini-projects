import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[] moves = {"rock", "paper", "scissors"};
        String playersChoice;
        String computersChoice;
        boolean continueGame = true;
        String choice = "";
        System.out.println("Welcome to the rock paper scissors!");
        do {
            System.out.println("Please enter your choice: ");
            playersChoice = scanner.nextLine();
            playersChoice = playersChoice.toLowerCase();
            if (!playersChoice.equals("rock") && !playersChoice.equals("scissors") && !playersChoice.equals("paper")) {
                System.out.println("Invalid choice. Try again.");
            }
            else{
                computersChoice = moves[rand.nextInt(moves.length)];
                if (computersChoice.equals(playersChoice)) {
                    System.out.println("It's a tie!");
                } else if (playersChoice.equals("rock") && computersChoice.equals("scissors")
                || playersChoice.equals("paper") && computersChoice.equals("rock")
                || playersChoice.equals("scissors") && computersChoice.equals("paper")) {
                    System.out.println("You chose " + playersChoice + " and the computer chose " + computersChoice + ". You Win!");
                }
                else {
                    System.out.println("You chose " + playersChoice + " and the computer chose " + computersChoice + ". You Lose!");
                }
            }
            System.out.println("Would you like to play again? (Y/N)");
            choice = scanner.nextLine();
            choice = choice.toUpperCase();
            if (choice.equals("Y")) {
                continueGame = true;
            } else if (choice.equals("N")) {
                continueGame = false;
                System.out.println("Thank you for playing!");
            } else {
                System.out.println("Invalid choice. Exiting the game.");
                continueGame = false;
                
            }
        }while (continueGame);
        scanner.close();
    }
}
