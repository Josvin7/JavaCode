/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/28/11:06
 */
public class Test {
    public int maxProfit(int k, int[] prices) {
        /*
        * 输入：k = 2, prices = [3,2,6,5,0,3]
        * 输出：7
        * */
        if(k == 0 || prices.length <= 1){
            return 0;
        }
        int len = prices.length;
        int[][] dp0 = new int[len][k + 1];
        int[][] dp1 = new int[len][k + 1];

        // dp0初始化为0
        //dp1第一行初始化为0 - prices[0]
        for (int i = 0; i <= k; i++) {
            dp1[0][i] = 0 - prices[0];
        }
        //dp1第一列没有用到不需要做处理

        //在这里需要双层循环更新，把第一天的两个数组都更新完毕，才能跟新第二天。两张表是关联的。
        //我觉得还可以使用三维数组，有大佬可以试试然后交流交流
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j < k + 1; j++) {
                dp0[i][j] = Math.max(dp0[i - 1][j], dp1[i - 1][j] + prices[i]);
                dp1[i][j] = Math.max(dp0[i-1][j-1] - prices[i],dp1[i-1][j]);
            }
        }
        return dp0[prices.length-1][k];



    }
}
