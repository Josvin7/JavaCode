/**
 * @ClassName Interview13
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/16/13:33
 */
public class Interview13 {

    public int movingCount(int m, int n, int k) {
        // 需要一个监视数组，记录位置是否被访问
        boolean[][] visit = new boolean[m][n];
        return movingCountHelper(m, n, 0, 0, k, visit);

    }

    private int movingCountHelper(int m, int n, int i, int j, int k, boolean[][] visit) {
        // 递归返回条件：越界，该位置已经被访问，各个位数之和大于k
        if (i < 0 || j < 0 || i >= m || j >= n || visit[i][j] == true || digit_num(i, j) > k) {
            return 0;
        }
        // 程序走到这里说明，该位置没有被访问，并且没有越界，符合访问条件，则将其置为true

        visit[i][j] = true;

        // 递归搜索四个方向
        return 1 + movingCountHelper(m, n, i, j - 1, k,visit) + movingCountHelper(m, n, i, j + 1, k,visit) + movingCountHelper(m, n, i + 1, j,k, visit) + movingCountHelper(m, n, i - 1, j, k,visit);
    }

    // 计算（i，j），i和j各个位数之和
    private int digit_num(int i, int j) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        while (j  != 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum;

    }
}
