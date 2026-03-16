public class Bitwise {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        int result1 = a + b;
        int result2 = a & b;
        int result3 = a | b;
        int result4 = a ^ b;
        int result5 = ~a;
        int result6 = a << 1;
        int result7 = a >> 1;

        System.out.println("Addition: " + result1);
        System.out.println("Bitwise AND: " + result2);
        System.out.println("Bitwise OR: " + result3);
        System.out.println("Bitwise XOR: " + result4);
        System.out.println("Bitwise NOT (~a): " + result5);
        System.out.println("Left Shift (a<<1): " + result6);
        System.out.println("Right Shift (a>>1): " + result7);

    }
}