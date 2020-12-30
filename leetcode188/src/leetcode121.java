import java.util.Arrays;

/**
 * @ClassName leetcode121
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/28/16:58
 */
public class leetcode121 {

    public int maxProfit1(int[] prices) {
        //       [7,1,5,3,6,4]
        if (prices.length <= 0) {
            return 0;
        }
        int len = prices.length;
        int max = 0;
        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < i ; j++) {
                max = Math.max(prices[i] - prices[j], max);
            }
        }
        return max;

    }













    public int maxProfit(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }
        int len = prices.length;
        int[] dp0 = new int[len];// 当天不持有最大利润
        int[] dp1 = new int[len];// 当天持有
        dp0[0] = 0;
        dp1[0] = 0 - prices[0];
        for (int i = 1; i < len; i++) {
            dp0[i] = Math.max(dp0[i - 1], dp1[i - 1] + prices[i]);
            dp1[i] = Math.max(0 - prices[i], dp1[i-1]);
        }
        return dp0[len - 1];
    }
}
