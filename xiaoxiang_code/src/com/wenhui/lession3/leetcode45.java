package com.wenhui.lession3;

/**
 * @ClassName leetcode45
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/04/21:37
 */
public class leetcode45 {

    public int jump(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int current_max_index = nums[0];// 当前可到达的最远位置
        int pre_max_max_index = nums[0];// 遍历各个位置过程中，可到达最远位置
        int jump_min = 1;
        for (int i = 1; i < nums.length; i++) {
            if (i > current_max_index) {// 若无法再向前移动了，才进行跳跃
                jump_min++;
                current_max_index = pre_max_max_index;//更新当前可达到的最远位置
            }

            if (pre_max_max_index < nums[i] + i) {
                pre_max_max_index = nums[i] + i;
            }
        }
        return jump_min;
    }
}
