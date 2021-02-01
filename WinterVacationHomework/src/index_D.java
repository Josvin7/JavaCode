/**
 * @ClassName index_D
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/01/20:36
 */

//实现方法 indexOf, 能够找出字符串子串存在的位置
public class index_D {
    public static void main(String[] args) {
        String str = "qas";
        String str1 = "asa";

        System.out.println(str.indexOf(str1));
        System.out.println(indexOf(str, str1));
    }

    private static int indexOf(String str, String str1) {
        for (int i = 0; i < str.length(); i++) {//5
            int tmp = i;
            for (int j = 0; str1.length() <= str.length()-i &&j < str1.length() ; j++) {//4
                if ( str.charAt(tmp) != str1.charAt(j)) {//tmp = 1 2 3
                    break;
                }
                tmp++;
            }
            if (tmp - i == str1.length()) {
                return i;
            }
        }
        return -1;
    }
}
