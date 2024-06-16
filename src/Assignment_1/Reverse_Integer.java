package Assignment_1;

public class Reverse_Integer {
    public static void main(String[] args) {
        int n = 321;
        System.out.println(reverse(n));
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }
}
