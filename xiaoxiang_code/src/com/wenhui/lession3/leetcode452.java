package com.wenhui.lession3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName leetcode452
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/05/11:25
 */
public class leetcode452 {


    public static void main(String[] args) {
        System.out.println(-2147483646 - 2147483646);

    }
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        // 根据数组左端点的大小对气球进行排序
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];// ? 1 : -1;
            }
        });

        int shoot_num = 1;//初始化弓箭手数量为1
        // 初始化射击区间
        int shoot_begin = points[0][0];
        int shoot_end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (shoot_end >= points[i][0]) {
                shoot_begin = points[i][0];
                if (shoot_end > points[i][1]) {
                    shoot_end = points[i][1];
                }
            } else {
                shoot_num++;
                shoot_begin = points[i][0];
                shoot_end = points[i][1];
            }
        }
        return shoot_num;
    }
}
