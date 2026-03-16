import java.util.Scanner;
public class Loan_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of customer: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter customer " + i + " Details: ");
            System.out.print("Enter Age: ");
            int Age = sc.nextInt();
            System.out.print("Enter Monthly Income: ");
            double Income = sc.nextDouble();
            System.out.print("Enter Credit Score : ");
            int cs = sc.nextInt();
            boolean eligible = true;
            if (Age < 21) {
                System.out.println("Customer " + i + " Age is under 21");
                eligible = false;
            }
            if (Age > 60) {
                System.out.println("Customer " + i + " Age is over 60");
                eligible = false;
            }
            if (Income <= 30000) {
                System.out.println("Customer " + i + " Monthly Income is under 30000");
                eligible = false;
            }
            if (cs <= 700) {
                System.out.println("Customer " + i + " Credit Score is under 700");
                eligible = false;
            }
            if (eligible) {
                System.out.println("Customer " + i + " is Eligible for the loan");
            } else {
                System.out.println("Customer " + i + " is NOT Eligible for the loan");
            }
        } sc.close();
    }
}