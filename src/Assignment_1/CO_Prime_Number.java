package Assignment_1;

public class CO_Prime_Number {
    public static void main(String[] args) {
        int [] arr = {5,10,20};
        System.out.println(print(arr));
    }
    public static int print(int [] arr){
        int count  = 0;
            for(int i = 0;i<arr.length-1;i++) {
                if(GCD(arr[i] , arr[i+1]) != 1){
                    count++;
                }
            }
        return count;
    }
    public static int GCD(int divisor, int divident) {
        while (divident % divisor != 0) {
            int rem = divident % divisor;
            divident = divisor;
            divisor = rem;
        }
        return divisor;
    }


}
