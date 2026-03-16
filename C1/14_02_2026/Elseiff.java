import java.util.Scanner;

public class Elseiff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("A is equal to B");
        } 
        else if (a > b) {
            System.out.println("A is greater than B");
        } 
        else {
            System.out.println("A is less than B");
        }

        sc.close();
    }
}
