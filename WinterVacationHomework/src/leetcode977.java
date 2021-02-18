import java.util.Arrays;

/**
 * @ClassName leetcode977
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/18/17:25
 */
public class leetcode977 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
