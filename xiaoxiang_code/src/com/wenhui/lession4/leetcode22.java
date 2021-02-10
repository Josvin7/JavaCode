package com.wenhui.lession4;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName leetcode22
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/10/20:50
 */
public class leetcode22 {


    public  List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        generateParenthesisHelper("", n, n, list);
        return list;
    }

    /*
    left:当前还可以放置左括号的数量
    right：当前还可以放置右括号的数量
    */
    private void generateParenthesisHelper(String str, int left, int right, List<String> list) {
        if (left == 0 && right == 0) {
            list.add(str);
            return;
        }

        if (left > 0) {
            generateParenthesisHelper(str + "(", left - 1, right, list);
        }
//        左括号如果大于右括号就可以放置右括号，在这里left和right是括号剩余，则应该left剩的越少更应该放置右括号

        if (left < right) {
            generateParenthesisHelper(str + ")", left, right - 1, list);
        }
    }















    public static List<String> generateParenthesis1(int n) {
        List<String> list = new LinkedList<>();
        generateParenthesisHelper1("", n, list);
        return list;
    }

    private static void generateParenthesisHelper1(String str, int n, List<String> list) {
        if (str.length() == 2 * n) {
            list.add(str);
            return;
        }

        generateParenthesisHelper1(str + "(", n, list);
        generateParenthesisHelper1(str + ")", n, list);
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis1(2));
    }
}
