/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/10/21:10
 */
public class Test {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1){
            return 0;
        }
        int len = prices.length;
        int[][] dp0 = new int[len][3];// dp0[i][j] 第 i 天最大交易次数为 j 不持有股票的最大收益
        int[][] dp1 = new int[len][3];// dp1[i][j] 第 i 天最大交易次数为 j 持有股票的最大收益

        // dp0初始化为0
        //dp1第一行初始化为0 - prices[0]
        for (int i = 0; i <= 2; i++) {
            dp1[0][i] = 0 - prices[0];
        }
        //dp1第一列没有用到不需要做处理
        //在这里需要双层循环更新，把第一天的两个数组都更新完毕，才能跟新第二天。两张表是关联的。
        //我觉得还可以使用三维数组，有大佬可以试试然后交流交流
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j < 3; j++) {
                dp0[i][j] = Math.max(dp0[i - 1][j], dp1[i - 1][j] + prices[i]);
                dp1[i][j] = Math.max(dp0[i-1][j-1] - prices[i],dp1[i-1][j]);
            }
        }
        return dp0[prices.length-1][2];


    }
}
