import java.util.Scanner;
public class Attended_Calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int Total_Class = 100;
        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter Student " + i + " Details:");
            System.out.print("Enter Roll No: ");
            int Roll_no = sc.nextInt();
            System.out.print("Enter Classes Attended: ");
            int Class_Attended = sc.nextInt();
            double Percentage = ((double) Class_Attended / Total_Class) * 100;
            boolean Eligible;
            if (Percentage >= 75) {
                Eligible = true;
            } else {
                Eligible = false;
            }
            System.out.println("\n--- Student " + i + " Details ---");
            System.out.println("Roll No: " + Roll_no);
            System.out.println("Attendance Percentage: " + Percentage + "%");
            if (Eligible) {
                System.out.println("Eligibility Status: Eligible for Exam");
            } else {
                System.out.println("Eligibility Status: Not Eligible for Exam");
            }
        }
        sc.close();
    }
}