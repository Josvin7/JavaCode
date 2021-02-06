package com.wenhui.lession4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName leetcode78
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/06/18:49
 */
public class leetcode78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>();
        int all_set = 1 << nums.length;
        for (int i = 0; i < all_set; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
               // System.out.println(i & (1 << j));
                if ((i & (1 << j)) != 0) {
                    list.add(nums[j]);
                }
            }
            listList.add(list);
        }
        return listList;
    }
    public static List<List<Integer>> subsets1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> listList = new ArrayList<>();
        listList.add(list);
        subsetsHelper(0, nums, list, listList);
        return listList;
    }
    private static void subsetsHelper(int i, int[] nums, List<Integer> list, List<List<Integer>> listList) {
        if (i >= nums.length) {
            return;
        }
        list.add(nums[i]);
        listList.add(new ArrayList<>(list));//
        subsetsHelper(i + 1, nums, list, listList);
        list.remove(list.size() - 1);
        subsetsHelper(i + 1, nums, list, listList);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets1(nums));
    }
}
