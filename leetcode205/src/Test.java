import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Test
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/27/13:58
 */
public class Test {

    public static void main(String[] args) {
        if (true) {
            System.out.println("123");
        } else if (true) {
            System.out.println("1234");
        }
    }

    public boolean isIsomorphic(String s, String t) {
        int[] sm = new int[128];
        int[] tm = new int[128];

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        for (int i = 0; i < s.length() ; i++) {
            if (sm[sc[i]] != tm[tc[i]]) {
                return false;
            }

            sm[sc[i]] = tm[tc[i]] = i + 1;

        }
        return true;
    }
    public boolean isIsomorphic1(String s, String t) {
        //输入: s = "egg", t = "add"
        //输出: true
        int[] sarray = new int[128];
        int[] tarray = new int[128];

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (sarray[s.charAt(i)] != tarray[t.charAt(i)]) {
                return false;
            }
            sarray[s.charAt(i)]++;
            tarray[t.charAt(i)]++;
        }
        return true;
    }
}
