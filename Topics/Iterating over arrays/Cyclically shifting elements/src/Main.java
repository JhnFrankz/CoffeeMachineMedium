import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }

        int[] x = new int[size];
        System.arraycopy(a, 0, x, 1, size - 1);
        x[0] = a[size - 1];

        for (int i : x) {
            System.out.print(i + " ");
        }
    }
}