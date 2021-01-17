/**
 * @ClassName leetcode189
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/17/11:28
 */
public class leetcode189 {
    public void rotate(int[] nums, int k) {

        if (nums.length == 0 || k == 0) {
            return;
        }
        k = k % nums.length;
        rotateHelper(nums,0,nums.length-k);
        rotateHelper(nums,nums.length-k+1,nums.length-1);
        rotateHelper(nums,0,nums.length-1);
    }

    private void rotateHelper(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
}
