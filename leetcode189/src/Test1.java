/**
 * @ClassName Test1
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/08/12:50
 */
public class Test1 {
    public static String countAndSay(int n) {
        String str = "1";
        String ans = "";
        for (int i = 1; i < n; i++) {
            ans = "";
            int count = 1;
            for (int j = 0; j < str.length() ; j++) {

                if (j !=str.length()-1 && str.charAt(j) == str.charAt(j+1)) {
                    count++;
                }else {
                    ans += "" +count+str.charAt(j);
                    //System.out.println(strings[i]);
                    count = 1;
                }
            }
            str = ans;
        }
        return ans;
    }
}
