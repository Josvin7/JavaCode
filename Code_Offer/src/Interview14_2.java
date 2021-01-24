/**
 * @ClassName Interview14_2
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/23/10:39
 */
public class Interview14_2 {
    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        if (n == 4) {
            return 4;
        }
        int ans = 1;
        while (n > 4) {
            ans *= 3;
            ans %= 1000000007;
            n = n - 3;
        }
        if (n == 4) {
            return ans * 4;
        }
        // 最后n的值只有可能是：2、3、4。而2、3、4能得到的最大乘积恰恰就是自身值
        // 因为2、3不需要再剪了（剪了反而变小）；4剪成2x2是最大的，2x2恰巧等于4


        return (ans*n)%1000000007;
    }
}
