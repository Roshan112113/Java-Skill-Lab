import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int original = num;
        int res = 0;
        while (original > 0) {
            int lastdigi = original % 10;
            res = res * 10 + lastdigi;
            original /= 10;
        }
        if (res == num ) {
            System.out.println("The " +num + " is Palindrome number");
        }
        else{
            System.out.println("The " +num + " is Not Palindrome number");
     
       }
       sc.close(); 
    }
}
