/**
 * @ClassName leetcode27
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/19/10:01
 */
public class leetcode27 {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                int tmp = nums[i];
                nums[i] = nums[len-1];
                nums[len-1] = tmp;
                len--;
                i--;
            }
        }
        return len;
    }
}
