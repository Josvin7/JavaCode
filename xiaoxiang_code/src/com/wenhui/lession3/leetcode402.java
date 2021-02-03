package com.wenhui.lession3;

import javax.swing.*;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * @ClassName leetcode402
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/03/20:32
 */
public class leetcode402 {

    public static String removeKdigits2(String num, int k) {
        String ans = "";
        Stack<Integer> S = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            int tmp = num.charAt(i) - '0';
            while (!S.isEmpty() && k > 0 && S.peek() > tmp) {
                S.pop();
                k--;
            }
            if (S.isEmpty() || tmp != 0) {
                S.push(tmp);
            }


        }
        while (!S.isEmpty() && k-- > 0) {
            S.pop();
        }
        while (!S.isEmpty()) {
            ans = S.pop() + ans;
        }
        return ans.equals("") ? "0" : ans;
    }



    public static String removeKdigits(String num, int k) {
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            // k大于0，栈不为空，栈顶元素大于num【i】就可以删掉栈顶元素，这样才是最小的结果
            while (k > 0  && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            // 否则入栈
            stack.push(num.charAt(i));
        }
        // 有可能是12345，这样的，K大于0，直接从栈顶删就好了
        while (!stack.isEmpty() && k-- > 0) {
            stack.pop();
        }
        //拼接起来
        while (!stack.isEmpty()) {
            ans = stack.pop() + ans;
        }
        // 处理一下前导0
        int count = 0;
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        ans = ans.substring(count) ;
        return ans.equals("")?"0":ans;
    }


    public static void main(String[] args) {
        System.out.println(removeKdigits("10", 1));
    }
    public String removeKdigits1(String num, int k) {
        // 10 2
        Queue<Character> queue = new LinkedList<>();
        // 112   1
        for (int i = 0; i < num.length(); i++) {
            if (queue.isEmpty()) {
                queue.offer(num.charAt(i));
                continue;
            }
            if (k > 0) {
                if (queue.peek() > num.charAt(i)) {
                    queue.poll();
                    queue.offer(num.charAt(i));
                    k--;
                } else if (queue.peek() == num.charAt(i)) {
                    queue.offer(num.charAt(i));

                } else {
                    k--;
                }

            } else {
                queue.offer(num.charAt(i));
            }
        }
        while (!queue.isEmpty() && (queue.peek() == '0' || k > 0)) {

            queue.poll();
            k--;
        }
        String ans = "";
        while (!queue.isEmpty()) {

            ans = ans + queue.poll();
        }
        if (ans == "") {
            return "0";
        }
        return ans;

    }
}
