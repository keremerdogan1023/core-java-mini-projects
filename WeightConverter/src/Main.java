//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double weightInKg;
        double weightInPounds;
        int option;
        System.out.println("Welcome to the Weight Converter!");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("1: Convert kilograms to pounds\n" +
                         "2: Convert pounds to kilograms\n" +
                         "Please select an option (1 or 2): ");
        option = scanner.nextInt();
        if (option == 1) {
            System.out.print("Enter weight in kilograms: ");
            weightInKg = scanner.nextDouble();
            weightInPounds = weightInKg * 2.20462;
            System.out.printf("%.2f kilograms is equal to %.2f pounds.\n", weightInKg, weightInPounds);
        } else if (option == 2) {
            System.out.print("Enter weight in pounds: ");
            weightInPounds = scanner.nextDouble();
            weightInKg = weightInPounds / 2.20462;
            System.out.printf("%.2f pounds is equal to %.2f kilograms.\n", weightInPounds, weightInKg);
        } else {
            System.out.println("Invalid option selected.");
        }
        System.out.println("Thank you for using the Weight Converter!");
    }
}