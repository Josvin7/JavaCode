/**
 * @ClassName leetcode09
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/08/12:42
 */
public class leetcode09 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = Integer.toString(x);
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
