import java.util.Arrays;

/**
 * @ClassName leetcode628
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/20/23:24
 */
public class leetcode628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
    }
}
