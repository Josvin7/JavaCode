import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName leetcode925
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/18/12:33
 */
public class leetcode925 {
    public boolean isLongPressedName(String name, String typed) {
        // 没有考虑字符串顺序
        /*int[] opp = new int[26];
        for (int i = 0; i < typed.length(); i++) {
            opp[typed.charAt(i) - 'a']++;
        }
        for (int i = 0; i < name.length(); i++) {
            if (opp[name.charAt(i) - 'a'] > 0) {
                opp[name.charAt(i) - 'a']--;
            } else {
                return false;
            }
        }
        return true;*/


        int i = 0;
        int j = 0;
        while (true) {
            int count1 = 0;
            int count2 = 0;
            while (i < name.length() - 1) {
                if (name.charAt(i) == name.charAt(i + 1)) {
                    count1++;
                } else {
                    break;
                }
                i++;
            }
            while (j < typed.length() - 1) {
                if (typed.charAt(j) == typed.charAt(j + 1)) {
                    count2++;
                } else {
                    break;
                }
                j++;
            }
            if (count1 > count2 || name.charAt(i) != typed.charAt(j)) {
                i++;
                j++;
                return false;
            }
            if (i == name.length() && j == typed.length()) {
                return true;
            }
        }
        //return true;
    }
}
