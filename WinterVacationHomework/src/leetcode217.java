import java.util.Arrays;

/**
 * @ClassName leetcode217
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/18/12:20
 */
public class leetcode217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
