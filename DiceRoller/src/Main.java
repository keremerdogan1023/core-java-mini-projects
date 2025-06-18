import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberOfDice;
        int totalRoll = 0;
        System.out.println("Welcome to the Dice Roller!");
        System.out.print("Enter the number of dice you want to roll: ");
        numberOfDice = scanner.nextInt();
        if(numberOfDice >0){
            for(int i = 1; i<= numberOfDice; i++){
                int diceRoll = rand.nextInt(1,7);
                System.out.println("Rolling dice " + i + ":");
                Thread.sleep(500); // Simulate a delay for rolling the dice
                System.out.println("You rolled a " + diceRoll + "!");
                printDice(diceRoll);
                totalRoll += diceRoll;
            }
            System.out.println("Total roll: " + totalRoll);
        } else {
            System.out.println("Please enter a valid number of dice to roll (greater than 0).");
        }
        scanner.close();

    }
    static void printDice(int roll){

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }
    }
}
