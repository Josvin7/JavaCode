import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Interview03
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/29/10:06
 */
public class Interview03 {

    /*
    *
输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3
    *
    * */
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len - 1; i++) {
            if (nums[i + 1] - nums[i] == 0) {
                return nums[i];
            }
        }
        return -1;
    }

    public int findRepeatNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }


    public int findRepeatNumber3(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (i != nums[i]) { // 注意在这里时while 循环可能 交换回来的数也不等于 i
                if (nums[i] != nums[nums[i]]) {
                    // 不等于则进行交换
                    int temp = nums[i];
                    nums[i] = nums[nums[i]];
                    nums[nums[i]] = temp;
                }else{
                    return nums[i];
                }
            }
        }
        return -1;
    }
    
}
