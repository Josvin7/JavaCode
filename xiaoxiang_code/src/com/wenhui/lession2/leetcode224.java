package com.wenhui.lession2;

import java.util.Stack;

/**
 * @ClassName leetcode224
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/02/18:34
 */
public class leetcode224 {

    public int calculate(String s) {
        Stack<Integer> num_stack = new Stack<>();
        Stack<Character> symbol_stack = new Stack<>();

        int len = s.length();
        int flag = 0;
        String str = "";
        int tmp ;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                tmp = Integer.parseInt(str);
                num_stack.push(tmp);
                i++;
                str = "";
            }
            else if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                tmp = Integer.parseInt(str);
                num_stack.push(tmp);

                flag = 0;
                str = "";

            }

            else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                tmp = Integer.parseInt(str);
                num_stack.push(tmp);
                flag = 1;
                symbol_stack.push(s.charAt(i));
                str = "";
            }
            else if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                str += s.charAt(i);
            }

            if (flag == 1 ) {
            }

        }
        return 0;

    }
}
