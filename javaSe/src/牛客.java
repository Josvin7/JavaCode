import java.util.Arrays;

/**
 * @ClassName 牛客
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/31/11:06
 */
public class 牛客 {
    public static class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         * 计算两个数之和
         * @param s string字符串 表示第一个整数
         * @param t string字符串 表示第二个整数
         * @return string字符串
         */
       /* public String solve (String s, String t) {
            // write code here
            //"1","99"
            //

            char[] chars = s.toCharArray();
            char[] chars1 = t.toCharArray();

        }*/

        private static int[] reverse(int[] num) {
            int len = num.length-1;
            for (int i = 0; i <= len; i++) {
                int tmp = num[i];
                num[i] = num[len];
                num[len] = tmp;
                len--;
            }
            return num;

        }

        public static void main(String[] args) {
            int[] num = {1, 2, 3,  5};
            System.out.println(Arrays.toString(reverse(num)));
        }

    }
}
