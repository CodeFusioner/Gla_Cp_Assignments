package Assignment_1;

public class LCM_AND_GCD {
    public static void main(String[] args) {
        System.out.println(GCD(7,28));
        System.out.println(LCM(5, 10));
    }

    public static int GCD(int divisor, int divident) {
        while (divident % divisor != 0) {
            int rem = divident % divisor;
            divident = divisor;
            divisor = rem;
        }
        return divisor;
    }

    public static long LCM(int a, int b) {
        long ans = (long) (a * b) / GCD(a, b);
        return ans;
    }
}
