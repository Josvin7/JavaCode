/**
 * @ClassName Interview10_2
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/11/19:38
 */
public class Interview10_2 {
    public static int numWays(int n) {
        //输入：n = 2
        //输出：2
        if (n < 2) {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2])%1000000007;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numWays(47));
    }
}
