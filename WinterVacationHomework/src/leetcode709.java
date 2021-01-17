import java.util.zip.ZipEntry;

/**
 * @ClassName leetcode709
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/17/10:52
 */
public class leetcode709 {
    public String toLowerCase0(String str) {
        ///str.charAt(1) = (char) (str.charAt(1) + 32);
        if ("" == str) {
            return str;
        }
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                char tmp = (char) (str.charAt(i) - 'A' + 'a');
                ans += tmp;
            }
            else{ ans += str.charAt(i);}

        }

        return ans;
    }


    public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        for (char ch:str.toCharArray()
             ) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
