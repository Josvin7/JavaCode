/**
 * @ClassName leetcode724
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/19/19:48
 */
public class leetcode724 {


    public static int pivotIndex2(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int tt : nums) {
            sum1 += tt;
        }

        for (int i = 0; i < nums.length; i++) {
            if (sum2 * 2 == sum1 - nums[i]) {
                return i;
            }
            sum2 += nums[i];
        }
        return -1;
    }
    
    public static int pivotIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int sum1 = 0;
        int sum2 = 0;
        while (start != end) {
            if (sum1 < sum2) {
                //start++;
                sum1 += nums[start];
                start++;
            } else if (sum1 > sum2) {

                sum2 += nums[end];
                end--;
            } else {
                if (nums[start] < nums[end]) {
                    sum1 += nums[start];
                    start++;
                } else {
                    sum2 += nums[end];
                    end--;
                }

                if (start + 1 == end && sum1 == sum2) {
                    return start;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //
    }
}
