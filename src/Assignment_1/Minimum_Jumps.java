package Assignment_1;

public class Minimum_Jumps {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(jumps(arr, 11));
    }

    public static int jumps(int[] arr, int n) {
        int count = 0;
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {

            if (count < n && arr[count] == i) {
                count = count + i;
                ans++;
            }
        }
        return ans;
    }
}
