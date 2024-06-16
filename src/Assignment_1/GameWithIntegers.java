package Assignment_1;

import java.util.Scanner;

public class GameWithIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (vanyaWins(n)) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }

    public static boolean vanyaWins(int n) {
        for (int move = 1; move <= 10; move++) {
            if ((n + 1) % 3 == 0 || (n - 1) % 3 == 0) {
                return true;
            }
            n = (n % 3 == 1) ? n - 1 : n + 1;
        }
        return false;
    }
}

