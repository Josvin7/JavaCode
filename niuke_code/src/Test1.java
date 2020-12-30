import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Test1
 * @Description 换钱的最小货币数
 * @Author fff
 * @Date 2020/12/21/11:41
 */
public class Test1 {
    /*
    3 20
    5 2 3
    */
    private static int coinChange(int[] num, int amount) {
        //动态规划
        int[] dp = new int[amount + 1];
        dp[0]  = 0;

        for (int i = num[0]; i < dp.length; i++) {

            dp[i] = 1000;
            for (int j = 0; j < num.length; j++) {
                if (i >= num[j] && dp[i - num[j]] != 1000) {
                    dp[i] = Math.min(dp[i],dp[i - num[j]] + 1);// dp[i - num[j]] + 1其中1就是使用num[j]这张，在加dp[剩余钱数]
                }
            }
        }
        return dp[amount] >= 1000 ? -1:dp[amount];



    }
    public static int coinChange1(int[] nums, int amount) {
        int[] dp = new int[amount + 1]; //dp[i]表示i时所需要的最少的货币数
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = 1000;
            // 5 2 3
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j] && dp[i - nums[j]] != 1000) {
                    dp[i] = Math.min(dp[i], dp[i - nums[j]] + 1);
                }
            }
            System.out.println(i+"===" +dp[i]);
        }
        if (dp[amount] == 1000) {
            return -1;
        } else {
            return dp[amount];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int amount = Integer.parseInt(str[1]);
        int[] num = new int[n];
        //String[] str1 = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println( coinChange(num , amount));
    }
}
