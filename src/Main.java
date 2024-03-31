import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextFloat();

        System.out.println("Enter b: ");
        double b = scanner.nextFloat();

        System.out.println("Enter c: ");
        double c = scanner.nextFloat();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Equation pass with x = %f" + answer);
        } else if (b == c) {
            System.out.println("The solution is all x!");
        } else {
            System.out.println("Entered value is invalid!");

        }
    }
}
