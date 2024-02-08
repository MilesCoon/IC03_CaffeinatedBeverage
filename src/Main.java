import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Creates array that stores both Coffee and EnergyDrink
        CaffeinatedBeverage[] order = new CaffeinatedBeverage[10];

        int choice, ounces, count=0;
        String name, flavor, roastType;
        double price;
        // do/while
        do {
            System.out.println("\nWelcome to the Caffeine Shoppe!");
            System.out.println("Enter (1) for Coffee");
            System.out.println("Enter (2) for Energy Drink");
            System.out.println("Enter (3) to check out");
            System.out.println(">> ");
            choice = keyboard.nextInt();

            // Decision for user's choice
            switch (choice) {
                case 1: // Coffee
                    System.out.print("Enter name   : ");
                    keyboard.nextLine();
                    name = keyboard.nextLine();
                    System.out.print("Enter ounces : ");
                    ounces = keyboard.nextInt();
                    System.out.print("Enter price $: ");
                    price = keyboard.nextDouble();
                    System.out.print("Enter roast  : ");
                    keyboard.nextLine();
                    roastType = keyboard.nextLine();
                    // Create a new EnergyDrink object
                    // Put it into the array
                    // Count goes up by 1
                    order[count++] = new Coffee(name, ounces, price, roastType);
                    break;
                case 2: // Energy Drinks
                    System.out.print("Enter name   : ");
                    keyboard.nextLine();
                    name = keyboard.nextLine();
                    System.out.print("Enter ounces : ");
                    ounces = keyboard.nextInt();
                    System.out.print("Enter price $: ");
                    price = keyboard.nextDouble();
                    System.out.print("Enter flavor  : ");
                    keyboard.nextLine();
                    flavor = keyboard.nextLine();
                    // Create a new EnergyDrink object
                    // Put it into the array
                    // Count goes up by 1
                    order[count++] = new Coffee(name, ounces, price, flavor);
                    break;
                case 3: // Check Out
                    break;
                default: // Everything else
            }

        } while(choice != 3);
        // while = "keep looping as long as this is true"
        double avgPrice = findAveragePrice(order, count);
        EnergyDrink maxDrink = findHPED(order, count);

        System.out.println("The average price of the drinks in your order is: " + avgPrice +
                " and the highest priced Energy Drink is " + maxDrink);
    }

    public static double findAveragePrice(CaffeinatedBeverage[] inventory, int count) {
        // Add the prices of each beverage up
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += inventory[i].getPrice();
        }
        // Divide by the count
        return total/count;
    }

    // TO-DO:
    public static EnergyDrink findHPED(CaffeinatedBeverage[] inventory, int count) {
        EnergyDrink maxDrink = null;
        double maxPrice = Double.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (inventory[i] instanceof EnergyDrink == true && inventory[i].getPrice() > maxPrice) {
                maxPrice = inventory[i].getPrice();
                maxDrink = (EnergyDrink)inventory[i];
            }
        }
        return maxDrink;
    }
}