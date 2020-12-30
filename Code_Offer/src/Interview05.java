/**
 * @ClassName Interview05
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/30/15:30
 */
public class Interview05 {
    public String replaceSpace(String s) {
        //输入：s = "We are happy."
        //输出："We%20are%20happy."
        //return s.replaceAll(" ","%20");
        int len = s.length();
        char[] array = new char[3 * len]; // 按照最坏打算扩容
        int size = 0; // 记录下标位置
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ' ') {
                array[size++] = s.charAt(i);
            } else {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            }
        }
        String ans = new String(array, 0, size);// 将有效部分转为字符串
        return ans;

    }
}
