import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= num; i++) {
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;

        }
        sc.close();
    }
}
