import com.sun.scenario.effect.impl.prism.ps.PPStoPSWDisplacementMapPeer;

/**
 * @ClassName leetcode917
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/19/18:59
 */
public class leetcode917 {
    /*
    * 输入："a-bC-dEf-ghIj"
      输出："j-Ih-gfE-dCba"
    * */
    public static  String reverseOnlyLetters(String S) {
        char[] stringBuilder = S.toCharArray();
        int start = 0;
        int end = S.length() - 1;
        while (start < end) {
            if ((S.charAt(start) < 'a' || S.charAt(start) > 'z') && (S.charAt(start) < 'A' || S.charAt(start) > 'Z')) {
                start++;
            } else if ((S.charAt(end) < 'a' || S.charAt(end) > 'z') && (S.charAt(end) < 'A' || S.charAt(end) > 'Z')) {
                end--;
            } else {
               char tmp = S.charAt(start);
                stringBuilder[start++] = S.charAt(end);
                stringBuilder[end--] = tmp;
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("asd-ase-r-t"));
    }
}
