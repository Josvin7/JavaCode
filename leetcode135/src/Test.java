/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/24/10:36
 */
public class Test {
    public static int candy(int[] ratings) {
        int[] dp = new int[ratings.length];
        dp[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                dp[i] = dp[i-1] + 1;
            }else if(ratings[i] < ratings[i-1]){
                dp[i] = 1;
                if(dp[i] <= dp[i-1]) {
                    dp[i-1] += 1;
                }
            }
            else {
                dp[i] = 1;
            }
        }
        int sumMin = dp[0];
        for (int i = 1; i < dp.length; i++) {
            System.out.println(dp[i]);
            if(dp[i-1] == dp[i]) {
                dp[i-1] +=1;
            }
            System.out.println(dp[1]);
            sumMin += dp[i];
        }
        return sumMin;

    }

    public static void main(String[] args) {
        int[] rate = {1,2,87,87,87,2,1};
        System.out.println(candy(rate));
        System.out.println("------------");

    }
}
