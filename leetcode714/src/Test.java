import java.util.Arrays;

/**
 * @ClassName Test
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/19/10:57
 */
public class Test {
    public static int maxProfit(int[] prices, int fee) {
        // 使用辅助数组dp【】 在这里每个元素都表示前i天的最大利润
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;//手中没有股票
        dp[0][1] = 0 - prices[0];//手中有股票

        for (int i = 1; i < prices.length; i++) {

            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i] - fee);/// 第i天手中没有股票
            dp[i][1] = Math.max(dp[i-1][0] - prices[i],dp[i-1][1]);

           System.out.println(dp[i][0]);
        }
        return dp[prices.length-1][0];

    }

    public static void main(String[] args) {
        int[] an = {1,3,2,8,4,4};
        int fee = 2;
       maxProfit(an, fee);
    }
}
