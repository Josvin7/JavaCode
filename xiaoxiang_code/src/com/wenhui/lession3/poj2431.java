package com.wenhui.lession3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @ClassName poj2431
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/05/20:14
 */
public class poj2431 {
    // L ：起点到终点的距离
    // P :起点初始汽油量
    // stop[i][0] 加油站到终点的距离
    // stop[i][1] 加油站汽油量
    public static int get_mininum_stop(int L, int P, int[][] stop) {

        // 存储汽油量的最大堆
        Queue<Integer> big_queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        int result = 0; // 记录加过几次油
        Arrays.sort(stop, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        //Arrays.sort(stop, ((o1, o2) -> o1[0] - o2[0]));// 以停靠点至终点距离从大到小排序
        // 遍历每一个停靠点
        for (int i = 0; i < stop.length; i++) {
            int dis = L - stop[i][0];
            while (!big_queue.isEmpty() && P < dis ) {
                P += big_queue.poll();
                result++;
            }
            if (big_queue.isEmpty() && P < dis) {
                return -1;
            }
            P = P - dis;
            L = stop[i][0];
            big_queue.offer(stop[i][1]);
        }
        return result;
    }

    public static void main(String[] args) {

        int L = 25;
        int P = 10;
        // 终点（0，0）加进去
        int[][] stop = new int[][]{{4, 4}, {5, 2}, {11, 5}, {15, 10}};//,{0,0}};
        System.out.println(get_mininum_stop(L, P, stop));

    }
}
