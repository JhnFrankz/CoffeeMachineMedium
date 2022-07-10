import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomType = scanner.nextLine();
        double a;
        double b;
        double c;
        double result = 0;
        final double pi = 3.14;

        switch (roomType) {
            case "triangle":
                a = Double.parseDouble(scanner.nextLine());
                b = Double.parseDouble(scanner.nextLine());
                c = Double.parseDouble(scanner.nextLine());
                double s = (a + b + c) / 2;
                result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
            case "rectangle":
                a = Double.parseDouble(scanner.nextLine());
                b = Double.parseDouble(scanner.nextLine());
                result = a * b;
                break;
            case "circle":
                a = Double.parseDouble(scanner.nextLine());
                result = a * a * pi;
                break;
            default:
                break;
        }

        System.out.println(result);
    }
}