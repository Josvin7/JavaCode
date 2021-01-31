/**
 * @ClassName Demo1
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/31/12:17
 */

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(helper("12345689", "789"));
    }

    public static String helper(String num1, String num2) {
        while(num1.length() < num2.length()) {
            num1 = "0" + num1;     //预处理成等长字符串
        }
        while(num2.length() < num1.length()) {
            num2 = "0" + num2;     //预处理成等长字符串
        }
        StringBuilder s1 = new StringBuilder(num1);
        StringBuilder s2 = new StringBuilder(num2);
        StringBuilder r = new StringBuilder();
        int flag =0;                                             //用flag标记借位
        // 从左边（个位）开始计算
        for (int i = s1.length() - 1; i >= 0; --i) {
            int sum = f(s1.charAt(i)) + flag + f(s2.charAt(i));
            flag = 0; // 注意flag 清零
            r.append(sum % 10);
            if (sum > 9) {
                flag = 1;
            }
        }
        String str =  r.reverse().toString();// 注意要反转
        // 进位情况
        if (flag == 1) {
            str = 1 + str;
        }
        // 注意输出 0000 前导0的情况
        int len = str.length();
        int index = 0;
        while( index < len && str.charAt(index) == '0' ) {
            index++;
        }
        if (index == len) {
            return "0";
        }else {
            return str.substring(index, len);
        }
    }
    public static int f(char c) { return c - '0';}     //字符变数字
}

