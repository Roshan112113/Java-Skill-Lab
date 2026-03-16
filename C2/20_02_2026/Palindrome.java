public class Palindrome {
    
    public static void main(String[] args) {
        int num = 121;

        int original = num;
        int res = 0;
        while (original > 0) {
            int lastdigi = original % 10;
            res = res * 10 + lastdigi;
            original /= 10;
        }

        if(num == res){
            System.out.println("Palindrone " + res);
        }else{
            System.out.println("Not Palindrone " + res);
        }
    }
}
