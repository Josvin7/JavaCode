package com.wenhui.lession3;

/**
 * @ClassName leetcode376
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/03/17:09
 */
public class leetcode376 {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        final int BEGIN = 0;
        final int UP = 1;
        final int DOWN = 2;
        int START = BEGIN;
        int max_length = 1;// 摇摆序列最大长度最小为1
        for (int i = 0; i < nums.length - 1; i++) {
            switch (START) {
                case BEGIN:
                    if (nums[i] < nums[i + 1]) {// 上升趋势
                        START = UP;
                        max_length++;
                    } else if (nums[i] > nums[i + 1]) {// 下降趋势
                        START = DOWN;
                        max_length++;
                    }
                    // 相等继续原地打转
                    break;
                case UP:
                    // 上升趋势进来的，下一个状态还是上升，则不加，状态不变
                    if (nums[i] < nums[i + 1]) {
                        START = UP;
                        // UP->DOWN
                    } else if (nums[i] > nums[i + 1]) {

                        START = DOWN;
                        max_length++;
                    }
                    // UP—>UP
                    break;
                case DOWN:
                    // DOWN->UP
                    if (nums[i] < nums[i + 1]) {
                        START = UP;
                        max_length++;
                        //DOWN->DOWN
                    } else if (nums[i] > nums[i + 1]) {
                        START = DOWN;
                    }
                    break;

            }
        }
        return max_length;
    }


































    public int wiggleMaxLength1(int[] nums) {
        int count = 2;
        int maxCount = 1;
        int[] flag = new int[nums.length];
        //[1,7,4,1,2,5]
        //
        // -6 3 3 7 -3
        flag[0] = nums[0] - nums[1];//-6
        for (int i = 1; i < nums.length - 1; i++) {
            flag[i] = nums[i] - nums[i + 1];//3   i = 1  i = 2   3
            if (flag[i] * flag[i - 1] < 0) {
                count++;
            } else {
                count = 2;
            }
            if (count > maxCount) {
                maxCount = count;
            }

        }

        return maxCount;
    }
}
