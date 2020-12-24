import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/23/11:06
 */
public class Test {

    /*
    * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
    *
    * */
    public int firstUniqChar(String s) {

        //char[] array = s.toCharArray();
        int[][] index = new int[26][2];
        for (int i = 0; i < s.length(); i++) {
            index[s.charAt(i) - 'a'][0] = i;
            index[s.charAt(i) - 'a'][1] = index[s.charAt(i) - 'a'][1] + 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (index[s.charAt(i)-'a'][1] == 1) {
                return index[s.charAt(i)-'a'][0];
            }
        }
        return -1;

    }



    public int firstUniqChar1(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;

    }
}
