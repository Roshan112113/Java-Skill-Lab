import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int Even = 0;
        int odd = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                Even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Even numbers: " + Even);
        System.out.println("Odd numbers: " + odd);

        sc.close();
    }
}