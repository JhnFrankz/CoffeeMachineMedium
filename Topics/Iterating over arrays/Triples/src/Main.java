import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];
        int con = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(scanner.next());
        }

        for (int i = 2; i < size; i++) {
            if (numbers[i] == numbers[i - 1] + 1 &&
                    numbers[i] == numbers[i - 2] + 2) {
                con++;
            }
        }

        System.out.println(con);
    }
}