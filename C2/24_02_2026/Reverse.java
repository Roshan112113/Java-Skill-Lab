import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int original = num;
        int res = 0;

        while (original > 0) {
            int lastDigit = original % 10;
            res = res * 10 + lastDigit;
            original /= 10;
        }

        System.out.println("The reverse of " + num + " is " + res);

        sc.close(); 
    }
}