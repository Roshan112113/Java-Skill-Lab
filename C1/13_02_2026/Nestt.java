import java.util.*;

public class Nestt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x > 0) {
            if (x % 2 == 0) {
                System.out.println("Even..."); 
            } else {
                System.out.println("Odd...");
            }
        } 
        else {
			if (x < 0 ) {
				System.out.println("Negative ..");
			} else {
				System.out.println("Zero... ");
			}
        } 
    }
}
