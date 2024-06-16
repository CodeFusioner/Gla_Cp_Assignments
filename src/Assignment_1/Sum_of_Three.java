package Assignment_1;

public class Sum_of_Three {
    public static void main(String[] args) {
       Sum(15);
    }
    public static void Sum(int check){
        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;
        for(int i = 0;i<=9;i++){
            for(int j = i+1;j<=9;j++){
                for(int k = j+1;k<=9;k++){
                    int sum = i+j+k;
                    if(sum == check && i%3!=0 && j%3!=0 && k%3!=0  ){
                        ans1 = i;
                        ans2 = j;
                        ans3 = k;
                }
            }
            }
        }
        System.out.println(ans1+" "+ans2+" "+ans3);
    }
}
