import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/10/20:06
 */
public class Test {

    public List<String> summaryRanges(int[] nums) {
        List<String> list = new LinkedList<>();
        int len = nums.length;
        int tmp = 0;
        for (int i = 0; i < len; ) {
            // 当两个小标值的差值等于元素值的差值，则他们就是连续的
            while (tmp < len && nums[tmp] - nums[i] == tmp - i ) {
                tmp++;
            }
            // 单独处理只有一个元素的情况
            if (tmp - 1 == i) {
                list.add("" + nums[tmp - 1]);
            }else {
                String str = nums[i]+"->"+nums[tmp-1];
                list.add(str);
            }
            // i向前移动
            i = tmp;
        }
        return list;
    }

}
