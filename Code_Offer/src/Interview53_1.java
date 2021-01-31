/**
 * @ClassName Interview53_1
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/31/23:31
 */
public class Interview53_1 {
    public int search(int[] nums, int target) {
        /*int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
        */

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                mid = left + 1;
            } else {
                mid = right;
            }
        }
        return 2;
    }
}
