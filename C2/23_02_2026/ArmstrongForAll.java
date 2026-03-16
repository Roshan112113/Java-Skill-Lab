import java.util.Scanner;

public class ArmstrongForAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        int digits = 0;

        int temp = num;

        while(temp > 0){
            digits++;
            temp /= 10;
        }

        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit , digits);  
            temp /= 10;                       
        }

        if (original == sum) {
            System.out.println("The " + original + " is Armstrong number");
        } else {
            System.out.println("The " + original + " is Not Armstrong number");
        }

        sc.close();
    }
}