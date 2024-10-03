
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final double SHIP_RATE = 0.02;
        final double FREE_SHIP = 100;
        double shipCost = 0;
        double itemPrice = 0.0;
        double totalCost = 0.0;
        String trash = "";

        System.out.println("Enter the item price: ");
        if (console.hasNextDouble()) {
            itemPrice = console.nextDouble();
            console.nextLine();
            if (itemPrice >= FREE_SHIP) {
                shipCost = 0;
                totalCost = itemPrice;
            } else {
                shipCost = SHIP_RATE * itemPrice;
                totalCost = itemPrice + shipCost;
            }
            System.out.println("the shipping cost is " + shipCost);
            System.out.println("the total cost is " + totalCost);
        } else {
            trash = console.nextLine();
            System.out.println("You entered" + trash + "not a number!");
            System.out.println("Please run the program again and enter a valid number!");
        }
    }
}