/**
 * @ClassName homework27
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/07/17:29
 */
public class homework27 {
    /*
     * 实现方法 compareTo, 能够实现按照字典序比较字符串大小
     */
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        int num = compareTo(str1,str2);
        System.out.println(compareTo(str1, str2));
        System.out.println(str1.compareTo(str2));
    }

    private static int compareTo(String str1, String str2) {
        char[] chars = str1.toCharArray();
        char[] chars1 = str2.toCharArray();

        int len1 = str1.length();
        int len2 = str2.length();
        int min = len1 >= len2 ? len2 : len1;
        for (int i = 0; i < min; i++) {
            if (chars[i] != chars1[i]) {
                return chars[i] - chars1[i];
            }
        }
        return len1 - len2;
    }

}
