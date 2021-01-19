/**
 * @ClassName leetcode35
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/19/10:15
 */
public class leetcode35 {

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums[nums.length-1] < target) {
            return nums.length;
        }
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        // [0 4)             2
        // [0,2)          1
        // [0,1)       0
        int[] array = {1, 3, 4, 5};
        System.out.println(searchInsert(array, 2));
    }
}
