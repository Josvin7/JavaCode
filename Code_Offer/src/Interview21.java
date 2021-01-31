import java.util.Arrays;

/**
 * @ClassName Interview21
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/31/20:45
 */
public class Interview21 {
    public static int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left <right && nums[left] % 2 != 0) {
                left++;
            }
            while ( left < right&& nums[right] % 2 == 0) {
                right--;
            }

            if (left < right) {
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 6, 5, 1252, 62, 72};
        System.out.println(Arrays.toString(exchange(nums)));
    }
}
