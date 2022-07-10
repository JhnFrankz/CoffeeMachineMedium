import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;

        switch (option) {
            case one:
                System.out.println("You have chosen a square");
                break;
            case two:
                System.out.println("You have chosen a circle");
                break;
            case three:
                System.out.println("You have chosen a triangle");
                break;
            case four:
                System.out.println("You have chosen a rhombus");
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }
    }
}