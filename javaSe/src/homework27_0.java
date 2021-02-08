/**
 * @ClassName homework27_0
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/07/17:39
 */
public class homework27_0 {


    /*
     * 实现方法 replace, 能够替换字符串中的某个部分
     * */
    public static void main(String[] args) {
        String str1 = "sdfgfdsa";
        String str2 = "sdfdsa";
        replace_my(str1, "sdf","fqwe");
        //System.out.println(str1.replace("sdf", "s"));
        System.out.println(str1);
    }

    private static void replace_my(String str1, String str2,String aim) {
        while (str1.contains(str2)) {
            str1 = String.format("%s%s%s", str1.substring(0, str1.indexOf(str2)), aim, str1.substring(str1.indexOf(str2) + str2.length(), str1.length()));
        }
    }


}
