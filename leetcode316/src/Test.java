import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Test
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/20/12:41
 */
public class Test {

    /*
    * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
    * 去除重复字母
    * */
    public static String removeDuplicateLetters(String s) {
        int[] array = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            array[s.charAt(i) - 'a'] = 1;
        }
        String ans = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if(array[s.charAt(i) - 'a'] == 1 ) {
                ans +=s.charAt(i);
                System.out.println(ans);
                array[s.charAt(i) - 'a'] = 0;
            }
        }
        String reverse = new StringBuffer(ans).reverse().toString();
        return  reverse;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("aqaqwe").toString());
    }
}
