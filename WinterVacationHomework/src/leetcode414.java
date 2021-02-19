import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName leetcode414
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/19/23:02
 */
public class leetcode414 {
    public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int[] aa = new int[set.size()];
        for (int i = 0; i < aa.length; i++) {
           // aa[i] = set.
        }
        Arrays.sort(aa);
        if (aa.length < 3) {
            return aa[0]>aa[1]?aa[0]:aa[1];
        }
        return aa[aa.length - 3];
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        System.out.println(thirdMax(ints));
    }
}
