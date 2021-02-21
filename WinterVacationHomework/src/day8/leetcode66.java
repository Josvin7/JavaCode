package day8;

/**
 * @ClassName leetcode66
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/21/12:46
 */
public class leetcode66 {
    public int[] plusOne(int[] digits) {
        int sign = 0;
        for (int i = digits.length - 1; i > 0; i--) {
            if (i == digits.length - 1) {
                digits[i] = digits[i] + 1 + sign;
            } else{
                digits[i] = digits[i] + sign;}
            if (digits[i] > 9){
                digits[i] = digits[i] - 10;
                sign = 1;
            } else   {
                sign = 0;
            }
        }
        if (digits.length == 1) {
            digits[0] = digits[0] + 1 + sign;

        } else {
            digits[0] = digits[0] + sign;

        }
        if (digits[0] > 9) {
            digits[0] = digits[0] - 10;
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            for (int i = 1; i < digits.length + 1; i++) {
                ans[i] = digits[i - 1];
            }
            return ans;
        }
        return digits;

    }
}
