import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isprime = true;
        System.out.print("Enter the number ");
        int val = sc.nextInt();

        if(val<=1){
            isprime = false;
        }

        for(int i=2;i<val;i++){
            if(val%i==0){
                isprime = false;
                break;
            }
        }

        if(isprime){
            System.out.println("Prime number ");
        }else{
            System.out.println("Not a prime number");
        }
        sc.close();
    }
}