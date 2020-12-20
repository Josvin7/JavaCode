import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName Demo
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/20/15:46
 */
public class Demo {
    public static String removeDuplicateLetters1(String s) {
        int len = s.length();
        char[] charArray = s.toCharArray();// 转为字符数组
        int[] lastIndex = new int[26];
        for (int i = 0; i < len ; i++) {
            lastIndex[charArray[i] - 'a'] = i;//保存字符串中字符最后出现的下标，后边用于判断该元素后边还会不会出现
        }
        Deque<Character>  stack = new ArrayDeque<>();// 双端队列尾插尾删当作栈使用
        boolean[] visited = new boolean[26];// 监视栈里边的元素
        for (int i = 0; i < len ; i++) {
            if (visited[charArray[i] - 'a']) {
                continue;// 如果栈内已经出现，那么这里为什莫可以直接舍弃呢，如果栈里边已经存在，如果不丢弃则不能保证最小字典序
                // 如果当前看到的字母已经在栈中，则它一定不是某一段单点递增字母的最后一个字母，所以可以直接舍弃
            }
            while (!stack.isEmpty() && stack.peekLast() >  charArray[i] && lastIndex[stack.peekLast() - 'a'] > i) {
                //栈顶元素大于字符数组的元素，并且后边还会出现的话就移出栈顶元素
                Character top = stack.removeLast();
                visited[top - 'a'] = false;// 维护visited
            }// 注意这里是while循环，循环结束后保证栈里边都是按照字典序排好的
            stack.addLast(charArray[i]);
            visited[charArray[i] - 'a'] = true;

        }
        // 程序走到这里，栈里边保存的就是结果
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : stack) {
            //System.out.println(c);//注意的是这里用的是双端队列，从头在加入StringBuffer 这样就避免使用栈后还需要反转的问题
            stringBuilder.append(c);
            //System.out.println(stringBuilder.toString());
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters1("aqaqwe").toString());

    }
}
