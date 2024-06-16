package Assignment_1;

public class Palindrome_Number {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
        int rev = 0;
        int org = x;
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }
        if (rev == org) {
            return true;
        }
        return false;
    }
}
