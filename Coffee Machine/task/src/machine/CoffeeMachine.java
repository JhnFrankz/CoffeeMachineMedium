package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        int water = cups * 200;
        int milk = cups * 50;
        int beans = cups * 15;

        System.out.printf("For %d cups of coffee you will need:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n", cups, water, milk, beans);
    }
}
