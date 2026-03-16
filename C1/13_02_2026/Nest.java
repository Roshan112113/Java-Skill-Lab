import java.util.*;

public class Nest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("Number are negative..");
        }else{
            if (age % 2==0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}