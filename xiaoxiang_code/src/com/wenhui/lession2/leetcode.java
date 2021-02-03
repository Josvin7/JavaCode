package com.wenhui.lession2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName com.wenhui.lession2.leetcode
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/02/19:22
 */
public class leetcode {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 1; i < nums.length; i++) {
            if (queue.size() < k) {
                queue.offer(nums[i]);
            }else if (nums[i] > queue.peek()) {
                queue.poll();
                queue.offer(nums[i]);
            }
        }
        return queue.peek();

    }

    public static void main(String[] args) {

    }
}
