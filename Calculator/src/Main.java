import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result = 0.0;
        boolean validOperation = true;
        System.out.println("Welcome to the Calculator!");
        System.out.print("Enter the operation you want to perform(e.g., +, -, *, /); ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by 0");
                    validOperation = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            default -> System.out.println("Invalid operator!");

        }
        if (validOperation) {
            System.out.println(result);
        }
    }
}