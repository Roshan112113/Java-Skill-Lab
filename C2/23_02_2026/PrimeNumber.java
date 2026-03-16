import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("The " + num + " is not prime number");
        } else {
            System.out.println("The " + num + " is prime number");

        }

        sc.close();
    }
}
