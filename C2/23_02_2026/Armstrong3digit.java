import java.util.Scanner;

public class Armstrong3digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            sum = sum + (digit * digit * digit);
            num /= 10;
        }
        if (original == sum) {
            System.out.println("The " + original + " is Armstrong number");
        } else {
            System.out.println("The " + original + " is Not Armstrong number");
        }
        sc.close();
    }
}
