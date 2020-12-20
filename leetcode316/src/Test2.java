import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName Test2
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/20/19:32
 */
public class Test2 {
    public static String removeDuplicateLetters(String s) {
        // 记录最后出现的下标
        int len = s.length();
        char[] array = s.toCharArray();
        int[] index = new int[26];
        for (int i = 0; i < len; i++) {
            index[array[i] - 'a'] = i;
        }
        boolean[] isexist = new boolean[26];// 初始化为false

        Deque<Character> stak = new ArrayDeque<>();


        for (int i = 0; i < len; i++) {
            if(isexist[array[i] - 'a']) {
                continue;
            }
            while(  !stak.isEmpty() && stak.peekLast() > array[i] && index[stak.peekLast() - 'a'] > i) {
                Character top = stak.removeLast();
                isexist[top - 'a'] = false;
            }
            stak.addLast(array[i]);
            isexist[array[i] - 'a'] = true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c:stak
             ) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
