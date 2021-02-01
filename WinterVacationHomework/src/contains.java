/**
 * @ClassName contains
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/01/21:25
 */
public class contains {
    public static void main(String[] args) {
        String str = "qas";
        String str1 = "as";

        System.out.println(str.contains(str1));
        System.out.println(contains1(str, str1));
    }

    private static boolean contains1(String str, String str1) {
        for (int i = 0; i < str.length(); i++) {//5
            int tmp = i;
            for (int j = 0; str1.length() <= str.length()-i &&j < str1.length() ; j++) {//4
                if ( str.charAt(tmp) != str1.charAt(j)) {//tmp = 1 2 3
                    break;
                }
                tmp++;
            }
            if (tmp - i == str1.length()) {
                return true;
            }
        }
        return false;
    }


}
