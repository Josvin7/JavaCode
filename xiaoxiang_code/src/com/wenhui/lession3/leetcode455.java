package com.wenhui.lession3;

import java.util.Arrays;

/**
 * @ClassName leetcode455
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/03/15:48
 */



public class leetcode455{

    public static void main(String[] args) {
        int[] rmb = {100, 50, 25, 7, 3, 1};
        int num = rmb.length;
        int X = 14;
        int count = 0;
        for (int i = 0; i < num ; i++) {
            int tmp = X / rmb[i];
            count += tmp;
            X -= tmp * rmb[i];
            System.out.println("需要面额为" + rmb[i] + "的" + tmp + "张， 剩余需支付RMB " + X + "元");

        }
        System.out.println("总共需要支付" + count + "张");
    }
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookie = 0;
        while (cookie < s.length && child < g.length) {
            if (g[child] <= s[cookie]) {
                child++;
            }
            cookie++;
        }
        return child;
    }
}