import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Test
 * @Description $
 * {"abcd"
 * "abcde"}
 * @Author Fangwenhui
 * @Date 2020/12/18/12:10
 */
public class Test {
    /// 找不同



    public static char findTheDifference1(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        int ans = 0;
        for (int i = 0; i < lent - 1; i++) {
            ans += t.charAt(i)-s.charAt(i);
            System.out.println(ans);
        }
       ans +=t.charAt(lent-1);
        System.out.println(ans);
        return (char)(ans);
    }
    public char findTheDifference(String s, String t) {
        char ans =0;
        for (int i = 0; i <s.length() ; i++) {
            ans ^= ((s.charAt(i))^(t.charAt(i)));
        }
        return (char)(ans^t.charAt(t.length()-1));
    }

    public char findTheDifference11(String s, String t) {
        Map<Character,Integer> hashMap = new HashMap();
        for (int i = 0; i <s.length() ; i++) {
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i <t.length() ; i++) {
            hashMap.put(t.charAt(i),hashMap.getOrDefault(t.charAt(i),0)-1);
            if(hashMap.get(t.charAt(i)) < 0) {
                return t.charAt(i);
            }

        }
        return ' ';

    }

    public static void main(String[] args) {
        String str1 = "asd";
        String str2 = "asdf";

        char ans = findTheDifference1(str1, str2);
        System.out.println(ans);
    }
}
