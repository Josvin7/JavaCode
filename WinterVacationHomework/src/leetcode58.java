/**
 * @ClassName leetcode58
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/17/22:30
 */
public class leetcode58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
