import java.util.Scanner;

public class  Shot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        String result = (a == b) ? "A is equal to B" 
                        : (a > b) ? "A is greater than B" 
                        : "A is less than B";

        System.out.println(result);

        sc.close();
    }
}
