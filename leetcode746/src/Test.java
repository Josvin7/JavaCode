/**
 * @ClassName Test
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/21/9:42
 */
public class Test {

    public static  int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len+1];//
        dp[0] = 0;// 从 0 开始
       dp[1] = 0;// 从 1开始
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.min(dp[i-1]  + cost[i-1]  ,dp[i-2] + cost[i-2] );
            System.out.println(dp[i]);
        }
        return dp[len];
    }

    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }
}
