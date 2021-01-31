import java.util.*;

/**
 * @ClassName Interview50
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/31/21:47
 */
public class Interview50 {

//    s = "abaccdeff"
//    返回 "b"
//
//    s = ""
//    返回 " "
    public static char firstUniqChar(String s) {
        HashMap<Character, Boolean> hashMap = new HashMap<>();
        for (char c:s.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, false);
            } else {
                hashMap.put(c, true);
            }
        }

        for (char c : s.toCharArray()) {
            if (!hashMap.get(c)) {
                return c;
            }
        }
        return ' ';



    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("asdfgf"));
    }
}
