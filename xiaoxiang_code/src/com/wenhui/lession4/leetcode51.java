package com.wenhui.lession4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName leetcode51
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/10/22:40
 */
public class leetcode51 {
    public static void main(String[] args) {
        int n = 10;
        int[][] mark = new int[n][n];
        //put_down_the_queen(2, 3, mark);
    }


    public List<List<String>> solveNQueens(int n) {
        List<List<String>> listList = new LinkedList<>();
        int[][] mark = new int[n][n];
        char[][] chars = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chars[i][j] = '.';
            }
        }

        generate(0, n, chars, listList, mark);
        return listList;
    }

    // 代表完成了几个皇后
    private void generate(int k, int n, char[][] chars, List<List<String>> listList, int[][] mark) {
        if (k == n) {
            List<String> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                String str = "";
                for (int j = 0; j < n; j++) {
                    str += chars[i][j];
                }
                list.add(str);
            }
            listList.add(new LinkedList<>(list));
            return;
        }
        // 按顺序尝试第0 - n-1列
        for (int i = 0; i < n; i++) {
            if (mark[k][i] == 0) {
                int[][] tmp = mark;
                chars[k][i] = 'Q';
                put_down_the_queen(k, i, mark);
                generate(k + 1, n, chars, listList, mark);
                mark = tmp;
                chars[k][i] = '.';
            }
        }
    }

    private void put_down_the_queen(int x, int y, int[][] mark) {
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
        mark[x][y] = 1;//放置皇后位置置为1
        // 8个攻击方向置为1
        for (int i = 1; i < mark.length; i++) {
            for (int j = 0; j < 8; j++) {
                int new_x = x + i * dx[j];// 新的位置向8个方向延申，每个方向最大到N-1
                int new_y = y + i * dy[j];
                if (new_x >= 0 && new_x < mark.length && new_y >= 0 && new_y < mark.length) {
                    mark[new_x][new_y] = 1;
                }
            }
        }
    }
}
