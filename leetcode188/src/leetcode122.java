/**
 * @ClassName leetcode122
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/28/16:45
 */
public class leetcode122 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] dp = new int[len][2];
        //dp[i][0] 表示第i天不持有股票，收获最大利润
        //dp[i][1] 表示第i天持有股票，收获的最大利润
        dp[0][0] = 0;
        dp[0][1] = 0 - prices[0];

        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][0] - prices[i],dp[i-1][1]);
        }
        return dp[len - 1][0];


    }
}
