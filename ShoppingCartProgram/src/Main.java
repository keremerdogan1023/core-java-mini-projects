import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        double total = 0.0;
        int quantity;
        System.out.print("Which item would you like to add to your cart? ");
        item = sc.nextLine();
        System.out.print("What is the price of " + item + "? ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.print("How many " + item + "s would you like to add? ");
        quantity = sc.nextInt();
        sc.nextLine();
        total += price * quantity;
        System.out.println("\nYou have added " + quantity + " " + item + "(s) to your cart.");
        System.out.printf("The total price for %d %s(s) at $%.2f each is $%.2f.\n", quantity, item, price, total);


        sc.close();
    }
}