import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = Integer.parseInt(scanner.nextLine());
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        final int zero = 0;

        switch (option) {
            case one:
                System.out.println("move up");
                break;
            case two:
                System.out.println("move down");
                break;
            case three:
                System.out.println("move left");
                break;
            case four:
                System.out.println("move right");
                break;
            case zero:
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}