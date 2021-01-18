/**
 * @ClassName Interview14
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/18/12:54
 */
public class Interview14 {
    public int cuttingRope(int n) {
        //    给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。
        //
        int[] dp = new int[n + 1];// 长度为 n 时最大的乘积
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                // j来遍历 i 之前的基础上
                dp[i] = Math.max( dp[j]*(i-j), dp[i]);
            }
        }
        return dp[n];
    }
}
