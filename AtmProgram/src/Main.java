import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int choice;
        System.out.println("Welcome to the ATM Program!");
        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();
        String correctPin = "1234"; // Example PIN, in a real application this would be securely stored
        while (!isValidPin(pin)) {
            System.out.println("Invalid PIN. Please enter a 4-digit PIN.");
            System.out.print("Enter your PIN: ");
            pin = scanner.nextLine();
            while(!pin.equals(correctPin)) {
                System.out.println("Incorrect PIN. Please try again.");
                System.out.print("Enter your PIN: ");
                pin = scanner.nextLine();
            }

        }
            System.out.println("PIN accepted. Welcome to your account!");
            double balance = 900.00;
            while(isRunning){
                System.out.println("***************");
                System.out.println("BANKING PROGRAM");
                System.out.println("***************");
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("***************");

                System.out.print("Enter your choice (1-4): ");
                choice = scanner.nextInt();
                switch (choice){
                    case 1 -> showBalance(balance);
                    case 2 -> deposit(balance);
                    case 3 -> withdraw(balance);
                    case 4 -> isRunning = false;
                    default -> System.out.println("Invalid choice. Please try again.");
                }

            }
            System.out.println("Thank you for using the ATM Program. Goodbye!");
        scanner.close();
    }
    static boolean isValidPin(String pin) {
        // Check if the PIN is exactly 4 digits
        return pin.matches("\\d{4}");
    }
    static double withdraw(double balance){
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        amount = scanner.nextDouble();
        if(amount <= 0){
            System.out.println("Invalid amount. Please enter a positive number.");
            return balance;
        }
        if(amount > balance){
            System.out.println("Insufficient funds. Your current balance is: " + balance);
            return balance;
        }
        System.out.println("Withdrawal successful. You withdrew: " + amount);
        showBalance(balance - amount);
        return balance - amount;

    }
    static double deposit(double balance){
        double amount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount <= 0){
            System.out.println("Invalid amount. Please enter a positive number.");
            return balance;
        }
        System.out.println("You have successfully deposited: " + amount);
        showBalance(balance + amount);
        return balance + amount;
    }
    static void showBalance(double balance){
        System.out.println("Your current balance is: " + balance);
    }
}
