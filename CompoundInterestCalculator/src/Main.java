//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double principal;
        double interestRate;
        int compoundYears;
        int years;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the principal amount (initial investment): ");
        principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (as a percentage): ");
        interestRate = scanner.nextDouble();
        System.out.print("Enter the number of times interest is compounded per year: ");
        compoundYears = scanner.nextInt();
        System.out.print("Enter the number of years the money is invested or borrowed: ");
        years = scanner.nextInt();
        scanner.close();
        // Convert interest rate from percentage to decimal
        double rateDecimal = interestRate / 100.0;
        // Calculate the compound interest
        double amount = principal * Math.pow((1 + rateDecimal / compoundYears), compoundYears * years);
        // Calculate the total amount after interest
        double totalAmount = amount;
        // Calculate the interest earned
        double interestEarned = totalAmount - principal;
        // Display the results
        System.out.printf("Total amount after %d years: $%.2f\n", years, totalAmount);
        System.out.printf("Interest earned over %d years: $%.2f\n", years, interestEarned);
        System.out.printf("Total amount after %d years with %.2f%% interest rate compounded %d times per year: $%.2f\n",
                years, interestRate, compoundYears, totalAmount);
        System.out.printf("Total interest earned over %d years: $%.2f\n", years, interestEarned);
        System.out.println("Thank you for using the Compound Interest Calculator!");


    }
}