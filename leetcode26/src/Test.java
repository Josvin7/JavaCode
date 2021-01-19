/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/19/12:33
 */
public class Test {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 0;
        for (int i = 1; i < nums.length; ) {


            if (i < nums.length && nums[i] == nums[i - 1]) {
                i++;
            } else {
                nums[k++] = nums[i-1];
            }

        }
        return k;

    }

    public static void main(String[] args) {

    }
}
