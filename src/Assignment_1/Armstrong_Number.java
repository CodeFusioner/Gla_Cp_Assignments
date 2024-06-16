package Assignment_1;

public class Armstrong_Number {
    public static void main(String[] args) {
        System.out.println(Armstrong(153));
    }

    public static boolean Armstrong(int n) {
        int org1 = n;
        int org2 = n;
        int sum = 0;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            count++;
        }
        while (org2 > 0) {
            int rem = org2 % 10;
            sum += Math.pow(rem, count);
            org2 = org2 / 10;
        }
        if (sum == org1) {
            return true;
        } else {
            return false;
        }
    }
}
