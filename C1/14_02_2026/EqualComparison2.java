import java.util.Scanner;

public class EqualComparison2 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int a, b;

            // First number validation
            while (true) {
                System.out.print("Enter first number: ");
                if (sc.hasNextInt()) {
                    a = sc.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter an integer.");
                    sc.next(); // remove wrong input
                }
            }

            // Second number validation
            while (true) {
                System.out.print("Enter second number: ");
                if (sc.hasNextInt()) {
                    b = sc.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter an integer.");
                    sc.next(); // remove wrong input
                }
            }

            String result = (a == b) ? "A is equal to B"
                    : (a > b) ? "A is greater than B"
                    : "A is less than B";

            System.out.println(result);
        }
    }
}
