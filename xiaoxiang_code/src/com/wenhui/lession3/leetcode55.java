package com.wenhui.lession3;

import java.util.Arrays;

/**
 * @ClassName leetcode55
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/04/19:56
 */
public class leetcode55 {


    public static boolean canJump3(int[] nums) {
        int[] index = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i] = i + nums[i];
        }
        int max_index = index[0];
        int jump = 0;
        while (jump < nums.length && jump <= max_index) {
            jump++;
            max_index = Math.max(max_index, index[jump]);
        }
        if (jump == nums.length) {
            return true;
        }
        return false;
    }
















        public static boolean canJump2(int[] nums) {
        int maxStep = 0;// 最大到达的位置的下标
        for (int i = 0; i < nums.length ; i++) {
            // i如果大于最大位置的下标则返回flase
            if (i > maxStep) {
                return false;
            }
            // 更新最大位置下标
            maxStep = Math.max(maxStep, i + nums[i]);
        }
        return true;
    }
    public static boolean canJump(int[] nums) {
        boolean[] isCan = new boolean[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            // j = 0;tmp = 3
            for (int j = i,k=0; k++ < tmp && j < isCan.length; j++) {
                isCan[j] = true;
            }
        }
        for (boolean nn : isCan) {
            if (!nn) {
                return false;
            }
        }
        return true;

    }
    public static boolean canJump1(int[] nums) {
        boolean[] isCan = new boolean[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            // j = 0;tmp = 3
            for (int j = i,k=0; k++ < tmp && j < isCan.length; j++) {
                isCan[j] = true;
            }
            if (!isCan[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] num = {3,2,1,0,4};
        System.out.println(canJump(num));
    }
}
