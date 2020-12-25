import java.util.Arrays;

/**
 * @ClassName leetcode455
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/25/12:57
 */
public class leetcode455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);//胃口
        Arrays.sort(s);//饼干大小
        int num = 0;
        for (int i = 0,j=0; i < s.length && j < g.length; i++) {
            if (g[j] <= s[i]) {
                num++;
                j++;
            }
        }
        return num;
    }
}
