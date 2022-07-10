package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static Scanner scanner = new Scanner(System.in);
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {

        startMachine();

        /*System.out.println("Write how many ml of water the coffee machine has: ");
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
            System.out.println("Yes, I can make that amount of coffee (and even "
                    + (totalCups - cups) + " more than that)");
        }*/

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

    private static void startMachine() {
        showStateMachine();
        readAction();
    }

    private static void showStateMachine() {
        System.out.printf("The coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n", water, milk, beans, cups, money);
    }

    private static void readAction() {
        System.out.println("\nWrite action (buy, fill, take): ");
        String option = scanner.nextLine();

        switch (option) {
            case "buy":
                buy();
                showStateMachine();
                break;
            case "fill":
                fill();
                showStateMachine();
                break;
            case "take":
                take();
                showStateMachine();
                break;
            default:
                break;
        }
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int option = Integer.parseInt(scanner.nextLine());

        switch (option) {
            case 1:
                water -= 250;
                beans -= 16;
                money += 4;
                cups--;
                break;
            case 2:
                water -= 350;
                milk -= 75;
                beans -= 20;
                money += 7;
                cups--;
                break;
            case 3:
                water -= 200;
                milk -= 100;
                beans -= 12;
                money += 6;
                cups--;
                break;
            default:
                break;
        }

        System.out.println();
    }

    private static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int addWater = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBeans = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addCups = Integer.parseInt(scanner.nextLine());

        water += addWater;
        milk += addMilk;
        beans += addBeans;
        cups += addCups;
    }

    private static void take() {
        System.out.printf("I gave you $%d\n\n", money);
        money = 0;
    }

    /*private static int calculateCupsOfCoffee() {
        int count = 0;

        while (water >= 200 && milk >= 50 && beans >= 15) {
            water -= 200;
            milk -= 50;
            beans -= 15;
            count++;
        }

        return count;
    }*/
}
