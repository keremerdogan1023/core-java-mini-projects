//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double temperature;
        String unit;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter!");
        System.out.print("Enter the temperature value: ");
        temperature = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit): ");
        unit = scanner.nextLine().toUpperCase();
        double convertedTemperature = unit.equals("C") ? temperature : temperature * 1.8 + 32;
        String convertedUnit = unit.equals("C") ? "Fahrenheit" : "Celsius";
        System.out.printf("%.2f degrees %s is equal to %.2f degrees %s.\n", temperature, unit, convertedTemperature, convertedUnit);

    }
}