package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int water = 0;
    private static int milk = 0;
    private static int beans = 0;
    private static int cups = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        water = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milk = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        beans = Integer.parseInt(scanner.nextLine());

        System.out.println("Write how many cups of coffee you will need: ");
        cups = Integer.parseInt(scanner.nextLine());

        int totalCups = calculateCupsOfCoffee();

        if (totalCups < cups) {
            System.out.println("No, I can make only " + totalCups + " cup(s) of coffee");
        } else if (totalCups == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (totalCups - cups) + " more than that)");
        }

        /*
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        int water = cups * 200;
        int milk = cups * 50;
        int beans = cups * 15;

        System.out.printf("For %d cups of coffee you will need:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n", cups, water, milk, beans);

         */
    }

    private static int calculateCupsOfCoffee() {
        int count = 0;

        while (water >= 200 && milk >= 50 && beans >= 15) {
            water -= 200;
            milk -= 50;
            beans -= 15;
            count++;
        }

        return count;
    }
}
