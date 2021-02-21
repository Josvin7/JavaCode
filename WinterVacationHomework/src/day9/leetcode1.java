package day9;

/**
 * @ClassName leetcode1
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/21/14:18
 */
public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = nums[i];
                    ans[1] = nums[j];
                    return ans;
                }
            }
        }
        return ans;
    }
}
