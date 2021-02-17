import java.util.Arrays;

/**
 * @ClassName leetcode136
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/17/23:32
 */
public class leetcode136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }


    /*
    *
    * 异或解法（判断重复元素）
    * */
}
