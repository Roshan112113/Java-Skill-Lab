public class DemoArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        System.out.println("Size of array is " + arr.length);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int avg = sum / arr.length;

        System.out.println("Avg is " + avg);
    }
}